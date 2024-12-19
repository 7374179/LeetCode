# Write your MySQL query statement below

select distinct t1.page_id as recommended_page
from (
    select *
    from likes l 
    left join friendship f  on f.user2_id = l.user_id or f.user1_id=l.user_id
    where user1_id=1 or user2_id=1
) as t1
where (t1.page_id) not in(
    select page_id
    from likes
    where user_id=1
)