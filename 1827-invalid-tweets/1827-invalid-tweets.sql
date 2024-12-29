SELECT DISTINCT(tweet_id) -- id에서 중복 제거
FROM Tweets
WHERE LENGTH(content) > 15 -- content의 길이가 15이상 