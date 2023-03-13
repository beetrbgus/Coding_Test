-- https://school.programmers.co.kr/learn/courses/30/lessons/131535
SELECT * FROM USER_INFO;
-- 2021년 가입 회원 중 나이가 20세 이상 29세 이하의 회원 수 구하기
SELECT
    COUNT(USER_ID) AS USERS
FROM
    USER_INFO
WHERE
    JOINED LIKE '2021%'
  AND
    AGE >= 20
  AND
    AGE < 30
    -- 위의 AGE 조건은 AGE BETWEEN 20 AND 29으로 바꿔도 됨
;