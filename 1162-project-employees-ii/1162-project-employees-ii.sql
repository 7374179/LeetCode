# Write your MySQL query statement below

select project_id
from (
    select project_id, count(project_id) as cnt
    from project
    group by project_id
) p
where cnt = (
    select max(cnt)
    from (
        select project_id, count(project_id) as cnt
        from project
        group by project_id
    ) as p2
)