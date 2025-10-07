# Write your MySQL query statement below
SELECT ROUND(AVG(order_date = customer_pref_delivery_date) * 100, 2) AS immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (SELECT customer_id,
                                           MIN(order_date)
                                    FROM Delivery
                                    GROUP BY customer_id)
-- Delivery 테이블에서 최초 주문을 걸러내기 위해서 customer_id, order_date 가
-- 가장 작은 CTE 에 포함되어 있는 것만을 조건으로 찾는다

-- 즉시 배달찾기 위해 주문 날짜와 배달 완료 날짜가 같은 것만에서 평균(AVG)을 구하고,
-- 비율을 구하기 위해서 100을 곱하고, 소수점(ROUND) 2자리 까지만 구한다