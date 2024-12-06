# Write your MySQL query statement below

select s.seller_name
from seller s
left join orders o on o.seller_id = s.seller_id
where s.seller_id not in(
    select seller_id
    from orders
    where year(sale_date)='2020'
)
order by s.seller_name asc