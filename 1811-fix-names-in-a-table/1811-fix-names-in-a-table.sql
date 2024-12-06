SELECT user_id,
    -- SUBSTRING(자를 문자열, 시작 위치, 끝 위치(생략 시, 끝까지))
    -- UPPER => 대문자로, LOWER => 소문자로
    -- CONCAT(합칠 문자열1, 합칠 문자열2) => 문자열 합치기
       CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name, 2))) AS name
FROM Users
ORDER BY user_id