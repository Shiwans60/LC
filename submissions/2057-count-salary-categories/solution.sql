Select "Low Salary" as category, count(income) as accounts_count
from Accounts a
where a.income < 20000
union 
Select "Average Salary" as category, count(income) as accounts_count
from Accounts a
where a.income >= 20000 and a.income <= 50000
union 
Select "High Salary" as category, count(income) as accounts_count
from Accounts a
where a.income > 50000
