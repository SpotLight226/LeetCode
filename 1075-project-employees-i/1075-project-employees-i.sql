SELECT P.project_id,
       ROUND(AVG(experience_years ), 2) AS average_years -- 2자리까지 반올림, 평균(AVG)
FROM Project AS P
JOIN Employee AS E
  ON P.employee_id = E.employee_id
GROUP BY P.project_id

