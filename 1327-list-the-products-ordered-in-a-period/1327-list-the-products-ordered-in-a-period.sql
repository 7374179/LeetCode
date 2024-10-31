# Write your MySQL query statement below

select product_name, sum(unit) as unit
from orders o
left join products p on o.product_id = p.product_id
where order_date>'2020-01-31' and order_date<'2020-03-01'
group by product_name
having unit >= 100