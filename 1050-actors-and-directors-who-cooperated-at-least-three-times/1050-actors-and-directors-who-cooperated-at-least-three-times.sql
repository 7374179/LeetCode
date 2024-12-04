# Write your MySQL query statement below

select actor_id, director_id
from (
    select *, count(actor_id) as tmp
    from actorDirector
    group by actor_id, director_id
) as t1
where tmp >= 3