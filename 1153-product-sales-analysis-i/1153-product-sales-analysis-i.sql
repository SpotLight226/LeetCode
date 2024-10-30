SELECT P.product_name,
       S.year,
       S.price
FROM Product AS P
JOIN Sales AS S -- 외래키 제품 id로 join하여 각 상품의 이름, 년도, 가격을 표기
  ON P.product_id = S.product_id
