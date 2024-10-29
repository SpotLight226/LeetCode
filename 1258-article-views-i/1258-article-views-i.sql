SELECT DISTINCT(author_id) AS id -- 중복 제거한 ID
FROM Views
WHERE author_id = viewer_id -- author_id 와 viewer_id가 같은 데이터만
ORDER by author_id -- 내림차순 정렬