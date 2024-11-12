SELECT DATE_FORMAT(trans_date, '%Y-%m') AS month,
       country,
       COUNT(id) AS trans_count,
       -- IF(컬럼 조건, 조건 맞으면 실행할 값, 조건 틀리면 실행할 값)
       -- state가 approved 면 1 아니면 0으로 더한다
       SUM(IF(state = 'approved', 1, 0)) AS approved_count,
       SUM(AMOUNT) AS trans_total_amount, -- amount의 합
       -- state가 approved 면 amount를 더하고, 아니면 0을 더함
       SUM(IF(state = 'approved', amount, 0)) AS approved_total_amount 
FROM Transactions
GROUP BY country, MONTH