-- https://school.programmers.co.kr/learn/courses/30/lessons/132203
SELECT * FROM DOCTOR; -- 의사 정보 테이블

-- 흉부외과 또는 일반외과 목록
SELECT
    *
FROM
    DOCTOR
WHERE
        MCDP_CD IN('CS','GS')

-- 정렬 기준에 따라 정렬
SELECT
    DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM
    DOCTOR
WHERE
        MCDP_CD IN('CS','GS')
ORDER BY
    HIRE_YMD DESC,
    DR_NAME ASC
;