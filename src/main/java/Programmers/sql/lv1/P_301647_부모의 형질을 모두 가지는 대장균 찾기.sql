-- https://school.programmers.co.kr/learn/courses/30/lessons/301647
-- ID : 개체 ID
-- Parent_id : 부모 개체의 ID
-- Size_of_colony : 개체의 크기
-- Differentiation_date : 분화된 날짜
-- Genotype : 개체의 형질
SELECT
    CHILD.ID,
    CHILD.GENOTYPE,
    PARENT.GENOTYPE AS 'PARENT_GENOTYPE'
FROM ECOLI_DATA CHILD
INNER JOIN ECOLI_DATA PARENT
    ON PARENT.ID = CHILD.PARENT_ID
WHERE
    CHILD.GENOTYPE & PARENT.GENOTYPE = PARENT.GENOTYPE
ORDER BY CHILD.ID ASC