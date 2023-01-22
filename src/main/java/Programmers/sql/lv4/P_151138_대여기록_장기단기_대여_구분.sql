-- https://school.programmers.co.kr/learn/courses/30/lessons/151138

-- 다음은 어느 자동차 대여 회사의 자동차 대여 기록 정보를 담은 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블입니다. CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블은 아래와 같은 구조로 되어있으며, HISTORY_ID, CAR_ID, START_DATE, END_DATE 는 각각 자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일을 나타냅니다.
--
-- Column name	Type	Nullable
-- HISTORY_ID	INTEGER	FALSE
-- CAR_ID	INTEGER	FALSE
-- START_DATE	DATE	FALSE
-- END_DATE	DATE	FALSE
-- 문제
-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 대여 시작일이 2022년 9월에 속하는 대여 기록에 대해서 대여 기간이 30일 이상이면 '장기 대여' 그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: RENT_TYPE)을 추가하여 대여기록을 출력하는 SQL문을 작성해주세요. 결과는 대여 기록 ID를 기준으로 내림차순 정렬해주세요.
--
-- 예시
-- 예를 들어 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블이 다음과 같다면
--
-- HISTORY_ID	CAR_ID	START_DATE	END_DATE
-- 1	4	2022-09-27	2022-11-27
-- 2	3	2022-10-03	2022-11-04
-- 3	2	2022-09-05	2022-09-05
-- 4	1	2022-09-01	2022-09-30
-- 5	3	2022-09-16	2022-10-15
-- 2022년 9월의 대여 기록 중 '장기 대여' 에 해당하는 기록은 대여 기록 ID가 1, 4인 기록이고, '단기 대여' 에 해당하는 기록은 대여 기록 ID가 3, 5 인 기록이므로 대여 기록 ID를 기준으로 내림차순 정렬하면 다음과 같이 나와야 합니다.
--
-- HISTORY_ID	CAR_ID	START_DATE	END_DATE	RENT_TYPE
-- 5	3	2022-09-16	2022-10-13	단기 대여
-- 4	1	2022-09-01	2022-09-30	장기 대여
-- 3	2	2022-09-05	2022-09-05	단기 대여
-- 1	4	2022-09-27	2022-10-26	장기 대여
-- 주의사항
-- START_DATE와 END_DATE의 경우 예시의 데이트 포맷과 동일해야 정답처리 됩니다.

select
    HISTORY_ID,
    CAR_ID,
    TO_CHAR(START_DATE, 'YYYY-MM-DD') as "START_DATE",
    TO_CHAR(END_DATE, 'YYYY-MM-DD') as "END_DATE",
    -- Rent_Type 컬럼 조건이 대여기간이 30일 이상에 분기가 걸려있기 때문에 case절 추가
    case
        when
            END_DATE -
            Start_date + 1 >= 30
        then
            '장기 대여'
        else '단기 대여'
    end as "RENT_TYPE"
from
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- 9월 내에서 조회해야하기 떄문에 날짜 조건을 where절에 걺
where
        Start_date >= TO_DATE('2022-09-01', 'YYYY-MM-dd')
  and
        Start_date < TO_DATE('2022-10-01', 'YYYY-MM-dd')
order by
    HISTORY_ID desc;