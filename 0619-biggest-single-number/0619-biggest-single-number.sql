# Write your MySQL query statement below

select max(num) as num
from 
(
    select num, count(num) as nums
    from mynumbers
    group by num
) as grouped
where grouped.nums = 1
