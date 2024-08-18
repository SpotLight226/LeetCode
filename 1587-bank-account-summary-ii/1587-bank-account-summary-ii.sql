WITH Sum_trans AS (SELECT account,
                          SUM(amount) AS balance
                   FROM Transactions
                   GROUP BY account
                   HAVING SUM(amount) > 10000)

SELECT U.name,
       S.balance
FROM Users AS U
JOIN Sum_trans AS S
  ON U.account = S.account
