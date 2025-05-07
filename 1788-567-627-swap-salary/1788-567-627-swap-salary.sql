# Write your MySQL query statement below

update salary
set
    sex = CASE sex
        WHEN 'm' then 'f'
        ELSE 'm'
    END;