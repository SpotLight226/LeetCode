# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id is null
-- referee_id 가 2 가 아니거나, 아무도 추천하지 않은 name 만