-- RequestAccepted는 요청에 대해서 승낙한 id를 나타낸다.
-- 즉, 리퀘스터든 엑셉트든 결국 친구가 되었다는 거임
-- 친구 요청을 승낙한 사람과, 요청한 사람을 각각 나눈 CTE를 만들고 id의 각 개수를 센다 
WITH IdCte AS (SELECT requester_id AS id
               FROM RequestAccepted
               UNION ALL
               SELECT accepter_id AS id
               FROM RequestAccepted)

SELECT id,
       COUNT(*) AS num
FROM IdCte
GROUP BY id
ORDER BY COUNT(*) DESC -- 가장 많은 사람을 고르기 위해 내림차순
LIMIT 1 -- 가장 위의 1개만 자르기
