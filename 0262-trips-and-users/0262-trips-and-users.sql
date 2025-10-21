# Write your MySQL query statement below
SELECT request_at AS Day,
       ROUND(SUM(CASE WHEN status = 'cancelled_by_driver' OR status = 'cancelled_by_client'
                      THEN 1
                      ELSE 0
                 END) / (COUNT(id) * 1.00), 2) AS 'Cancellation Rate'
FROM Trips 
WHERE request_at BETWEEN '2013-10-01' AND '2013-10-03'
  AND client_id IN (SELECT users_id
                        FROM Users
                        WHERE banned = 'No')
  AND driver_id IN (SELECT users_id 
                    FROM Users
                    WHERE banned = 'No')
GROUP BY request_at