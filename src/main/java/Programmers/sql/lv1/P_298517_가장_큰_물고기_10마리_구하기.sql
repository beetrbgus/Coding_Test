-- https://school.programmers.co.kr/learn/courses/30/lessons/298517
-- ID : 개체 ID
-- FISH_TYPE : 물고기 종류
-- LENGTH : 물고기 길이
-- TIME : 잡은 날짜
SELECT
    ID,
    LENGTH
FROM
    FISH_INFO
ORDER BY LENGTH DESC, ID ASC
LIMIT 10
;