SELECT actor_id,
       director_id
FROM ActorDirector
GROUP BY actor_id,
         director_id
HAVING COUNT(*) >= 3

-- actor_Id, 와 director_id 로 그룹화해서
-- 개수가 3회 이상인 것만을 선택