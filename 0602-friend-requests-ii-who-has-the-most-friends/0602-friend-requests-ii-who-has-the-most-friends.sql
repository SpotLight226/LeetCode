# Write your MySQL query statement below
WITH T1 AS (SELECT requester_id AS id,
                   accepter_id AS acc
            FROM RequestAccepted),

     T2 AS (SELECT accepter_id AS id
                   requester_id AS acc
            FROM RequestAccepted)

SELECT id,
       COUNT(DISTINCT acc) AS num
FROM (SELECT *
      FROM T1

      UNION

      SELECT *
      FROM T2) AS Total_Table
GROUP BY id
ORDER BY num DESC
LIMIT 1