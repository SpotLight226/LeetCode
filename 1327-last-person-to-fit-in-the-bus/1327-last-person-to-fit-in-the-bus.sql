# Write your MySQL query statement below
WITH sum_weight AS (SELECT person_name,
                           SUM(weight) OVER(ORDER BY turn) AS s_weight
                    FROM Queue)

SELECT person_name
FROM sum_weight
WHERE s_weight <= 1000
ORDER BY s_weight DESC
LIMIT 1