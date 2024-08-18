-- 미리 10000 보다 더 쓴 사람을 Transactions 에서 찾아두는 CTE
WITH Sum_trans AS (SELECT account,
                          SUM(amount) AS balance
                   FROM Transactions
                   GROUP BY account
                   HAVING SUM(amount) > 10000)

SELECT U.name,
       S.balance
FROM Users AS U
JOIN Sum_trans AS S -- JOIN 해서 CTE에 있는 사람만 출력
  ON U.account = S.account
