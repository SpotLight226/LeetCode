SELECT P.product_name,
       SUM(O.unit) AS unit
FROM Products AS P
JOIN Orders AS O
  ON P.product_id = O.product_id
  -- 조건에 월은 2월, 연도는 2020
WHERE MONTH(O.order_date) = '02'
  AND YEAR(O.order_date) = '2020'
GROUP BY O.product_id
-- 그룹화한 후 판매 개수의 합이 100 이상인 것
HAVING SUM(O.unit) >= 100