SELECT customer_id
FROM Customer AS C
JOIN Product AS P
  ON C.product_key = P.product_key
GROUP BY customer_id
HAVING COUNT(DISTINCT(C.product_key)) = (SELECT COUNT(product_key)
                                         FROM Product)