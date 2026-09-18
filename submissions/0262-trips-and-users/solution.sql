# Write your MySQL query statement below
select t.request_at as Day , round( sum(t.status <> 'completed')/count(*),2)  as 'Cancellation Rate' 
from Trips t join Users u 
on t.driver_id = u.users_id
join Users d
on t.client_id = d.users_id
where u.banned = 'No'
and d.banned = 'No'
and t.request_at between '2013-10-01' and '2013-10-03'
group by t.request_at
