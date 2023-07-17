# Write your MySQL query statement below


delete b
from person a,person b
where a.email=b.email and a.id<b.id;