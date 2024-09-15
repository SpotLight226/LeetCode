SELECT DATE_FORMAT(trans_date, '%Y-%m') AS month,
       country,
       COUNT(id) AS trans_count,
       -- IF(컬럼 조건, 조건 맞으면 실행할 값, 조건 틀리면 실행할 값)
       SUM(IF(state = 'approved', 1, 0)) AS approved_count,
       SUM(AMOUNT) AS trans_total_amount,
       SUM(IF(state = 'approved', amount, 0)) AS approved_total_amount
FROM Transactions
GROUP BY country, MONTH