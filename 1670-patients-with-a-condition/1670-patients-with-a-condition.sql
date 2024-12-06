SELECT *
FROM Patients
WHERE conditions REGEXP '(^|\\s)DIAB1'
-- (^|\\s) => DIAB1이 문자열의 시작이거나 공백(\s) 바로 다음에 위치해야 함을 의미