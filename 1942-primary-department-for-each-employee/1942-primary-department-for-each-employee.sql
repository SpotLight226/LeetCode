# Write your MySQL query statement below
SELECT employee_id,
       department_id
FROM Employee
WHERE primary_flag = 'Y' OR employee_id IN (SELECT employee_id
                                            FROM Employee
                                            GROUP BY employee_id
                                            HAVING COUNT(employee_id) = 1)
-- primary_flag 가 Y 거나 employee_id 가 하나 뿐인 데이터만을 선택