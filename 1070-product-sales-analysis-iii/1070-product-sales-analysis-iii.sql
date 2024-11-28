# Write your MySQL query statement below

select a.product_id, year as first_year, quantity, price
from sales a
where (a.product_id, a.year) in (
    select b.product_id, min(b.year)
    from sales b
    group by b.product_id
)