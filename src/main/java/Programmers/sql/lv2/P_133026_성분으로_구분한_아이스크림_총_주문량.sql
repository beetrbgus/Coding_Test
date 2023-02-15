-- https://school.programmers.co.kr/learn/courses/30/lessons/133026
-- 문제 : 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을
-- 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요.
-- 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요
SELECT * FROM FIRST_HALF; -- 상반기 주문 정보
SELECT * FROM ICECREAM_INFO; -- 아이스크림 성분 정보


-- 1. 조인하기
SELECT
    *
FROM
    FIRST_HALF F
        LEFT JOIN
    ICECREAM_INFO I
    ON
            F.FLAVOR = I.FLAVOR
;

-- 2. 성분으로 그룹짓기
SELECT
    *
FROM
    FIRST_HALF F
LEFT JOIN
    ICECREAM_INFO I
ON
    F.FLAVOR = I.FLAVOR
GROUP BY
    I.INGREDIENT_TYPE
;

-- 3. 성분별 총 주문량 구하기
SELECT
    I.INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS 'TOTAL_ORDER'
FROM
    FIRST_HALF F
        LEFT JOIN
    ICECREAM_INFO I
    ON
            F.FLAVOR = I.FLAVOR
GROUP BY
    I.INGREDIENT_TYPE
ORDER BY
    TOTAL_ORDER ASC
;
