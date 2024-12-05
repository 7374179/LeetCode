# Write your MySQL query statement below

select user_id, time_stamp as last_stamp
from logins
where (user_id, time_stamp) in (
    select user_id, max(time_stamp)
    from logins
    where year(time_stamp)='2020'
    group by user_id
)