# Write your MySQL query statement below

select c.customer_id, c.name
from orders o
left join customers c on c.customer_id = o.customer_id
left join product p on p.product_id = o.product_id
where year(order_date)=2020
group by c.customer_id
having sum(if (month(order_date)=06, quantity, 0) * price) >=100 and
sum(if(month(order_date)=07, quantity, 0) * price) >=100