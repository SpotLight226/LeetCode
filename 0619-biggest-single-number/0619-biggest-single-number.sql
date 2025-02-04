# Write your MySQL query statement below
SELECT MAX(num) AS num
FROM (SELECT num
      FROM MyNumbers
      GROUP BY num
      HAVING COUNT(num) = 1) AS numbers
      -- MyNumbers 에서 개수가 1인 것만 뽑은 임시 테이블에서 최대의 숫자(MAX(num))