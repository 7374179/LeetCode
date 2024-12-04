# Write your MySQL query statement below

select c.title as TITLE
from content c
left join tvprogram t on t.content_id = c.content_id
where year(program_date)='2020' and month(program_date)='06' and kids_content='Y' and content_type='Movies'
group by TITLE