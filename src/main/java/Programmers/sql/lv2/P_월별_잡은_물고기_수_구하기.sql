-- https://school.programmers.co.kr/learn/courses/30/lessons/293260
SELECT
    COUNT(*) AS FISH_COUNT,
    MONTH(time) AS MONTH
FROM
    FISH_INFO
GROUP BY MONTH
HAVING COUNT(*) > 0
ORDER BY MONTH ASC
;