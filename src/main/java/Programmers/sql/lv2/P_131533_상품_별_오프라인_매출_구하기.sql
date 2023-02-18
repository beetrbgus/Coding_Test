-- https://school.programmers.co.kr/learn/courses/30/lessons/131533

-- PRODUCT 테이블과 OFFLINE_SALE 테이블에서
-- 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문을 작성해주세요.
-- 결과는 매출액을 기준으로 내림차순 정렬해주시고,
-- 매출액이 같다면 상품코드를 기준으로 오름차순 정렬해주세요.

-- 매출액(SALES) = 판매가(PRODUCT.PRICE) * 판매량(OFFLINE_SALE.SALES_AMOUNT)
SELECT * FROM PRODUCT; -- 상품 정보
SELECT * FROM OFFLINE_SALE ; -- 오프라인 상품 판매 정보

-- 조인
SELECT
    *
FROM
    PRODUCT P
LEFT JOIN
    OFFLINE_SALE O
ON
    P.PRODUCT_ID = O.PRODUCT_ID
;

-- 상품 아이디로 묶음
SELECT
    *
FROM
    PRODUCT P
LEFT JOIN
    OFFLINE_SALE O
ON
    P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY
    P.PRODUCT_CODE
;

-- 판매량 구하기
SELECT
    P.PRODUCT_CODE,
    SUM(P.PRICE * O.SALES_AMOUNT) AS SALES
FROM
    PRODUCT P
LEFT JOIN
    OFFLINE_SALE O
ON
    P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY
    P.PRODUCT_CODE
;

-- 판매정보가 없으면 0으로 만들고 정렬
SELECT
    P.PRODUCT_CODE,
    IFNULL(SUM(P.PRICE * O.SALES_AMOUNT), 0)  AS SALES
FROM
    PRODUCT P
LEFT JOIN
    OFFLINE_SALE O
ON
    P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY
    P.PRODUCT_CODE
ORDER BY
    SALES DESC,
    P.PRODUCT_CODE ASC
;