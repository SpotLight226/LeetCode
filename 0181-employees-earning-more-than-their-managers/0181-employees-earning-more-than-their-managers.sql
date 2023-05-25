SELECT e.name AS Employee
FROM Employee AS e
     INNER JOIN Employee AS manager
     ON e.managerId = manager.id
WHERE e.salary > manager.salary
    
