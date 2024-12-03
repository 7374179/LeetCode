# Write your MySQL query statement below

select t1.name as results
from (
    select m.user_id, u.name, count(m.user_id) as tmp
    from movieRating m
    left join users u on u.user_id = m.user_id
    group by m.user_id
    order by tmp desc, u.name asc
    limit 1
) as t1
left join users u on u.user_id = t1.user_id
group by u.user_id

union all
select title as results
from 
(
    select m.movie_id, rating, mo.title, avg(rating) as tmp2
    from movieRating m
    left join movies mo on mo.movie_id = m.movie_id
    where created_at between '2020-02-01' and '2020-02-28'
    group by m.movie_id
    order by tmp2 desc, mo.title asc
    limit 1
) as t2

