# Write your MySQL query statement below
SELECT s1.score,
       COUNT(s2.score) AS 'rank'
FROM Scores AS s1,
(SELECT DISTINCT score
 FROM Scores) AS s2
WHERE s1.score <= s2.score
GROUP BY s1.id
ORDER BY s1.score DESC