SELECT X,
       Y,
       Z,
       CASE
           WHEN X + Y > Z AND X + Z > Y AND Y + Z > X
           THEN 'Yes'
           ELSE 'No'
       END triangle -- 각 세 변의 길이가 다른 두 변의 길이의 합보다 작아야 한다
FROM TRIANGLE
