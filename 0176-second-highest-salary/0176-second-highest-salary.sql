SELECT MAX(salary) AS SecondHighestSalary 
FROM Employee
WHERE salary < (SELECT MAX(salary) -- 최고 연봉을 조건으로 작은 것 중에서 max 인것
                FROM Employee)

