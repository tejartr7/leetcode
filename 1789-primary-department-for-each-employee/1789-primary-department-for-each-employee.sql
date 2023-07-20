SELECT employee_id, department_id
FROM Employee
WHERE employee_id IN (
    SELECT employee_id
    FROM Employee
    GROUP BY employee_id
    HAVING COUNT(*) = 1
)
UNION
SELECT employee_id, department_id
FROM Employee 
WHERE primary_flag = 'Y';
