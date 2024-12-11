# Write your MySQL query statement below

select p.project_id, p.employee_id
from project p
left join employee e on e.employee_id = p.employee_id
where (p.project_id, experience_years) in (
    select pro.project_id, max(experience_years)
    from project pro
    left join employee em on em.employee_id = pro.employee_id
    group by project_id
)