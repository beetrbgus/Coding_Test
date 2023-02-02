-- https://school.programmers.co.kr/learn/courses/30/lessons/151136
-- SUV의 일일 대여비의 평균
SELECT
    ROUND(AVG(DAILY_FEE), 0)
FROM
    CAR_RENTAL_COMPANY_CAR
WHERE
    car_type = 'SUV'
;
