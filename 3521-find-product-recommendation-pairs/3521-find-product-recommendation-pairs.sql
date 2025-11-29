# Write your MySQL query statement below
WITH A AS (SELECT p1.product_id AS product1_id,
                  p2.product_id AS product2_id,
                  p1.category AS product1_category,
                  p2.category AS product2_category
           FROM ProductInfo AS p1
           JOIN ProductInfo AS p2
             ON p1.product_id < p2.product_id),

     B AS (SELECT p1.product_id AS product1_id,
                  p2.product_id AS product2_id,
                  COUNT(p1.user_id) AS customer_count
           FROM ProductPurchases AS p1
           JOIN ProductPurchases AS p2
             ON p1.user_id = p2.user_id AND p1.product_id < p2.product_id
           GROUP BY p1.product_id, p2.product_id
           HAVING COUNT(p1.user_id) >= 3)

SELECT A.product1_id,
       A.product2_id,
       A.product1_category,
       A.product2_category,
       B.customer_count
FROM A
JOIN B
  ON A.product1_id = B.product1_id AND A.product2_id = B.product2_id
ORDER BY B.customer_count DESC,
         A.product1_id,
         A.product2_id