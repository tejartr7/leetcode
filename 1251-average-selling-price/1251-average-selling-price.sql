# Write your MySQL query statement below
select a.product_id,
round(sum(b.units*a.price)/sum(b.units),2) as average_price
from prices a
left join unitssold b 
on a.product_id=b.product_id and (b.purchase_date BETWEEN a.start_date AND a.end_date)
group by product_id