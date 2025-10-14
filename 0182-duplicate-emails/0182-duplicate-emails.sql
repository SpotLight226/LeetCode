# Write your MySQL query statement below
/*
SELECT p1.email
FROM Person AS p1
GROUP BY email
HAVING COUNT(email) > 1
-- person 테이블에서 email 로 그룹화해서 email 의 개수가 1 보다 많은 것만
*/

SELECT DISTINCT(p1.email)
FROM Person AS p1, Person AS p2
WHERE p1.id <> p2.id AND p1.email = p2.email
-- Person 테이블을 2개 써서 id가 다른데 email 은 같은 것에서 중복 제거하고