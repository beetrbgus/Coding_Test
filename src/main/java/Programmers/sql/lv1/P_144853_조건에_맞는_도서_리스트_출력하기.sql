-- https://school.programmers.co.kr/learn/courses/30/lessons/144853
-- BOOK테이블에서 2021년의 인문 카테고리의 책 찾기
SELECT
    BOOK_ID,
    DATE_FORMAT(PUBLISHED_DATE, "%Y-%m-%d") AS PUBLISHED_DATE
FROM
    BOOK
WHERE
    CATEGORY = '인문'
AND
    YEAR(PUBLISHED_DATE) = '2021'
ORDER BY
    PUBLISHED_DATE ASC
;