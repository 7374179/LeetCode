# Write your MySQL query statement below

select b.Id
from weather a, weather b
where dateDiff(b.recordDate, a.recordDate)=1 and a.temperature < b.temperature
group by b.id