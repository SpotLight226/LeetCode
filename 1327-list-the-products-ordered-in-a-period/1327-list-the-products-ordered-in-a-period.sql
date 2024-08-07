SELECT P.product_name,
       SUM(O.unit) AS unit
FROM Products AS P
JOIN Orders AS O
  ON P.product_id = O.product_id
WHERE MONTH(O.order_date) = '02'
  AND YEAR(O.order_date) = '2020'
GROUP BY O.product_id
HAVING SUM(O.unit) >= 100