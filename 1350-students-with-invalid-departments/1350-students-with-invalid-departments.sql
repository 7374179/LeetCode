# Write your MySQL query statement below

select s.id, s.name
from students s
left join departments d on s.department_id = d.id
where s.department_id not in (
    select id
    from departments
)