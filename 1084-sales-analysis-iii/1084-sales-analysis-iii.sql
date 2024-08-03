/* 
이 문제에서 sales 테이블에 2019년 것만 있는줄알고 
1분기 판매 CTE와 다른 분기 판매 CTE 를 만들어서 해결하려 했지만
알고 보니 2018년에 판매 된 것, 2020년에 판매된 것도 있는 데이터도 있어서 2019년 것만 비교하면 안되는 거였음
그래서 조건에 1분기에 판매된 것을 조건 1 
sale_date 가 1분기 이후, 2019 1분기 이전에 판매된 것을 제외하는 조건 2
로 작성해서 해결됨
*/
SELECT DISTINCT(P.product_id), -- 중복을 제거
       P.product_name
FROM Product AS P
JOIN Sales AS S
  ON P.product_id = S.product_id
WHERE S.sale_date BETWEEN '2019-01-01' AND '2019-03-31' -- 1분기 판매
  AND S.product_id NOT IN (SELECT product_id -- 1분기 이후, 2019 1분기 이전에 판매된 것 을 제외
                           FROM Sales
                           WHERE sale_date > '2019-03-31'
                              OR sale_date < '2019-01-01')