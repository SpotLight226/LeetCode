/*
-- 이동 거리 합 CTE를 이용한 방법 Runtime 863ms
WITH Sum_dis AS (SELECT user_id,
                        SUM(distance) AS sum_distance
                 FROM Rides
                 GROUP BY user_id)
                 
SELECT U.name,
       COALESCE(S.sum_distance, 0) AS travelled_distance -- COALESCE => null 값을 다른 값으로 치환
FROM Users AS U
LEFT JOIN Sum_dis AS S
       ON U.id = S.user_id
ORDER BY S.sum_distance DESC, U.name -- 이동거리로 내림차순, 같다면 이름으로 정렬
*/


SELECT U.name,
       COALESCE(SUM(R.distance), 0) travelled_distance
FROM Users AS U 
LEFT JOIN Rides AS R
ON U.id = R.user_id
GROUP BY U.id
ORDER BY SUM(R.distance) DESC, U.name;