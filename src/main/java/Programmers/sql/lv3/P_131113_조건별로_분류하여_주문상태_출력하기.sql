-- https://school.programmers.co.kr/learn/courses/30/lessons/131113
-- 1. 해당 컬럼 조회
SELECT
    ORDER_ID,
    PRODUCT_ID,
    OUT_DATE
FROM
    FOOD_ORDER;

-- 2. 조건문 붙이기
SELECT
    ORDER_ID,
    PRODUCT_ID,
    DATE_FORMAT(OUT_DATE, '%Y-%m-%d') ,
    CASE
        WHEN OUT_DATE > DATE_FORMAT('2022-05-01','%Y-%m-%d')
            THEN '출고대기'
        WHEN OUT_DATE <= DATE_FORMAT('2022-05-01','%Y-%m-%d')
            THEN '출고완료'
        ELSE '출고미정'
    END AS '출고여부'
FROM
    FOOD_ORDER
ORDER BY
    ORDER_ID ASC
;