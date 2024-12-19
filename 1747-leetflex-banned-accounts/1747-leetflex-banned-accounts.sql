# Write your MySQL query statement below

select a.account_id
from loginfo a
cross join loginfo b
where a.account_id=b.account_id and a.ip_address!=b.ip_address
    and a.logout >= b.login and a.login <= b.logout
group by a.account_id