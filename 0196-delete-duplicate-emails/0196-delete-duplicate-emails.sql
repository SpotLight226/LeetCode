-- ID가 포함되지 않는 것만 빼고 삭제 (NOT IN)
-- EMAIL로 그룹화해서 최소 ID(MIN(ID))를 선택하는 CTE 에서 MIN_ID 를 조건으로 설정
DELETE FROM PERSON
WHERE ID NOT IN (SELECT MIN_ID FROM (SELECT MIN(ID) AS MIN_ID
                                     FROM PERSON
                                     GROUP BY EMAIL) AS TEMP );
