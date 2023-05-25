SELECT w.id
FROM Weather
     JOIN Weather w
     ON DATEDIFF(Weather.recordDate, w.recordDate) = -1
WHERE Weather.temperature < w.temperature






