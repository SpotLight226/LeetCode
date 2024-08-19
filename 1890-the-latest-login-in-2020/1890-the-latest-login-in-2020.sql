SELECT user_id,
       MAX(time_stamp) AS last_stamp -- 가장 뒤에 있는 것을 선택하기 위해서 MAX()
FROM Logins
WHERE YEAR(time_stamp) = '2020'
GROUP BY user_id
