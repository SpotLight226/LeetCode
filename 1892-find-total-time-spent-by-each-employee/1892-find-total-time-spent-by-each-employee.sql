# Write your MySQL query statement below
SELECT event_day AS day,
       emp_id,
       SUM(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id
-- event_day 와 emp_id 로 그룹화해서 각 event_day 마다 out - in 을 더해서 total을 구한다