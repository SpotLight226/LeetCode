# Write your MySQL query statement below
SELECT query_name,
       ROUND(SUM(rating / position) / COUNT(query_name), 2) AS quality,
       ROUND(SUM(IF (rating < 3, 1, 0)) * 100.0 / COUNT(query_name), 2) AS poor_query_percentage
FROM Queries
GROUP BY query_name
-- quality 는 (rating / position) 을 다 합친 것 / 해당 query 의 개수 
-- poor_query 는 rating 이 3 미만 인 것만 합친 것 * 100.0 / query의 개수