# Write your MySQL query statement below

select distinct l3.num as ConsecutiveNums from logs l1,logs l2,logs l3
where l3.id=l2.id+1 and l2.id=l1.id+1
and l1.num=l2.num and l2.num=l3.num;