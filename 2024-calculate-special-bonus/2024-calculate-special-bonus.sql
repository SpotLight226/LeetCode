# Write your MySQL query statement below
SELECT employee_id, 
       IF(employee_id % 2 != 0 AND LEFT(name, 1) <> 'M', salary, 0) as bonus
FROM Employees
ORDER BY employee_id;
-- employee_id 가 홀수가 거나 name의 왼쪽 첫 글자가 M이 아니라면 보너스는 0