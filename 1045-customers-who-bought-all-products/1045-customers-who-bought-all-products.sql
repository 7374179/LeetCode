# Write your MySQL query statement below

select customer_id
from 
    (
        select *, count(distinct product_key) as tmp
        from customer
        group by customer_id
    ) as t1
where t1.tmp = (
    select count(product_key)
    from product
)