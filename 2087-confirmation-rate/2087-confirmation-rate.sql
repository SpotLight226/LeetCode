# Write your MySQL query statement below
SELECT s.user_id,
       ROUND(AVG(If(c.action = 'confirmed', 1.00, 0)), 2) AS confirmation_rate
FROM Signups AS s
LEFT JOIN Confirmations AS c
       ON s.user_id = c.user_id
GROUP BY s.user_id
-- Signups 테이블과 Confirmations 테이블을 조인하고 user_id 로 그룹화하여
-- action 이 confirmed 인 것만 선택하여 1.00으로 취급하여 평균을 낸다(소수점 2자리까지 반올림)