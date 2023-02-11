-- 코드를 입력하세요
-- 테이블에서 평균 대여기간이 7일 이상인 자동차 목록
SELECT * FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY;

-- 1. 테이블에서 CAR_ID 한개 평균 대여기간 구하기
SELECT
    CAR_ID, AVG(datediff(end_date, start_date))
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
    CAR_ID = 15
GROUP BY CAR_ID
;

-- 2. 평균 대여기간 7일 이상인 것
-- 날짜 빼기는 숫자 갯수와 같음 뺀 다음 1을 더해줘야 함.
SELECT
    CAR_ID, AVG(datediff(end_date, start_date) + 1) AS 'AVERAGE_DURATION'
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY
    CAR_ID
HAVING AVERAGE_DURATION >= 7
;

-- 3. 평균 대여기간을 첫째 자리까지만 보이게
SELECT
    CAR_ID, ROUND(AVG(datediff(end_date, start_date) + 1),1) AS 'AVERAGE_DURATION'
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY
    CAR_ID
HAVING
        AVERAGE_DURATION >= 7
ORDER BY
    AVERAGE_DURATION DESC,
    CAR_ID DESC
;
