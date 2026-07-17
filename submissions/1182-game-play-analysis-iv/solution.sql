select round(( select count(distinct a2.player_id)) /(select count(distinct player_id) from Activity), 2) as fraction
from (select player_id, min(event_date) as firstlogin from Activity group by player_id) a1 join Activity a2 
on a1.player_id = a2.player_id 
and a2.event_date = date_add(a1.firstlogin, interval 1 day)

