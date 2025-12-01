# Write your MySQL query statement below
WITH ranking AS (SELECT p.employee_id,
                        e.name,
                        p.rating,
                        RANK() OVER (PARTITION BY p.employee_id ORDER BY p.review_date DESC) AS ranks
                 FROM performance_reviews AS p
                 JOIN employees AS e
                   ON p.employee_id = e.employee_id),
     pivoted AS (SELECT employee_id,
                        name,
                        MAX(CASE WHEN ranks = 1 THEN rating END) AS latest_rating,
                        MAX(CASE WHEN ranks = 2 THEN rating END) AS sec_rating,
                        MAX(CASE WHEN ranks = 3 THEN rating END) AS third_latest_rating
                 FROM ranking
                 GROUP BY employee_id, name)

SELECT employee_id,
       name,
       latest_rating - third_latest_rating AS improvement_score
FROM pivoted
WHERE latest_rating IS NOT NULL
  AND third_latest_rating IS NOT NULL
  AND latest_rating > third_latest_rating
  AND sec_rating > third_latest_rating
ORDER BY improvement_score DESC, name