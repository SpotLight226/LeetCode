SELECT P.product_name,
       SUM(O.unit) AS unit
FROM Products AS P
JOIN Orders AS O
  ON P.product_id = O.product_id
WHERE O.order_date LIKE '2020-02-%'
GROUP BY O.product_id
HAVING SUM(O.unit) >= 100