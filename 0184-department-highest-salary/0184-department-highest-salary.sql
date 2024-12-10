# Write your MySQL query statement below

select d.name as Department, e.name as Employee, salary as Salary
from employee e
left join department d on d.id = e.departmentId
where (departmentId, salary) in (
    select departmentId, max(salary)
    from employee
    group by departmentId
)