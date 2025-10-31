# Write your MySQL query statement below
SELECT contest_id,
       ROUND(COUNT(DISTINCT user_id) * 100 / (SELECT COUNT(user_id) FROM Users), 2) AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id
-- Register 에서 contest_id 로 그룹화하고 (중복되지 않은 신청자의 id * 100) / (User 테이블에서 user의 개수)로 퍼센트를 구한다