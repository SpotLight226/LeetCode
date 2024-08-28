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
  
