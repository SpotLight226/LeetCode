/*
SELECT customer_id,
       COUNT(customer_id) AS count_no_trans
FROM Visits AS V
LEFT JOIN Transactions AS T
       ON V.visit_id = T.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id
*/
-- JOIN 사용 안하고 윈도우 함수 이용해 풀이
SELECT customer_id,
       COUNT(visit_id) AS count_no_trans
FROM Visits
WHERE visit_id NOT IN (SELECT visit_id
                       FROM Transactions)
GROUP BY customer_id