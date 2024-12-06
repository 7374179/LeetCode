# Write your MySQL query statement below

select s.name
from salesPerson s
left join orders o  on s.sales_id = o.sales_id
where s.sales_id not in(
    select o.sales_id
    from orders o
    left join company c on c.com_id=o.com_id
    where c.name='RED'
)
group by s.name