# Write your MySQL query statement below
WITH meeting_hours AS (SELECT employee_id,
                              SUM(duration_hours) AS meeting_total
                       FROM meetings                 
                       GROUP BY employee_id,
                                WEEKOFYEAR(meeting_date),
                                YEAR(meeting_date))

SELECT m.employee_id,
       e.employee_name,
       e.department,
       COUNT(m.employee_id) AS meeting_heavy_weeks
FROM meeting_hours AS m
JOIN employees AS e
  ON m.employee_id = e.employee_id
WHERE meeting_total > 20
GROUP BY m.employee_id,
         e.employee_name,
         e.department
HAVING COUNT(m.employee_id) > 1
ORDER BY meeting_heavy_weeks DESC, employee_name