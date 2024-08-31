SELECT id,
       /*
       LAG => 현재 행 기준으로 이전 행의 값을 가져온다
       LAG(column_name, [offset], [default_value]) OVER (PARTITION BY column_name ORDER BY column_name)
           참조할 열, 몇 번째 이전 행을 참조할 지 지정(기본 1), 이전 행 없을 때 기본 값, 함수의 작동 범위
       
       LEAD => 현재 행 기준으로 다음 행의 값을 가져온다
       LEAD(column_name, [offset], [default_value]) OVER (PARTITION BY column_name ORDER BY column_name)
            참조할 열, 몇 번째 다음 행을 참조할 지 지정(기본 1), 다음행 없을 때 기본 값, 함수의 작동 범위
       */
       CASE
           WHEN id % 2 = 0 THEN LAG(student) OVER(ORDER BY id) -- id가 짝수일 때, 이전 행의 값을 가져온다
           ELSE COALESCE(LEAD(student) OVER(ORDER BY id), student) -- 홀수라면, 다음 행의 값을 가져오고 없다면 student
       END AS student
FROM Seat
ORDER BY id