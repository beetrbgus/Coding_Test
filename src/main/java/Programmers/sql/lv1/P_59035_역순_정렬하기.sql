-- https://school.programmers.co.kr/learn/courses/30/lessons/59035
SELECT * FROM ANIMAL_INS; -- 동물 정보 테이블
-- 역순 정렬
SELECT
    NAME, DATETIME
FROM
    ANIMAL_INS
ORDER BY
    ANIMAL_ID DESC;