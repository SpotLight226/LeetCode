SELECT activity_date AS day,
       COUNT(DISTINCT(user_id)) AS active_users
FROM Activity
-- 2019-07-27를 포함하기 위해서 INTERVAL 29DAY를 DATE_SUB에 사용한다
WHERE activity_date BETWEEN DATE_SUB('2019-07-27', INTERVAL 29 DAY) AND '2019-07-27'
GROUP BY activity_date

