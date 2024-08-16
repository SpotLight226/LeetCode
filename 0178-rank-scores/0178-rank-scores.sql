SELECT score,
       -- DENSE_RANK() => 동일한 순위가 부여된 다음에도 순위가 건너뛰지 않는다
       -- RANK() => 동일한 순위가 부여되면 다음에는 순위가 건너뛴다
       -- 둘 다 OVER(정렬 기준) 을 같이 쓴다
       -- ROW_NUMBER() => 데이터에 순차적인 번호를 부여 (OVER 같이 씀)
       DENSE_RANK() OVER(ORDER BY score DESC) AS 'rank'
FROM Scores
