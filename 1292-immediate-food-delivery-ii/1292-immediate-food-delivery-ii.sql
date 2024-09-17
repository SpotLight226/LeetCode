SELECT ROUND(SUM(CASE
                     WHEN order_date = customer_pref_delivery_date
                     THEN 1
                     ELSE 0
                END) / COUNT(customer_id) * 100, 2) AS immediate_percentage
                -- SUM 에 조건으로(CASE WHEN THEN) 주문 날짜와 배달 날짜가 같으면 1, 아니면 0으로 지정한다
                -- 주문 날짜와 배달 날짜가 같은 사람 / 전체 손님 수 * 100을 해서 백분율로 나타내고
                -- 2번째 자리까지 반올림한다
FROM Delivery
-- 조건으로 서브쿼리에 손님 ID 와 최소 ORDER_DATE를 지정한다
WHERE (customer_id, order_date) IN (SELECT customer_id,
                                           MIN(order_date)
                                    FROM Delivery
                                    GROUP BY customer_id)