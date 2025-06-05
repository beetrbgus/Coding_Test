-- https://school.programmers.co.kr/learn/courses/30/lessons/273711
SELECT
    child.ITEM_ID,
    child.ITEM_NAME,
    child.RARITY
FROM ITEM_TREE t
JOIN ITEM_INFO parent
  ON t.PARENT_ITEM_ID = parent.ITEM_ID
    AND parent.RARITY = 'RARE'
JOIN ITEM_INFO child
  ON t.ITEM_ID = child.ITEM_ID
ORDER BY child.ITEM_ID DESC;