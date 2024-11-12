# Write your MySQL query statement below

select contest_id, round((tmp * 100/ 
(
    select count(*)
    from users
)), 2) as percentage
from users u
left join (select contest_id, user_id, count(contest_id) as tmp
from register
group by contest_id 
) as t
on t.user_id = u.user_id
group by contest_id
having contest_id is not null
order by percentage DESC, contest_id ASC


