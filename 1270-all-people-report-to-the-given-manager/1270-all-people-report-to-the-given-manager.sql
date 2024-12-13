# Write your MySQL query statement below

select a.employee_id
from employees a
left join employees b on b.employee_id=a.manager_id
left join employees c on c.employee_id=b.manager_id
where c.manager_id = 1 and a.employee_id !=1