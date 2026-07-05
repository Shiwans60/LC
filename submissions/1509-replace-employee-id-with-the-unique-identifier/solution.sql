# Write your MySQL query statement below
select unique_id as unique_id , name as name from Employees e left join EmployeeUNI e2 on e.id = e2.id
