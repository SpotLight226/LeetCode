# Write your MySQL query statement below
SELECT p1.email
FROM Person AS p1
GROUP BY email
HAVING COUNT(email) > 1
-- person 테이블에서 email 로 그룹화해서 email 의 개수가 1 보다 많은 것만