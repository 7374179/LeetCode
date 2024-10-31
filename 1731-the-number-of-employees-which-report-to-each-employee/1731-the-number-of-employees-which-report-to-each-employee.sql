# Write your MySQL query statement below

select a.employee_id, a.name, count(b.name) as reports_count, round(avg(b.age)) as average_age
from employees a
left join employees b on a.employee_id = b.reports_to
group by a.employee_id
having reports_count>0
order by a.employee_id
