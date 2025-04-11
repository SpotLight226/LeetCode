# Write your MySQL query statement below
WITH rank_temp AS (SELECT e.salary AS salary,
                          e.name AS employee,
                          d.name AS department,
                          DENSE_RANK() OVER(PARTITION BY e.departmentId ORDER BY salary DESC) AS rnk
                   FROM Employee AS e
                   LEFT JOIN Department AS d
                   ON e.departmentId = d.id)

SELECT department,
       employee,
       salary
FROM rank_temp
WHERE rnk <= 3