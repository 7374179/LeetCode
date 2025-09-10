# Write your MySQL query statement below

select q.id, q.year, ifnull(n.npv, 0) as npv
from Queries q
left join npv n on n.id = q.id and n.year = q.year;