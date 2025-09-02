WITH RankedSalaries AS (
    SELECT 
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS SalaryRank
    FROM Employee AS e
    INNER JOIN Department AS d
    ON e.departmentId = d.id
)
SELECT Department, Employee, Salary
FROM RankedSalaries
WHERE SalaryRank <= 3
ORDER BY Department, Salary DESC, Employee;
