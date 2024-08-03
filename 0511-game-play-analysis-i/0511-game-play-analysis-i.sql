SELECT player_id,
       MIN(event_date) AS first_login -- event_date에서 최소 값
FROM Activity
GROUP BY player_id -- id로 그룹화
