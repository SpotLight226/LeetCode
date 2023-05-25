SELECT w.id
FROM Weather
     JOIN Weather w
     ON DATE_ADD(Weather.recordDate, INTERVAL 1 DAY) = w.recordDate
WHERE Weather.temperature < w.temperature






