-- https://school.programmers.co.kr/learn/courses/30/lessons/132201

-- 12세 이하인 여자 환자 목록 출력하기
SELECT * FROM PATIENT; -- 환자 테이블

-- 1. 12세 이하인 여자 환자 목록 정렬 추가
SELECT
    *
FROM
    PATIENT
WHERE
    AGE <= 12
  AND
    GEND_CD = 'W'
ORDER BY
    AGE DESC,
    PT_NAME ASC
;

-- 2. NULL -> NONE 으로 처리, 원하는 컬럼만 추출
SELECT
    PT_NAME,
    PT_NO,
    GEND_CD,
    AGE,
    IFNULL(TLNO,'NONE') AS TLNO
FROM
    PATIENT
WHERE
    AGE <= 12
  AND
    GEND_CD = 'W'
ORDER BY
    AGE DESC,
    PT_NAME ASC
;