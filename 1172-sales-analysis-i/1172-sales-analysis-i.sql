# Write your MySQL query statement below

with aggregated_sales as (
    select 
        seller_id,
        sum(price) as total_price
    from
        sales 
    group by
        seller_id
)
select
    seller_id
from
    aggregated_sales
where total_price = (
    select
        max(total_price)
    from
        aggregated_sales
);