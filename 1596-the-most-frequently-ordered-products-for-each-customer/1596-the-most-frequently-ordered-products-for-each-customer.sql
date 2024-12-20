# Write your MySQL query statement below

select t1.customer_id, t1.product_id, t1.product_name
from (
    select c.customer_id, p.product_id, p.product_name, 
            rank() over (partition by c.customer_id order by count(p.product_id) desc) as tmp
    from orders o
    left join customers c on c.customer_id = o.customer_id
    left join products p on p.product_id = o.product_id
    group by c.customer_id, p.product_id
) as t1
where tmp=1