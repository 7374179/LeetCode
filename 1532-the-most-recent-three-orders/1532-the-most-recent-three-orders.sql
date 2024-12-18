# Write your MySQL query statement below

select name as customer_name, t1.customer_id, t1.order_id, t1.order_date
from(
    select o.order_id, o.order_date, o.customer_id, c.name, rank() over(partition by o.customer_id order by order_date desc) as tmp
    from orders o
    left join customers c on c.customer_id = o.customer_id
) as t1
where t1.tmp <=3
order by customer_name, t1.customer_id, t1.order_date desc