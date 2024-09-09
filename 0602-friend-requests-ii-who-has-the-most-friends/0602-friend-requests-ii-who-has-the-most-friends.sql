-- 친구는 
WITH Temp_cte AS (SELECT requester_id AS id
                  FROM RequestAccepted
                  UNION ALL
                  SELECT accepter_id AS id
                  FROM RequestAccepted)

SELECT id,
       COUNT(*) AS num
FROM Temp_cte
GROUP BY id
ORDER BY COUNT(*) DESC -- 가장 많은 수를 세기 위해서 내림차순 정렬
LIMIT 1