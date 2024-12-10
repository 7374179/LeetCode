# Write your MySQL query statement below

select a.seat_id
from cinema a
join cinema b on abs(a.seat_id - b.seat_id)=1
where a.free=true and b.free=true
group by a.seat_id
order by a.seat_id