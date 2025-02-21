# Write your MySQL query statement below
-- 각 범위의 급여를 나누어 COUNT 에 조건 IF 를 사용해 개수를 세고, 합친다(UNION)
SELECT 'Low Salary' AS category,
        COUNT(IF(income < 20000, 1, null)) AS accounts_count
FROM Accounts

UNION ALL

SELECT 'Average Salary' AS category,
        COUNT(IF(income >= 20000 and income <= 50000, 1, null)) AS accounts_count
FROM Accounts

UNION ALL

SELECT 'High Salary' AS category,
        COUNT(IF(income > 50000, 1, null)) AS accounts_count
FROM Accounts