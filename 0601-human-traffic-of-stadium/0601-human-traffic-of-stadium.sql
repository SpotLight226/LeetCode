WITH QTE AS (SELECT *,
                    id - row_number() over() AS id_diff
             FROM Stadium
             WHERE people > 99)

SELECT id,
       visit_date,
       people
FROM QTE
WHERE id_diff IN (SELECT id_diff
                  FROM QTE
                  GROUP BY id_diff
                  HAVING COUNT(*) > 2)
ORDER BY visit_date