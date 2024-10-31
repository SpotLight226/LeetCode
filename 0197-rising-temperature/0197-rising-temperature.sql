SELECT today.id
FROM Weather yesterday
CROSS JOIN Weather today -- 카데시안 곱을 이용해 모든 각 행에 다른 행들을 붙인다
WHERE DATEDIFF(today.recordDate, yesterday.recordDate) = 1 -- DATEDIFF(뺄 날짜, 원 날짜)
  AND today.temperature > yesterday.temperature -- 오늘의 온도가 어제의 온도보다 높은 것

