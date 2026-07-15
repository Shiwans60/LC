select c.visited_on, (select sum(c2.amount) from Customer c2 where visited_on between Date_sub(c.visited_on, interval 6 day) and c.visited_on) as amount , round((select sum(c2.amount) from Customer c2 where visited_on between Date_sub(c.visited_on, interval 6 day) and c.visited_on) / 7, 2) as average_amount
from (select distinct visited_on from Customer) c
where c.visited_on >= (select date_add(min(visited_on), interval 6 day) from Customer)
order by visited_on asc

