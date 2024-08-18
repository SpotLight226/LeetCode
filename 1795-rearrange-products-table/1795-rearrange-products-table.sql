-- 각 행의 데이터를 찾아서 UNION ALL로 묶어서 출력한다
-- 각 SELECT 문은 각 store의 값이 있는 것들만 각각 선택한다
-- IS NOT NULL로 NULL이 아닌 것을 선택
SELECT product_id,
       'store1' AS store,
       store1 AS price
FROM Products
WHERE store1 IS NOT NULL 

UNION ALL

SELECT product_id,
       'store2' AS store,
       store2 AS price
FROM Products
WHERE store2 IS NOT NULL 

UNION ALL

SELECT product_id,
       'store3' AS store,
       store3 AS price
FROM Products
WHERE store3 IS NOT NULL 