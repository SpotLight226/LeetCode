SELECT EU.unique_id, -- unique_id가 null이면 null로 표기
       E.name
FROM Employees AS E
LEFT JOIN EmployeeUNI AS EU -- Left Join으로 외래키인 id가 null이어도 표기함
       ON E.id = EU.id
