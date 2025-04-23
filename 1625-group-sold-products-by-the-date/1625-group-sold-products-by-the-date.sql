# Write your MySQL query statement below
SELECT sell_date,
       COUNT(DISTINCT product) AS num_sold, -- 중복 제외하고 총 판매개수
       GROUP_CONCAT(DISTINCT product ORDER BY product) AS products -- GROUP_CONCAT 으로 product의 요소를 묶음(,로 자동구분)
FROM Activities 
GROUP BY sell_date