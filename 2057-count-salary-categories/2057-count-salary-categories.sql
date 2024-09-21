-- COUNT 에 IF 문을 넣어서 조건 맞을 때와 틀릴 때의 카운트를 설정할수 있다
-- COUNT는 0도 카운트에 넣기 때문에 0으로 넣으면 안되고 NULL로 해야 한다
SELECT 'Low Salary' AS category,
        COUNT(IF(income < 20000, 1, NULL)) AS accounts_count
FROM Accounts

UNION

SELECT 'Average Salary' AS category,
        COUNT(IF(income >= 20000 AND income <= 50000, 1, NULL)) AS accounts_count
FROM Accounts

UNION

SELECT 'High Salary' AS category,
        COUNT(IF(income > 50000, 1, NULL)) AS accounts_count
FROM Accounts
