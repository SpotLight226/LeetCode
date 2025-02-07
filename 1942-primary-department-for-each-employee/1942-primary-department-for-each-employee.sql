# Write your MySQL query statement below
SELECT employee_id,
       department_id
FROM Employee
WHERE primary_flag = 'Y' -- 주 부서 이거나
   OR employee_id in (SELECT employee_id
                      FROM Employee
                      GROUP BY employee_id
                      HAVING COUNT(employee_id) = 1) -- id가 하나 뿐인 서브쿼리에 속해있는 것만