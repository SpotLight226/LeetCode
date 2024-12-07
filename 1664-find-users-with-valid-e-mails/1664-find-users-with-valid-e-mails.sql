SELECT *
FROM Users
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' 
-- ^ => 문자열의 시작
-- [a-zA-Z] => 접두어가 반드시 문자(대문자, 소문자)
-- [a-zA-Z0-9_.-]* => 접두어 다음 문자에는 대문자, 소문자, 숫자, _.- 이 0번 이상 반복
-- @leetcode\\.com => 문자열의 . 은 정규 표현식에서 의미가 있기 때문에 \\ 을 붙여서 문자임을 표기
-- $ => 문자열의 끝