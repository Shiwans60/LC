select customer_number 
FROM Orders
group by customer_number
order by count(*) desc
limit 1


