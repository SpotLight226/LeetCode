SELECT query_name,
       ROUND(AVG(rating / position), 2) AS quality, -- rating / position 의 비율 구하고 둘 째자리에서 반올림
       ROUND(AVG(IF(rating < 3, 1, 0)) * 100, 2) AS poor_query_percentage
FROM Queries
WHERE query_name IS NOT NULL
GROUP BY query_name
