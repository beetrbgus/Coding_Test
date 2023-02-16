-- https://school.programmers.co.kr/learn/courses/30/lessons/131532
-- 년, 월, 성별 별로 상품을 구매한 회원수를 집계

-- 성별(GENDER)은 0 (남자) 또는 1(여자)
SELECT * FROM USER_INFO; -- 회원 정보
--
SELECT * FROM ONLINE_SALE; -- 상품 판매 정보

-- 조인하기
SELECT
    *
FROM
    ONLINE_SALE O
LEFT JOIN
    USER_INFO U
ON
    O.USER_ID = U.USER_ID
;

-- 연월로 묶기
SELECT
    *
FROM
    ONLINE_SALE O
LEFT JOIN
    USER_INFO U
ON
    O.USER_ID = U.USER_ID
GROUP BY
    DATE_FORMAT(O.SALES_DATE, '%y-%m')

-- 연,월, 성별로 묶기
SELECT
    DATE_FORMAT(O.SALES_DATE, '%y') AS 'YEAR',
        DATE_FORMAT(O.SALES_DATE, '%m') AS 'MONTH',
        GENDER,
    COUNT(GENDER)
FROM
    ONLINE_SALE O
        LEFT JOIN
    USER_INFO U
    ON
            O.USER_ID = U.USER_ID
GROUP BY
    DATE_FORMAT(O.SALES_DATE, '%y'),
    DATE_FORMAT(O.SALES_DATE, '%m'),
    GENDER
;

-- 연, 월, 성별로 묶은 회원의 구매자 수 구하기
-- 구매한 회원 수를 구할 때 같은 달에 한 회원이 2번 물건을 구매할 수도 있으니 DISTINCT
SELECT
    YEAR(O.SALES_DATE) AS 'YEAR',
    MONTH(O.SALES_DATE) AS 'MONTH',
    GENDER,
    COUNT(DISTINCT U.USER_ID)
FROM
    ONLINE_SALE O
    LEFT JOIN
    USER_INFO U
ON
    O.USER_ID = U.USER_ID
GROUP BY
    YEAR,
    MONTH,
    GENDER
HAVING
    U.GENDER IS NOT NULL
ORDER BY
    YEAR ASC,
    MONTH ASC,
    U.GENDER ASC
;