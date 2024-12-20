# Write your MySQL query statement below

select player_id, player_name, sum(player_id=wimbledon)+sum(player_id=fr_open)+sum(player_id=us_open)+sum(player_id=au_open) as grand_slams_count
from championships
left join players on wimbledon = player_id or fr_open=player_id or us_open=player_id or au_open=player_id
group by player_id
