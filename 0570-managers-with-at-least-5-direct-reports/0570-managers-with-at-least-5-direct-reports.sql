# Write your MySQL query statement below
select name
from employee 
where id in 
(select managerid 
 from employee
 group by managerid
 having count(id)>=5
)