# Write your MySQL query statement below
SELECT product_id,
       'store1' AS store,
       store1 AS price
FROM Products
WHERE store1 IS NOT NULL

UNION 

SELECT product_id,
       'store2' AS store,
       store2 AS price
FROM Products
WHERE store2 IS NOT NULL

UNION 

SELECT product_id,
       'store3' AS store,
       store3 AS price
FROM Products
WHERE store3 IS NOT NULL
-- 테이블에서 각 조건에 맞는 것만을 뽑아서 UNION