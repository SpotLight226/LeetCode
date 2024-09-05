SELECT customer_id
FROM Customer AS C
JOIN Product AS P
  ON C.product_key = P.product_key -- 제품 키로 조인
GROUP BY customer_id -- 손님 테이블에서 ID로 그룹화
HAVING COUNT(DISTINCT(C.product_key)) = (SELECT COUNT(product_key)
                                         FROM Product)
-- HAVING 조건에 손님 테이블에서 중복을 제외한 제품 키의 개수가 제품 테이블에서 제품 키의 개수가 같은 것만 