select ifnull(max(num), null) as num
from (select num 
    from MyNumbers
    group by num
    having count(num) = 1)
as t


