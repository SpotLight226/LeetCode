/* 조건에서 player_id 와 event_date를 넣는데,
   IN에는 id와 event_Date의 최소값에 을 서브 쿼리로 지정하고
   DATE_SUB 으로 날짜 차이를 지정한다
   DATE_SUB(비교할 속성, 차이) => 비교할 속성과 지정한 차이에 조건이 맞는 player_id를 찾는다

   조건에 맞는 player_id(중복 제거) / Activity 테이블에서 모든 player_Id(중복 제거) => 계산하고
   ROUND 로 소수점 2자리 까지만 나타낸다
*/
SELECT ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id)
                                          FROM Activity), 2) AS fraction
FROM Activity
WHERE (player_id,
       DATE_SUB(event_Date, INTERVAL 1 DAY)) IN (SELECT player_Id,
                                                        MIN(event_date) AS first -- evenet_date의 최소(첫 로그인)
                                                 FROM Activity 
                                                 GROUP BY player_id) 
                                                         