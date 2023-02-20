-- https://school.programmers.co.kr/learn/courses/30/lessons/59034
SELECT * FROM ANIMAL_INS ;-- 보호소의 동물 정보
-- ID순으로 조회
SELECT
    *
FROM
    ANIMAL_INS
ORDER BY
    ANIMAL_ID ASC
;