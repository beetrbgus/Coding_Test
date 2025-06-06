-- https://school.programmers.co.kr/learn/courses/30/lessons/293258
SELECT
    COUNT(*) AS FISH_COUNT
FROM
    FISH_INFO fi
WHERE
    fi.LENGTH IS NULL
;