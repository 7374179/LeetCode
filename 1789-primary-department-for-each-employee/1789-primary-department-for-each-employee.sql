# Write your MySQL query statement below

select t.employee_id, t.department_id
from (
    select employee_id, department_id, primary_flag, count(employee_id) over(partition by employee_id) as emCount
    from employee
) as t
where t.emCount = 1 or t.primary_flag = 'Y'
group by t.employee_id
