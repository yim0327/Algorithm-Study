SELECT T.ID AS ID
FROM (SELECT S.ID, F.ID AS F_ID
      FROM ECOLI_DATA AS S
          JOIN ECOLI_DATA AS F
           ON S.PARENT_ID = F.ID
      WHERE F.PARENT_ID IS NULL  # 조건: 부모가 1세대인
     ) AS SECONDERY              # => 2세대만 남기기
     JOIN ECOLI_DATA AS T
     ON T.PARENT_ID = SECONDERY.ID # 조인 시, '부모가 2세대'인 애들만 남음
ORDER BY T.ID;