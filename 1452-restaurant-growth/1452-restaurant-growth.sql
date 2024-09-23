SELECT DISTINCT visited_on,
       SUM(amount) OVER W AS amount,
       ROUND(SUM(amount) OVER W / 7, 2) AS average_amount
FROM Customer
-- WINDOW : 미리 데이터 집합을 정의하여 각 행에대한 집계를 수행할 수 있게 도와준다
-- 각 visited_on 에 대해서 현재 날짜를 포함한 지난 6일간의 데이터를 포함
-- RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW => 현재 날짜(포함)부터 interval 6일을 범위로 한다 
WINDOW W AS (ORDER BY visited_on
             RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW)
LIMIT 6, 1000 -- 처음 6개의 결과는 7일이 되지 않았으므로 제외한다
-- 6개 이후부터 최대 1000행까지의 결과를 반환