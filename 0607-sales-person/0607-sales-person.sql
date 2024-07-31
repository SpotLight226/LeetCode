-- RED 라는 회사와 거래가 없는 세일즈맨을 선택
WITH OrderRed AS (
                   SELECT DISTINCT(O.sales_id) AS RedSaleId -- 몇개가 나오든 하나만 나오게 중복 제거
                   FROM Orders AS O
                   JOIN Company AS C
                     ON O.com_id = C.com_id
                   WHERE C.name LIKE "RED"
                  ) -- RED에 판매한 사람 ID 만이 있는 CTE
                  
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (SELECT *
                       FROM OrderRed) -- OrderRed 에 포함 되지않은 사람만



