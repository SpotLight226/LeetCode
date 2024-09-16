-- 가장 많이 평가한 유저 이름과 가장 높은 평점의 영화를 한번에 선택할 수 없으니 각각을 선택한 SELECT 문을 UNION 한다
-- 1. 가장 많이 평가한 유저를 찾기위해서 user_id가 가장 많이 나온 순으로 내림차순 정렬 후, 이름으로 오름차순 정렬
(SELECT U.name AS results 
 FROM MovieRating AS MR
 JOIN Users AS U
   ON MR.user_id = U.user_id
 GROUP BY MR.user_id
 ORDER BY COUNT(MR.user_id) DESC,
          U.name
 LIMIT 1)

UNION ALL
-- 2. 가장 높은 평점 영화를 찾기위해 avg로 내림차순 정렬, 또한 2월을 제한으로 둔다
(SELECT M.title AS results
 FROM MovieRating AS MR
 JOIN Movies AS M
   ON MR.movie_id = M.movie_id
 WHERE MR.created_at BETWEEN '2020-02-01' AND '2020-02-29'
 GROUP BY MR.movie_id
 ORDER BY AVG(MR.rating) DESC,
          M.title 
 LIMIT 1)
