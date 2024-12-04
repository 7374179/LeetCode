# Write your MySQL query statement below

select t1.sum as shortest
from (
    select if(a.x != b.x, sum(a.x-b.x), 1000) as sum
    from point a
    cross join point b
    group by a.x, b.x
) as t1
group by t1.sum
having t1.sum>0
order by t1.sum
limit 1