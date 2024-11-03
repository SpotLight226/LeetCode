SELECT E1.name
FROM Employee AS E1
JOIN Employee AS E2
  ON E1.id = E2.managerId -- Employee 테이블 서로 조인하여, 각 id 당 매니저로서 할당된 개수를 센다
GROUP BY E2.managerId
HAVING COUNT(E2.managerId) >= 5
