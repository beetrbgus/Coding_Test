-- https://school.programmers.co.kr/learn/courses/30/lessons/151137
-- 요구조건 : 통풍시트, 열선시트, 가죽시트 중 하나 옵션 포함된 자동차가 종류별로 몇대인지
-- 자동차 종류 : 세단, SUV, 승합차, 트럭, 리무진

-- 전체 테이블 조회해 봄
SELECT * FROM CAR_RENTAL_COMPANY_CAR ;

-- 1. 열선, 통풍, 가죽 시트 중 하나인 차의 목록을 구함.
SELECT
    *
FROM
    CAR_RENTAL_COMPANY_CAR
WHERE
    OPTIONS REGEXP '통풍시트|열선시트|가죽시트'
;

-- 2. 자동차 종류별로 자동차 갯수 세기
SELECT
    CAR_TYPE, COUNT(*) AS CARS
FROM
    CAR_RENTAL_COMPANY_CAR
WHERE
    OPTIONS REGEXP '통풍시트|열선시트|가죽시트'
GROUP BY
    CAR_TYPE
ORDER BY
    CAR_TYPE ASC;