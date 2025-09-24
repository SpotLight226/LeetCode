# Write your MySQL query statement below
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (SELECT O.sales_id
                       FROM Orders AS O
                       INNER JOIN Company AS C
                       ON O.com_id = C.com_id
                       WHERE C.name = 'RED')
-- Order 테이블에 각 회사의 name 이 있는 Company 테이블을 조인해서 각 이름을 붙이고 회사 이름이 RED 인 회사의 sales_id 를 찾는다
-- 해당 sales_id 가 SalesPerson 테이블 에 없는 것 name 을 찾는다