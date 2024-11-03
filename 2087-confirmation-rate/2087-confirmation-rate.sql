/*
-- 내가 한 것 88비트
-- 조건을 많이 적용해야해서 좀 헷갈렸음
-- 만약 Confirmations테이블에서 user_id가 0개라면 0, 아니라면 action이 컨펌인 것만 1로 해서 더한 것(아니라면 0)을
-- Confirmations테이블의 user_id 개수로 나눈 것을 2번째 자리까지 반올림한 것을 rate로 나타낸다
SELECT S.user_id,
       IF(COUNT(C.user_id) = 0, 0, ROUND(SUM(IF(action = 'confirmed', 1, 0)) / COUNT(C.user_id), 2)) AS confirmation_rate
FROM Signups AS S
LEFT JOIN Confirmations AS C
       ON S.user_id = C.user_id
GROUP BY S.user_id
ORDER BY confirmation_rate
*/

-- 대박! 96비트
-- AVG에 IF문을 적용해서 action이 컨펌인 것만 1, 아닌것은 0으로 해서 각 아이디의 개수에서 평균을 구한다
SELECT S.user_id,
       ROUND(AVG(IF(C.action = 'confirmed', 1, 0)), 2) AS confirmation_rate
FROM Signups AS S
LEFT JOIN Confirmations AS C
       ON S.user_id = C.user_id
GROUP BY S.user_id