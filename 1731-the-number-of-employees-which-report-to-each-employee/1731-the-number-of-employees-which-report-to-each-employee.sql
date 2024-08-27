WITH Reporters AS (SELECT *
                   FROM Employees
                   WHERE reports_to IS NOT NULL)

SELECT E.employee_id,
       E.name,
       COUNT(R.name) AS reports_count,
       ROUND(AVG(R.age), 0) AS average_age 
FROM Employees AS E 
JOIN Reporters AS R
  ON E.employee_id = R.reports_to
GROUP BY E.employee_id
ORDER BY E.employee_id