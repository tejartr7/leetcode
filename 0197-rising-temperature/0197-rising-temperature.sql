select b.id 
from weather a
left join weather b
on datediff(b.recordDate,a.recordDate)=1
where b.temperature>a.temperature;
# Write your MySQL query statement below

