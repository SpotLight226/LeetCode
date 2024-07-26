/* 내 꺼
-- WHERE 조건으로 EMAIL로 그룹화하여 최소 ID(MIN(ID))만을 가진 CTE를 만들고
-- 해당 CTE에서 ID 만을 조건으로 설정하여 ID가 CTE에 포함되지 않은 것만 남기고(NOT IN) 삭제한다
DELETE FROM Person
WHERE ID NOT IN (
    SELECT MIN_ID FROM (
        SELECT MIN(id) as MIN_ID
        FROM PERSON
        GROUP BY EMAIL
    )
);
*/

-- PERSON 테이블을 두번 참조하여 P1, P2를 만든다
-- P1.EMAIL = P2.EMAIL 이 조건으로 같은 이메일을 가진 행을 찾는다
-- P1.ID > P2.ID 같은 이메일을 가진 행 중에서 ID가 더 큰 행을 선택하고 P1 행을 삭제한다
DELETE P1 FROM PERSON AS P1, PERSON AS P2
WHERE P1.EMAIL = P2.EMAIL AND P1.ID > P2.ID

