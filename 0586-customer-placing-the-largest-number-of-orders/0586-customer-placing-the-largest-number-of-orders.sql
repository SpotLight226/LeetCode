SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC -- 고객 번호의 개수 순으로 내림차순 정렬
LIMIT 1 -- 가장 위의 한개만 나타내기
