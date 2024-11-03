SELECT S.student_id,
       S.student_name,
       SUB.subject_name,
       -- COALESCE => NULL 이 나오면 대체할 값을 지정할 수 있음
       COALESCE(COUNT(E.student_id), 0) AS attended_exams 
FROM Students AS S
JOIN Subjects AS SUB -- JOIN을 2번, SUB에서는 없는 것도 나와야 하므로 LEFT JOIN
LEFT JOIN Examinations AS E
       ON S.student_id = E.student_id
      AND SUB.subject_name = E.subject_name
GROUP BY S.student_id, SUB.subject_name  -- student_id 와 subject_name으로 그룹화해서 각 아이디 마다 과목이 나오게
ORDER BY S.student_id, SUB.subject_name -- 정렬