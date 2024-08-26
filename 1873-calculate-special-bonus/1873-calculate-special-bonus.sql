SELECT employee_id,
       -- 조건문 CASE 로 WHEN에 조건
       -- SUBSTRING(자를 컬럼, 시작 위치, 추출 길이)
       CASE 
           WHEN SUBSTRING(name, 1, 1) = 'M' OR employee_id % 2 = 0 THEN 0
           ELSE salary
       END AS bonus
FROM Employees
ORDER BY employee_id