-- Right join its similar to left join it fetch matched results and null its right table
select Employees.EmployeeId ,Departments.DepartmentId
from Employees
right join Departments on Employees.DepartmentId = Departments.DepartmentId