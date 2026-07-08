select p.product_id, ifnull(t.new_price, 10) as price 
from (select distinct product_id from Products) p left join(
select p1.product_id , p1.new_price from Products p1 join (select product_id , max(change_date) as change_date 
    from Products
    where change_date <= '2019-08-16'
    group by product_id
    ) p2
on p1.product_id = p2.product_id
and p1.change_date = p2.change_date) t on p.product_id = t.product_id



