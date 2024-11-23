-- 보고자가 있는 사원들만 모은 CTE
WITH Reporters AS (SELECT *
                   FROM Employees
                   WHERE reports_to IS NOT NULL) 

SELECT E.employee_id,
       E.name,
       COUNT(R.name) AS reports_count, -- 보고자 이름을 카운트
       ROUND(AVG(R.age), 0) AS average_age  -- 나이 평균에 근접한 숫자로 반올림
FROM Employees AS E 
JOIN Reporters AS R -- 보고자가 있는 사람 테이블과 JOIN해서 해당 사원에게 붙인다
  ON E.employee_id = R.reports_to
GROUP BY E.employee_id -- 조인한 테이블을 사원 번호로 그룹화
ORDER BY E.employee_id -- 사원 번호로 정렬 