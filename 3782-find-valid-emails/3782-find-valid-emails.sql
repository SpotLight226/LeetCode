# Write your MySQL query statement below
SELECT user_id,email
FROM Users
WHERE email
REGEXP '^[A-Za-z0-9_]+@[A-Za-z]+\\.com$'
-- 앞의 단어가 알파벳 대문자 소문자 숫자로 이루어져 있고
-- . 은 바로 들어갈 수 없기 때문에 \\를 붙여서 .com 을 쓴다