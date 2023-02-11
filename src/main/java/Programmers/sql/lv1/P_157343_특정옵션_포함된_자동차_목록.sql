-- 1. 테이블 확인
SELECT
    *
FROM
    CAR_RENTAL_COMPANY_CAR
;

-- 2. 네비게이션 옵션이 있는 로우
SELECT
    *
FROM
    CAR_RENTAL_COMPANY_CAR
WHERE
        OPTIONS LIKE '%네비게이션%'
;

-- 3. CAR_ID 역순 정렬
SELECT
    *
FROM
    CAR_RENTAL_COMPANY_CAR
WHERE
        OPTIONS LIKE '%네비게이션%'
ORDER BY
    CAR_ID DESC
;