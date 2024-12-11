# Write your MySQL query statement below

select transaction_id
from transactions
where (day, amount) in (
    select day, max(amount)
    from transactions
    group by day
)
order by transaction_id