SELECT user_id,
       ROUND(AVG(CASE WHEN activity_type = 'free_trial' THEN activity_duration ELSE NULL END),2) AS trial_avg_duration,
       ROUND(AVG(CASE WHEN activity_type = 'paid' THEN activity_duration ELSE NULL END),2) AS paid_avg_duration
FROM useractivity
WHERE user_id IN (SELECT user_id
                  FROM useractivity
                  GROUP BY user_id
                  HAVING COUNT(DISTINCT CASE WHEN activity_type = 'free_trial' THEN 1 END) > 0
                     AND COUNT(DISTINCT CASE WHEN activity_type = 'paid' THEN 1 END) > 0
                 )
GROUP BY user_id
ORDER BY user_id
-- free_trial 과 paid 인 상태를 구분해서 만약 paid 에서 COUNT 했을 때, 없다면 user_id를 제외한다