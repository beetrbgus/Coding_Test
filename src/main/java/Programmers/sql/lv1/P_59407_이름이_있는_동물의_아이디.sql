-- https://school.programmers.co.kr/learn/courses/30/lessons/59407

-- 이름이 null이 아니면 됨.
SELECT
    ANIMAL_ID
from
    ANIMAL_INS
where
    name is not null
order by animal_id;