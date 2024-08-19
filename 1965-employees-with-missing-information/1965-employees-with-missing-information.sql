-- Employees 와 Salaries 를 LEFT JOIN해서 salary가 null 인 것만
SELECT E.employee_id
FROM Employees AS E
LEFT JOIN Salaries AS S
       ON E.employee_id = S.employee_id
WHERE S.salary IS NULL

UNION -- 결과 합치기

-- Employees 와 Salaries 를 LEFT JOIN해서 name이 null 인 것만
SELECT S.employee_id
FROM Salaries AS S
LEFT JOIN Employees AS E
       ON S.employee_id = E.employee_id
WHERE E.name IS NULL
ORDER BY employee_id