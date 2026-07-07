select round(count(case when order_date = customer_pref_delivery_date then 1 end) * 100/count(distinct customer_id), 2) as immediate_percentage
from Delivery
where(customer_id, order_date) in (
    select d.customer_id, Min(d.order_date) 
from Delivery d
group by d.customer_id)



