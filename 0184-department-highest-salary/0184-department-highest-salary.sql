# Write your MySQL query statement below
/*
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee AS e
JOIN Department AS d
  ON e.departmentId = d.id
WHERE e.salary = (SELECT MAX(salary)
                  FROM Employee
                  WHERE departmentId = e.departmentId)
-- 부서 이름을 쓰기위해 Employee 테이블과 Department 테이블을 조인하고
-- salary 에서 조건을 departmentId 가 같은 것들 중에서 최고 값을 가진 것들만 선택
*/

WITH max_salary AS (SELECT departmentId,
                           MAX(salary) AS highest
                    FROM Employee
                    GROUP BY departmentId)

SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee AS e
JOIN max_salary AS m
  ON e.departmentId = m.departmentId
JOIN Department AS d
  ON e.departmentId = d.id
WHERE e.salary = m.highest