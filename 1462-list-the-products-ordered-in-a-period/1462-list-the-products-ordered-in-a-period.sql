# Write your MySQL query statement below
WITH feb_Order AS (SELECT product_id,
                          SUM(unit) AS unit
                   FROM Orders
                   WHERE order_date LIKE '2020-02-%'
                   GROUP BY product_id
                   HAVING SUM(unit) >= 100)

SELECT product_name,
       unit
FROM Products AS p
JOIN feb_Order AS f
  ON p.product_id = f.product_id