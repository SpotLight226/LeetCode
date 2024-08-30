SELECT transaction_date,
       -- SUM에 조건을 붙여서 CASE WHEN 조건 THEN 합할 컬럼 ELSE 조건에 안 맞으면 넣을 값 
       SUM(CASE
               WHEN (amount % 2) = 1 THEN amount
           ELSE 0 END) AS odd_sum,
       SUM(CASE
               WHEN (amount % 2) = 0 THEN amount
           ELSE 0 END) AS even_sum
FROM transactions
GROUP BY transaction_date
ORDER BY transaction_date