select person_name from
(select person_name,turn, sum(weight) over(order by turn) as cum_sum
from queue) x
where cum_sum <= 1000
order by turn desc limit 1;