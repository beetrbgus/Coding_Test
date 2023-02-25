-- https://school.programmers.co.kr/learn/courses/30/lessons/131697
SELECT * FROM PRODUCT; -- 상품 정보

-- 물건 중 최고 비싼 물건 구하기
SELECT
    MAX(PRICE)
FROM
    PRODUCT