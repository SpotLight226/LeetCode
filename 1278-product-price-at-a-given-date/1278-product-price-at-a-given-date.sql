# Write your MySQL query statement below
-- rank를 이용한 풀이 (기발함)
-- 제품의 가격 변경 날짜가 2019-08-16 이하인 것 중에서 순위를 매김
WITH Products_price AS (SELECT *,
                               RANK() OVER(PARTITION BY product_id ORDER BY change_date DESC) AS price_rank
                        FROM Products
                        WHERE change_date <= '2019-08-16')
-- cte에서 가장 
SELECT product_id,
       new_price AS price
FROM Products_price
WHERE price_rank = 1
UNION
SELECT product_id,
       10 AS price
FROM Products
WHERE product_id NOT IN (SELECT product_id
                         FROM Products_price)
