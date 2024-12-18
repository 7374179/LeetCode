# Write your MySQL query statement below

select team_id, team_name, sum(
    case when team_id=host_team and host_goals>guest_goals then 3
        when team_id=guest_team and host_goals<guest_goals then 3
        when team_id=host_team and host_goals=guest_goals then 1
        when team_id=guest_team and host_goals=guest_goals then 1
        else 0
        end
    ) as num_points
from teams t
left join matches m on m.host_team=t.team_id or m.guest_team=t.team_id
group by team_id
order by num_points desc, team_id