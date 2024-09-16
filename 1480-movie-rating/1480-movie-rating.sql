(SELECT U.name AS results 
 FROM MovieRating AS MR
 JOIN Users AS U
   ON MR.user_id = U.user_id
 GROUP BY MR.user_id
 ORDER BY COUNT(MR.user_id) DESC,
          U.name
 LIMIT 1)

UNION ALL

(SELECT M.title AS results
 FROM MovieRating AS MR
 JOIN Movies AS M
   ON MR.movie_id = M.movie_id
 WHERE MR.created_at BETWEEN '2020-02-01' AND '2020-02-29'
 GROUP BY MR.movie_id
 ORDER BY AVG(MR.rating) DESC,
          M.title 
 LIMIT 1)
