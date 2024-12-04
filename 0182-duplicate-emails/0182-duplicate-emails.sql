# Write your MySQL query statement below

select email as Email
from (
    select *, 
    count(email) as tmp
    from person
    group by email
) as t1
where tmp >1