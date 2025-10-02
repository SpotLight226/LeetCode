# Write your MySQL query statement below
WITH Feb_orders AS (SELECT product_id,
                           SUM(unit) AS unit
                    FROM Orders
                    WHERE order_date >= '2020-02-01' AND order_date < '2020-03-01'
                    GROUP BY product_id
                    HAVING unit >= 100)
-- Orders 테이블에서 2020년 2월 총 주문 100 이상인 것 만을 뽑은 임시 테이블

SELECT p.product_name,
       f.unit
FROM Products AS p
JOIN Feb_orders AS f
  ON p.product_id = f.product_id