select q.query_name, round(avg(q.rating/q.position), 2) as quality, round(count(case when q.rating < 3 then 1 end) * 100/count(q.rating), 2) as poor_query_percentage
from Queries q
group by q.query_name 
