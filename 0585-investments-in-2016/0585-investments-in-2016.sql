# Write your MySQL query statement below

select round(sum(tiv_2016), 2) as tiv_2016
from (
    select *,
    count(*) over (partition by tiv_2015) as t1,
    count(*) over (partition by lat, lon) as t2
    from insurance
) as tmp
where t1>1 and t2 =1