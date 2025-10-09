# Write your MySQL query statement below
(SELECT u.name AS results
 FROM Users AS u
 JOIN Movierating AS mr
   ON u.user_id = mr.user_id
 GROUP BY u.user_id
 ORDER BY COUNT(u.user_id) DESC, u.name ASC 
 LIMIT 1)
-- Users 와 Movierating 테이블을 조인해서 가장 많은 평가를 한 사람을 찾는다
UNION ALL

(SELECT m.title AS results
 FROM Movies AS m
 JOIN Movierating AS mr
   ON m.movie_id=mr.movie_id
 WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
 GROUP BY m.movie_id, m.title
 ORDER BY AVG(mr.rating) DESC, m.title ASC 
 LIMIT 1)
 -- 2020-02 에 평가를 준 것만 찾아서, 가장 높은 평균 평점 영화의 이름을 찾는다
