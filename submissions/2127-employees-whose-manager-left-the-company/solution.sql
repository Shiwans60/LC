select e.employee_id as employee_id
from Employees e left join Employees e2
on e.manager_id = e2.employee_id 
where e2.employee_id is null and e.manager_id is not null and e.salary < 30000
order by e.employee_id asc
