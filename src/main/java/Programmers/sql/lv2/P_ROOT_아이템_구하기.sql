-- https://school.programmers.co.kr/learn/courses/30/lessons/273710
SELECT
    i.ITEM_ID, i.ITEM_NAME
FROM
    ITEM_TREE t
INNER JOIN
    ITEM_INFO i
ON t.ITEM_ID = i.ITEM_ID
WHERE
    t.PARENT_ITEM_ID is null
;