/*
SELECT NAME
FROM CUSTOMER
WHERE REFEREE_ID != 2 -- id가 2인 손님이 추천하지 않았고
  OR REFEREE_ID IS NULL -- 추천 id가 NUll
*/

SELECT name
FROM Customer
WHERE COALESCE(referee_id, 0) <> 2; -- referee_id가 null일 때, 0으로 바꾸고 2와 다른 것(<>)을 찾는다