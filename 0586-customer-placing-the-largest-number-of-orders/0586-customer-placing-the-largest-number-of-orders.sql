# Write your MySQL query statement below

select customer_number
from (
    select *, count(customer_number) as tmp
    from orders
    group by customer_number
) as t1
order by tmp desc
limit 1