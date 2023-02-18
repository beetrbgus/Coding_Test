-- https://school.programmers.co.kr/learn/courses/30/lessons/131123
-- REST_INFO 테이블에서 음식종류별로
-- 즐겨찾기수가 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요.
-- 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.
SELECT * FROM REST_INFO; -- 식당 정보 테이블

-- 1. GROUP BY 기준을 음식 종류로 묶음.
SELECT
    *
FROM
    REST_INFO
GROUP BY
    FOOD_TYPE

-- 2. 그룹 별로 즐겨찾기 수가 가장 많음 것
SELECT
    MAX(FAVORITES)
FROM
    REST_INFO
GROUP BY
    FOOD_TYPE

-- 3. 2의 결과를 서브쿼리로 이용해 목록 뽑기
SELECT
    FOOD_TYPE,
    REST_ID,
    REST_NAME,
    FAVORITES
FROM
    REST_INFO
WHERE
    FAVORITES
    IN(
        SELECT MAX(FAVORITES) FROM REST_INFO
        GROUP BY FOOD_TYPE
    )
GROUP BY FOOD_TYPE
ORDER BY FOOD_TYPE DESC;
