# Write your MySQL query statement below

select name as customers
from customers c
left join orders o on o.customerId = c.id
where customerId is null