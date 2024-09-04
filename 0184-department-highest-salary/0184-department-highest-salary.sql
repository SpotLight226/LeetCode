SELECT D.name AS Department,
       E.name AS Employee,
       E.salary AS Salary
FROM Employee AS E
JOIN Department AS D
  ON E.departmentId = D.id
WHERE E.salary = (SELECT MAX(salary)
                  FROM Employee
                  WHERE departmentId = E.departmentId)
-- 조건에 서브 쿼리로 WHERE departmentId = E.departmentId)을 조건으로
-- E에 동일한 부서 ID 를 가진 행들의 MAX를 각각 구하여 각 부서별로 최대 급여를 조건으로 나올 수 있게 한다