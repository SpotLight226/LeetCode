# Write your MySQL query statement below
SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (SELECT COUNT(DISTINCT product_key)
                                      FROM Product)

-- GROUP BY 의 조건절인 HAVING 에서 Customer 테이블의 중첩을 제거한(DISTINCT) product_key 의 개수가
-- Product 테이블에서 중첩을 제거한(DISTINCT) product_key 의 개수가 같은 customer_id 만을 선택