SELECT S.student_id,
       S.student_name,
       SUB.subject_name,
       COALESCE(COUNT(E.student_id), 0) AS attended_exams
FROM Students AS S
JOIN Subjects AS SUB
LEFT JOIN Examinations AS E
       ON S.student_id = E.student_id
      AND SUB.subject_name = E.subject_name
GROUP BY S.student_id, SUB.subject_name
ORDER BY S.student_id, SUB.subject_name