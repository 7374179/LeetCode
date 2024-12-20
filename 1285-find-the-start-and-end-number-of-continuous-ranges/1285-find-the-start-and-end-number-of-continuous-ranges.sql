# Write your MySQL query statement below

select min(log_id) as start_id, max(log_id) as end_id
from (
    select log_id, row_number() over(order by log_id) as num
    from logs
) as t1
group by t1.log_id - t1.num