# Write your MySQL query statement below
SELECT id,
       CASE 
           WHEN p_id IS NULL THEN 'Root'
           WHEN id IN (SELECT p_id FROM Tree)THEN 'Inner'
           ELSE 'Leaf'
       END AS type
 FROM Tree
 -- p_id 가 null 이면 root 
 -- id 가 p_id 중에서 있다면 Inner
 -- 아무것도 아니라면 leaf