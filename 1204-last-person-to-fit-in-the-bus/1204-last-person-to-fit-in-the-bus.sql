# Write your MySQL query statement below

select person_name
from(
    select *, sum(weight) over(order by turn) as Total_Weight
    from queue
) as t1
where Total_weight <=1000
group by person_id
order by turn desc
limit 1