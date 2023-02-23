-- https://school.programmers.co.kr/learn/courses/30/lessons/133024
SELECT * FROM FIRST_HALF; -- 상반기 아이스크림 주문 정보

-- 상반기에 아이스크림 맛을 총 주문량을 기준으로 내림차순 정렬, 출하번호 기준 오름차순 정렬
SELECT
    FLAVOR
FROM
    FIRST_HALF
ORDER BY
    TOTAL_ORDER DESC,
    SHIPMENT_ID ASC
;