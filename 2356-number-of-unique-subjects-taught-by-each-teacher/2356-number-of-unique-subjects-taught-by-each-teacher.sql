SELECT teacher_id,
       COUNT(DISTINCT (subject_id)) AS cnt -- subject_id의 중복을 제거한 것을 count
FROM Teacher
GROUP BY teacher_id