/*
-- 조인해서 방문은 했지만 거래가 없는 고객 찾기(transaction_id가 null인 것) 그래서 래프트 조인
SELECT customer_id,
       COUNT(customer_id) AS count_no_trans
FROM Visits AS V
LEFT JOIN Transactions AS T
       ON V.visit_id = T.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id
*/
-- JOIN 사용 안하고 윈도우 함수 이용해 풀이
-- 거래 테이블에서 visit_id가 없는 것만 개수 세기
SELECT customer_id,
       COUNT(visit_id) AS count_no_trans
FROM Visits
WHERE visit_id NOT IN (SELECT visit_id
                       FROM Transactions)
GROUP BY customer_id