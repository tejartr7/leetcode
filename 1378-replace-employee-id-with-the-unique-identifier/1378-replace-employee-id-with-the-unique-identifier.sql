select e.name,u.unique_id
from employees e
left join employeeuni u
on e.id=u.id