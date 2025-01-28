# Write your MySQL query statement below
SELECT activity_date AS day, -- 날짜
       COUNT(DISTINCT(user_id)) AS active_users -- 각 날짜에 유저의 수 (중복 제외)
FROM Activity
-- 조건 : 활동 날짜가 6-27 부터 7-27 까지
WHERE (activity_date > "2019-06-27" AND activity_date <= "2019-07-27") 
GROUP BY activity_date
