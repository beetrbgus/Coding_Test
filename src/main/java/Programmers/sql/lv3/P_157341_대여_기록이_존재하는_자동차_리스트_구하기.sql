-- https://school.programmers.co.kr/learn/courses/30/lessons/157341
SELECT * FROM CAR_RENTAL_COMPANY_CAR ; -- 대여중 자동차 정보
SELECT * FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY;  -- 대여기록 정보
-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 
-- 자동차 종류가 '세단'인 자동차들 중 
-- 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트를 출력
-- 자동차 ID 리스트는 중복이 없어야 하며, 자동차 ID를 기준으로 내림차순 정렬해주세요.

-- 1. 자동차 종류가 세단인 정보 확인
SELECT 
    *
FROM
    CAR_RENTAL_COMPANY_CAR 
WHERE 
    CAR_TYPE = '세단'
; 

-- 2. 10월에 대여를 시작한 기록이 있는 정보 확인
SELECT 
    *
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE
    START_DATE 
    BETWEEN 
        DATE_FORMAT('2022-10-01','%y-%m-%d')
        AND
        DATE_FORMAT('2022-11-01','%y-%m-%d')
;

-- 3. 세단 중 10월에 대여 시작한 기록
SELECT 
    DISTINCT C.CAR_ID
FROM
    CAR_RENTAL_COMPANY_CAR C
LEFT JOIN
    CAR_RENTAL_COMPANY_RENTAL_HISTORY R
ON
    C.car_id = R.car_id
WHERE 
    C.CAR_TYPE = '세단'
    AND
    R.START_DATE
        BETWEEN 
        DATE_FORMAT('2022-10-01','%y-%m-%d')
        AND
        DATE_FORMAT('2022-11-01','%y-%m-%d')
ORDER BY
    C.CAR_ID DESC
; 