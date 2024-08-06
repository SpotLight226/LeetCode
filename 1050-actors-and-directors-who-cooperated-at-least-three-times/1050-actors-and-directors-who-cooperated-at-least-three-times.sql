SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id -- actor_id 와 director_id 로 그룹화해서
HAVING COUNT(*) >= 3 --  count가 3 이상인 것만