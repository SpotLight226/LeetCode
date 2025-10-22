# Write your MySQL query statement below
SELECT DATE_FORMAT(trans_date, '%Y-%m') AS month, -- 날짜를 년-월 형식으로
       country, -- 나라
       COUNT(*) AS trans_count, -- 나타난 개수
       SUM(CASE WHEN state = 'approved' THEN 1
                ELSE 0
           END) AS approved_count, -- approved 일 때, 1 로 취급, 아니면 0으로 해서 더하기
       SUM(amount) AS trans_total_amount, -- amount 의 합
       SUM(CASE WHEN state = 'approved' THEN amount
                ELSE 0
           END) AS approved_total_amount -- approved 일 때, amount 를 합치고, 아니면 0
FROM Transactions
GROUP BY month, country