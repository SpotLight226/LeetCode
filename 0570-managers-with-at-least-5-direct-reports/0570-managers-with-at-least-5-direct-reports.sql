/*
SELECT E1.name
FROM Employee AS E1
JOIN Employee AS E2
  ON E1.id = E2.managerId -- Employee 테이블 서로 조인하여, 각 id 당 매니저로서 할당된 개수를 센다
GROUP BY E2.managerId
HAVING COUNT(E2.managerId) >= 5
*/

-- 조건에 managerId로 그룹화하여 개수가 5개 이상인 managerId를 조건으로 한다
SELECT name
FROM Employee
WHERE id IN (SELECT managerId
             FROM Employee
             GROUP BY managerId
             HAVING COUNT(*) >= 5)
