-- https://school.programmers.co.kr/learn/courses/30/lessons/133025

-- 상반기 아이스크림 총주문량이 3,000보다 높으면서
-- 아이스크림의 주 성분이 과일인 아이스크림의 맛을
-- 총 주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.


-- 과일 베이스 아이스크림 맛 조회
SELECT * FROM ICECREAM_INFO WHERE INGREDIENT_TYPE = 'fruit_based';
-- 조인 시키기
SELECT
    *
FROM
    ICECREAM_INFO I
LEFT JOIN
    FIRST_HALF F
ON
    I.FLAVOR = F.FLAVOR
WHERE
    INGREDIENT_TYPE = 'fruit_based'
;

-- 3000보다 주문량 많은 것 주문량 순으로 정렬
SELECT
    F.FLAVOR
FROM
    ICECREAM_INFO I
LEFT JOIN
    FIRST_HALF F
ON
    I.FLAVOR = F.FLAVOR
WHERE
    I.INGREDIENT_TYPE = 'fruit_based'
AND
    F.TOTAL_ORDER >= 3000
ORDER BY
    TOTAL_ORDER DESC
;