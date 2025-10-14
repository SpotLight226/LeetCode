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

-- 위의 WHERE 절에 서브쿼리를 넣는 것보다 CTE, JOIN 절에 CTE 사용이 더 빠름
-- WHERE 절 안의 상관 서브쿼리보다는, CTE나 JOIN 절에 비상관 서브쿼리를 두는 게 대부분의 경우 더 효율적
/*
-- CTE 사용
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
*/

-- 서브쿼리 사용
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee e
JOIN Department d
  ON e.departmentId = d.id
JOIN (SELECT departmentId,
             MAX(salary) AS highest
      FROM Employee
      GROUP BY departmentId) m
  ON e.departmentId = m.departmentId
WHERE e.salary = m.highest