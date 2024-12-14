# Write your MySQL query statement below

select left_operand, operator, right_operand,
    (case
        when operator = '>' and v1.value > v2.value then 'true'
        when operator = '<' and v1.value < v2.value then 'true'
        when operator = '=' and v1.value = v2.value then 'true'
        else 'false'
        end
    )
    as value 
from expressions e
left join variables v1 on v1.name = e.left_operand
left join variables v2 on v2.name = e.right_operand
