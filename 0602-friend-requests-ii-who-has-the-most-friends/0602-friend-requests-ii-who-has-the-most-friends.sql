# Write your MySQL query statement below

with tmp as(
    select requester_id as id
    from requestAccepted
    union all
    select accepter_id as id
    from requestAccepted
)
select id, count(id) as num
from tmp
group by id
order by num DESC
limit 1