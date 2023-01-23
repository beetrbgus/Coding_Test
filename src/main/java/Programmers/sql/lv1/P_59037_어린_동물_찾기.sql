-- https://school.programmers.co.kr/learn/courses/30/lessons/59037

-- 젊은 동물 = Intake_Condition이 Aged가 아닌 경우.
SELECT
    ANIMAL_ID,
    NAME
from
    ANIMAL_INS
where
    INTAKE_CONDITION != 'Aged'
order by
    ANIMAL_ID ASC;