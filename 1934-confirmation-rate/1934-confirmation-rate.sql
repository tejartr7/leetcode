# Write your MySQL query statement below

select s.user_id,
case when c.time_stamp is null
then 0.00
else round(sum(c.action='confirmed')/count('*'),2)
end as confirmation_rate
from signups s
left join confirmations c on s.user_id=c.user_id
group by s.user_id 
