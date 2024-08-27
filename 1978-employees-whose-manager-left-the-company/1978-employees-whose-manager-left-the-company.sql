-- 매니저 아이디가 있는 사람 CTE
WITH Managers AS (SELECT *
                  FROM Employees
                  WHERE manager_id IS NOT NULL) 

SELECT M.employee_id 
FROM Managers AS M
LEFT JOIN Employees AS E
       ON M.manager_id = E.employee_id 
WHERE E.employee_id IS NULL -- 조인 했을 때, E에서 사원 번호가 NULL이라면 이미 퇴사한 사람
  AND M.salary < 30000 -- 봉급이 30000보다 낮음
ORDER BY M.employee_id 