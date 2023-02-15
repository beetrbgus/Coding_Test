-- https://school.programmers.co.kr/learn/courses/30/lessons/144855

-- 2022년 1월의 카테고리 별 도서 판매량을 합산하고,
-- 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL문을 작성해주세요.
-- 결과는 카테고리명을 기준으로 오름차순 정렬해주세요.
SELECT * FROM BOOK; -- 책 정보
SELECT * FROM BOOK_SALES; -- 책 판매 정보

-- 조인하기
SELECT
    *
FROM
    BOOK B
        LEFT JOIN
    BOOK_SALES BS
    ON
            B.BOOK_ID = BS.BOOK_ID
;

-- 카테고리 별 도서 판매량 목록
SELECT
    B.BOOK_ID, B.CATEGORY, B.AUTHOR_ID, B.PRICE, B.PUBLISHED_DATE
     , BS.SALES_DATE, SUM(BS.SALES) AS SALES
FROM
    BOOK B
        LEFT JOIN
    BOOK_SALES BS
    ON
            B.BOOK_ID = BS.BOOK_ID
GROUP BY
    B.CATEGORY
;

-- 22년 1월의 카테고리 별 도서 판매량
SELECT
    B.BOOK_ID, B.CATEGORY, B.AUTHOR_ID, B.PRICE, B.PUBLISHED_DATE
     , BS.SALES_DATE, SUM(BS.SALES) AS SALES
FROM
    BOOK B
        LEFT JOIN
    BOOK_SALES BS
    ON
            B.BOOK_ID = BS.BOOK_ID
WHERE
    BS.SALES_DATE
        BETWEEN
        DATE_FORMAT('2022-01-01', '%y-%m-%d')
        AND
        DATE_FORMAT('2022-01-31', '%y-%m-%d')
GROUP BY
    B.CATEGORY
ORDER BY
    CATEGORY ASC
;
-- 22년 1월의 카테고리 별 판매량
SELECT
    B.CATEGORY, SUM(BS.SALES) AS TOTAL_SALES
FROM
    BOOK B
        LEFT JOIN
    BOOK_SALES BS
    ON
        B.BOOK_ID = BS.BOOK_ID
WHERE
    BS.SALES_DATE
        BETWEEN
        DATE_FORMAT('2022-01-01', '%y-%m-%d')
        AND
        DATE_FORMAT('2022-01-31', '%y-%m-%d')
GROUP BY
    B.CATEGORY
ORDER BY
    CATEGORY ASC
;