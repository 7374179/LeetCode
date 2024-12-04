# Write your MySQL query statement below

select u.name, sum(t.amount) as balance
from users u
left join transactions t on t.account = u.account
group by u.name
having balance > 10000