-- https://school.programmers.co.kr/learn/courses/30/lessons/164671
-- 1. 조회수가 가장 높은 게시물 & 해당 파일의
SELECT
    *
FROM
    USED_GOODS_BOARD B
ORDER BY
    VIEWS DESC
    LIMIT 1;
SELECT
    *
FROM
    USED_GOODS_FILE
WHERE
    BOARD_ID = 'B0008'

-- 서브쿼리를 사용헤 조회수 높은 것의 파일 목록
SELECT
    *
FROM
    USED_GOODS_FILE
WHERE
    BOARD_ID = (
        SELECT
            BOARD_ID
        FROM
            USED_GOODS_BOARD B
        ORDER BY
            VIEWS DESC
        LIMIT 1
    )
;
-- 정렬 조건 추가 및 출력할 컬럼 추가
SELECT
    CONCAT('/home/grep/src/', BOARD_ID,'/', FILE_ID, FILE_NAME, FILE_EXT) AS FILE_PATH
FROM
    USED_GOODS_FILE
WHERE
    BOARD_ID = (
        SELECT
            BOARD_ID
        FROM
            USED_GOODS_BOARD B
        ORDER BY
            VIEWS DESC
        LIMIT 1
    )
ORDER BY
    FILE_ID DESC
;