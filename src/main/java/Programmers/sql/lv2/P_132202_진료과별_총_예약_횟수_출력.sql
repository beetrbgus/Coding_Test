-- https://school.programmers.co.kr/learn/courses/30/lessons/132202
-- APPOINTMENT 테이블에서 2022년 5월에 예약한 환자 수를
-- 진료과코드 별로 조회하는 SQL문을 작성.

-- 전체 테이블 조회
SELECT * FROM APPOINTMENT;


-- 1. 22년 5월에 예약한 환자 목록
SELECT
    *
FROM
    APPOINTMENT
WHERE
    APNT_YMD
    LIKE
    '2022-05%'
;

-- 2. 22년 5월에 예약한 환자 수를 정렬
SELECT
    MCDP_CD AS '진료과코드', COUNT(*) AS '5월예약건수'
FROM
    APPOINTMENT
WHERE
    APNT_YMD
    LIKE
    '2022-05%'
GROUP BY
    MCDP_CD
ORDER BY
    '5월예약건수' ASC
    , MCDP_CD ASC
;