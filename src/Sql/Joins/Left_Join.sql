-- Its return the all values in employee table if department Id is not in department table
-- It will put the null value

select Employees.EmployeeID , Employees.Name ,Departments.DepartmentName
 from Employees left join Departments on Employees.DepartmentId = Departments.DepartmentID;