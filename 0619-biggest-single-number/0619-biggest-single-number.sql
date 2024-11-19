-- COALESCE => 서브 쿼리에서 결과를 반환하지 않으면 설정값을 반환하게 만든다
-- SELECT COALESCE((서브 쿼리), 설정값) AS 컬럼 헤더
SELECT COALESCE ((SELECT num
                  FROM MyNumbers
                  GROUP BY num
                  HAVING COUNT(*) = 1
                  ORDER BY num DESC
                  LIMIT 1), NULL) AS num
