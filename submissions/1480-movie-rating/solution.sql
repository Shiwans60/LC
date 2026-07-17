(select u.name as results
from MovieRating m join Users u
on m.user_id = u.user_id
group by m.user_id , u.name
order by count(*) desc , u.name
limit 1)
union all

(select m2.title as results
from MovieRating m join Movies m2
on m.movie_id = m2.movie_id
where year(created_at) = '2020' and month(created_at) = '2'
group by m.movie_id , m2.title
order by avg(m.rating) desc , m2.title
limit 1)

