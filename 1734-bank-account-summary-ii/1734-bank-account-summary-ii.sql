WITH Balance AS (SELECT account,
                        SUM(amount) AS balance
                 FROM Transactions
                 GROUP BY account
                 HAVING SUM(amount) > 10000)
-- Transactions 테이블에서 amount 의 합이 10000보다 높은 것만 뽑은 임시 테이블

SELECT u.name,
       b.balance
FROM Users AS u
JOIN Balance AS b
  ON u.account = b.account