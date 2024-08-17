SELECT event_day AS day,
       emp_id,
       SUM((out_time - in_time)) AS total_time
FROM Employees
GROUP BY event_day, emp_id -- GROUP BY 에서 각 행들을 묶으려면 2개로 묶는데 , 로 구분