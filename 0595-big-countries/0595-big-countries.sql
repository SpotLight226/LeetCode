SELECT name,
       population,
       area
FROM World
WHERE population >= 25000000 -- 인구가 250만 이상
   OR area >= 3000000 -- 면적이 300만 이상
