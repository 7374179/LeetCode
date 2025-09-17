# Write your MySQL query statement below

select s.product_id, sum(quantity) as total_quantity
from sales s
left join product p on p.product_id = s.product_id
group by s.product_id;