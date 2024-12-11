# Write your MySQL query statement below

select p.product_name, o.product_id, o.order_id, o.order_date
from orders o
left join customers c on c.customer_id = o.customer_id
left join products p on p.product_id = o.product_id
where (o.product_id, o.order_date) in (
    select product_id, max(order_date)
    from orders
    group by product_id
)
order by p.product_name, o.order_id