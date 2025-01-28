# Write your MySQL query statement below
SELECT teacher_id,
       COUNT(DISTINCT(subject_id)) AS cnt -- 각 선생당 중복을 제외한 과목의 수
FROM Teacher
GROUP BY teacher_id -- 선생별로 묶기위한 group by