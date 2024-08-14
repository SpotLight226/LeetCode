SELECT P.product_id,
       ROUND(COALESCE(SUM(US.units * P.price) / SUM(US.units), 0), 2) AS average_price
FROM Prices AS P
LEFT JOIN UnitsSold AS US
ON P.product_id = US.product_id 
AND US.purchase_date BETWEEN P.start_date AND P.end_date
GROUP BY P.product_id;