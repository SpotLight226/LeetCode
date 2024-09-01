SELECT person_name
FROM Queue AS Q1
WHERE 1000 >= (SELECT SUM(weight)
               FROM Queue AS Q2
               WHERE Q2.turn <= Q1.turn)
ORDER BY turn DESC 
LIMIT 1