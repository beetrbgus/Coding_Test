-- https://school.programmers.co.kr/learn/courses/30/lessons/144854
-- 기본 테이블
SELECT * FROM BOOK;

-- 1. 경제 카테고리 목록
SELECT
    *
FROM
    BOOK
WHERE
    CATEGORY = '경제'
;

-- 2. 출판일 2020-01-10 00:00:00 형식을 2020-01-10로 변경 후 출판일 기준 오름차순
SELECT
    BOOK_ID,CATEGORY,AUTHOR_ID,DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM
    BOOK
WHERE
    CATEGORY = '경제'
ORDER BY
    PUBLISHED_DATE ASC
;

-- 3. AUTHOR 테이블과 조인 후 원하는 칼럼 조회
SELECT
    BOOK_ID,AUTHOR_NAME,DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM
    BOOK
LEFT JOIN
    AUTHOR
ON
    BOOK.AUTHOR_ID = AUTHOR.AUTHOR_ID
WHERE
    CATEGORY = '경제'
ORDER BY
    PUBLISHED_DATE ASC
;