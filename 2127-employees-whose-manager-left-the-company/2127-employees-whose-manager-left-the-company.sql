# Write your MySQL query statement below
SELECT employee_id
FROM Employees
WHERE salary < 30000 -- 연봉이 30000보다 낮은 사람
AND manager_id NOT IN (SELECT employee_id
                       FROM Employees)
ORDER BY employee_id