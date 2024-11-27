-- 조건에 Queue에서 몸무게 합을 조건으로 준다
-- 이 때, Q2의 turn보다 Q1의 turn이 작은 것만 합친다
SELECT person_name
FROM Queue AS Q1
WHERE 1000 >= (SELECT SUM(weight)
               FROM Queue AS Q2
               WHERE Q2.turn <= Q1.turn)
ORDER BY turn DESC 
LIMIT 1