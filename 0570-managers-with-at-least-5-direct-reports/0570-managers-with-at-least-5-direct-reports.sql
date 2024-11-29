# Write your MySQL query statement below

select a.name
from employee a
join(
    select managerId
    from employee
    group by managerId
    having count(managerId)>=5
) as t1 
on a.id = t1.managerId