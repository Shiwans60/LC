select s.id , (case when s.id = (select Max(id) from Seat) and s.id%2 = 1 then student when s.id%2 = 1 then (select student from Seat s2 where s2.id = s.id + 1) else (select student from Seat s2 where s2.id = s.id -1) end) as student 
from Seat s

