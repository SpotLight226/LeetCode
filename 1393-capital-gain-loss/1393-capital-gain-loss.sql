/*
-- 미리 산 주식, 판 주식의 합을 CTE로 만들어 계산하는 방식
WITH Buy_stocks AS (SELECT stock_name,
                           SUM(price) AS buy_price
                    FROM Stocks
                    WHERE operation = 'Buy'
                    GROUP BY stock_name),
                    
     Sell_stocks AS (SELECT stock_name,
                            SUM(price) AS sell_price
                     FROM Stocks
                     WHERE operation = 'Sell'
                     GROUP BY stock_name)

SELECT S.stock_name,
       S.sell_price - B.buy_price AS capital_gain_loss
FROM Sell_stocks AS S
JOIN Buy_stocks AS B
  ON S.stock_name = B.stock_name
*/  

-- CASE 문에서 합의 조건을 지정해서 합을 구하는 방식
SELECT stock_name,
       SUM(
           CASE
               WHEN operation = 'Buy' THEN -price
               ELSE price
           END
          ) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name
