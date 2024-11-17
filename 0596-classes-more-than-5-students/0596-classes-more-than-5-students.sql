SELECT class
FROM COURSES
GROUP BY class -- 수업 별로 그룹화
HAVING COUNT(student) >= 5 -- 그룹화한 수업의 개수가 5 이상인 것만
