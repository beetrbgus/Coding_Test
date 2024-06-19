-- https://school.programmers.co.kr/learn/courses/30/lessons/301646
-- ID : 개체 ID
-- Parent_id : 부모 개체의 ID
-- Size_of_colony : 개체의 크기
-- Differentiation_date : 분화된 날짜
-- Genotype : 개체의 형질
SELECT
    COUNT(ID) AS 'COUNT'
FROM ECOLI_DATA
WHERE
    GENOTYPE & 2 = 0
    AND (
        (GENOTYPE & 1) = 1 OR (GENOTYPE & 4) = 4
    )