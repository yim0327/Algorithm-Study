SELECT II.ITEM_ID, ITEM_NAME, RARITY
FROM ITEM_INFO AS II
    JOIN ITEM_TREE AS IT
    ON IT.ITEM_ID = II.ITEM_ID
WHERE II.ITEM_ID = any(SELECT IT.ITEM_ID # 3.-와 일치하는 장비만
                    FROM ITEM_TREE AS IT
                        JOIN ITEM_INFO AS II
                        ON IT.PARENT_ITEM_ID = II.ITEM_ID # 1.부모 중에서
                    WHERE II.RARITY = 'RARE') # 2.희귀도가 '레어'인 장비
ORDER BY II.ITEM_ID DESC;

