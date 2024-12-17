# Write your MySQL query statement below

select o.customer_id, c.customer_name
from orders o
left join customers c on c.customer_id = o.customer_id
group by o.customer_id
having sum(product_name='A')>0 and sum(product_name='B')>0 and sum(product_name='C')=0