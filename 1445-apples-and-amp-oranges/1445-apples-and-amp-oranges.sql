# Write your MySQL query statement below

select a.sale_date, (
    case when a.sale_date=b.sale_date and a.fruit='apples' and b.fruit='oranges' then a.sold_num-b.sold_num
    else 0
    end
) as diff
from sales a
left join sales b on b.sale_date = a.sale_date
group by a.sale_date
order by a.sale_date