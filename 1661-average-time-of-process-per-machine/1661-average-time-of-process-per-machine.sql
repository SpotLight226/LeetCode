-- end_time 만 모아 놓은 CTE
WITH End_time AS (SELECT machine_id,
                         process_id,
                         timestamp AS end_time
                  FROM Activity
                  WHERE activity_type = 'end'),
-- start_time 만 모아 놓은 CTE                  
     Start_time AS (SELECT machine_id,
                           process_id,
                           timestamp AS start_time
                    FROM Activity
                    WHERE activity_type = 'start')

SELECT E.machine_id,
       ROUND(AVG(E.end_time - S.start_time), 3) AS processing_time -- 평균(AVG)을 구해서 3번째 자리까지 반올림
FROM End_time AS E
JOIN Start_time AS S -- JOIN 조건에 machine_id 와 process_id 를 이용해 각각을 붙임
  ON E.machine_id = S.machine_id AND E.process_id = S.process_id
GROUP BY E.machine_id