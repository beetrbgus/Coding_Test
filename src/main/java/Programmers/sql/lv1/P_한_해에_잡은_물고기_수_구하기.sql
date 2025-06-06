-- https://school.programmers.co.kr/learn/courses/30/lessons/298516
SELECT
    COUNT(*) AS FISH_COUNT
FROM
    FISH_INFO
WHERE
    DATE_FORMAT(time, "%Y") = '2021'
GROUP BY DATE_FORMAT(time, "%Y")
;