SELECT *
FROM Cinema
WHERE id % 2 = 1 -- 2로 나누었을 때 나머지가 1인 것만
  AND description NOT LIKE 'boring' -- description 이 boring이 아닌 것만
ORDER BY rating DESC -- rating 을 기준으로 내림차순 정렬
