WITH Managers AS (SELECT *
                  FROM Employees
                  WHERE manager_id IS NOT NULL)

SELECT M.employee_id 
FROM Managers AS M
LEFT JOIN Employees AS E
       ON M.manager_id = E.employee_id 
WHERE E.employee_id IS NULL
  AND M.salary < 30000
ORDER BY M.employee_id 