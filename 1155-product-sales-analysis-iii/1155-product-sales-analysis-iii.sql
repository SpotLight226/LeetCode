
SELECT product_id,
       year AS first_year,
       quantity,
       price
FROM Sales
WHERE (product_id, year) IN (SELECT product_id,
                                    MIN(year) AS year
                             FROM Sales
                             GROUP BY product_id)
-- 조건으로 각 product_id 에 대한 가장 작은 year을 넣는다