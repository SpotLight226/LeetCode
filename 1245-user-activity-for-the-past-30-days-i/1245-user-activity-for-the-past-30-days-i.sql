SELECT activity_date AS day,
       COUNT(DISTINCT user_id) AS active_users
FROM Activity
-- 조건에 activity_date 에서 2019-07-27 을 포함하기 위해서 DATE_SUB에서 INTERVAL 29 DAY을 준다 
WHERE DATE(activity_date) BETWEEN DATE_SUB('2019-07-27', INTERVAL 29 DAY) AND '2019-07-27'
GROUP BY activity_date
