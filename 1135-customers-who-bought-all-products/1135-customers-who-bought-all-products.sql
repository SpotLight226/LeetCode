SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT(product_key)) = (SELECT COUNT(*) FROM Product);
-- 손님 id로 그룹화해서 각 손님당 제품 키의 개수가 Product 테이블의 총 제품키 개수와 같은 것만