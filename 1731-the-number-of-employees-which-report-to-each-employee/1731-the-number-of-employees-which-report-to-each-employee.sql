# Write your MySQL query statement below


select a.employee_id,a.name,count(*) as reports_count,
round(avg(b.age)) as average_age
from employees a,employees b
where a.employee_id=b.reports_to
group by 1
order by 1