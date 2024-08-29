SELECT DISTINCT(T1.id),
       CASE
           WHEN T1.p_id IS NULL THEN 'Root'
           WHEN T2.id IS NULL THEN 'Leaf'
           ELSE 'Inner'
       END AS type
FROM Tree AS T1
LEFT JOIN Tree AS T2
  ON T1.id = T2.P_id
