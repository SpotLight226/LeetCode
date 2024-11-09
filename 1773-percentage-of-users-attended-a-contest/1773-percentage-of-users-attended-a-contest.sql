WITH TotalUsers AS (SELECT COUNT(*) AS total_users
                    FROM Users), -- 전체 유저 수
                    
ContestRegistrations AS (SELECT R.contest_id,
                         COUNT(*) AS num_users_registered
                         FROM Register AS R
                         JOIN Users AS U
                           ON R.user_id = U.user_id
                         GROUP BY R.contest_id) -- 각 콘테스트 당 유저의 아이디 수
                         
SELECT CR.contest_id,
       ROUND((CR.num_users_registered / TU.total_users * 100), 2) AS percentage
FROM ContestRegistrations AS CR
CROSS JOIN TotalUsers AS TU
ORDER BY percentage DESC, CR.contest_id ASC;