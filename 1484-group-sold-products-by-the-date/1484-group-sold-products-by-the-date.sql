SELECT sell_date,
       -- 제품의 수를 선택하는 것이므로 중복되는 product는 없이
       COUNT(DISTINCT(product)) AS num_sold,
       GROUP_CONCAT(DISTINCT(product) ORDER BY product SEPARATOR ',') AS products
FROM Activities
GROUP BY sell_date
