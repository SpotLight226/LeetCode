# Write your MySQL query statement below
UPDATE salary
   SET sex = CASE
                 WHEN sex = 'm' THEN 'f'
                 ELSE 'm'
             END
-- sex 를 CASE WHEN 문으로 m 이면 f로 변경, m 이 아닌 경우, m 으로 변경
