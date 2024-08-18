SELECT EU.unique_id, -- unique_id가 null이면 null로 표기
       E.name
FROM Employees AS E
LEFT JOIN EmployeeUNI AS EU
       ON E.id = EU.id
