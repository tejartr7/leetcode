# Write your MySQL query statement below
select b.visited_on, sum(a.amount) as amount, round(sum(a.amount)/7,2) as average_amount
from Customer a, (select distinct visited_on from Customer) b
where DATEDIFF(b.visited_on, a.visited_on) between 0 and 6
group by b.visited_on
having count(distinct a.visited_on)=7