# Write your MySQL query statement below
-- 가장 많은 영화를 평가한 유저
(SELECT u.name AS results
FROM Users u
JOIN MovieRating m
ON u.user_id = m.user_id
GROUP BY u.user_id
ORDER BY COUNT(m.rating) DESC, -- 개수를 내림 차순으로 정렬해서 가장 많이 한 사람 찾기
         u.name -- 개수 같으면 알파벳 순 정렬로 확인
LIMIT 1)

UNION ALL

(SELECT mo.title AS results
FROM Movies mo
JOIN MovieRating mr
ON mo.movie_id = mr.movie_id
WHERE mr.created_at LIKE '2020-02%' -- 2020-02 에 평가한 날짜
GROUP BY mo.movie_id
ORDER BY AVG(mr.rating) DESC, -- 영화 평점 평균
         mo.title
LIMIT 1)
