-- https://school.programmers.co.kr/learn/courses/30/lessons/131528
SELECT * FROM USER_INFO; -- 회원 정보 테이블
SELECT COUNT(USER_ID) AS USERS FROM USER_INFO WHERE AGE IS NULL; -- 나이가 없는 회원 수 구하기.