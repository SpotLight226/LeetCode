SELECT user_id,
      -- CONCAT(문자열을 합치기), UPPER => 대문자로 LOWER => 소문자로
      -- SUBSTRING(자를 문자열, 시작 위치, 끝위치(생략하면 문자열 끝까지))
       CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name, 2))) AS name
FROM users
ORDER BY user_id