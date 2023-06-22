SELECT NULLIF(
    (SELECT DISTINCT salary
     FROM Employee s1
     WHERE 1 = (
         SELECT COUNT(DISTINCT salary)
         FROM Employee s2
         WHERE s2.salary > s1.salary
     )
    ),
    NULL
) AS SecondHighestSalary;
