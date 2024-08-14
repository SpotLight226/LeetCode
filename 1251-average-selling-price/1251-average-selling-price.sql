SELECT P.product_id,
       -- COALESCE => SUM(US.units * P.price) / SUM(US.units) 이 NULL 일 때 0으로 반환
       ROUND(COALESCE(SUM(US.units * P.price) / SUM(US.units), 0), 2) AS average_price
FROM Prices AS P
LEFT JOIN UnitsSold AS US
ON P.product_id = US.product_id 
AND US.purchase_date BETWEEN P.start_date AND P.end_date -- 조인 조건에 purchase_date 를 추가해서 조인함
GROUP BY P.product_id;