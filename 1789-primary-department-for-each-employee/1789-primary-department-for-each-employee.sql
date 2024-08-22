SELECT employee_id,
       department_id
FROM Employee
WHERE primary_flag = 'Y' -- 조건 1 => 기본 부서가 Y인 것
OR employee_id IN (SELECT employee_id -- 조건 2 => id가 GROUP BY 했을 때 COUNT가 1인 것만
                   FROM Employee
                   GROUP BY employee_id
                   HAVING COUNT(*) = 1 )