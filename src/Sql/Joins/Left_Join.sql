-- Its return the all values in employee table if department Id is not in department table
-- It will put the null value

select Employees.EmployeeID , Employees.Name ,Departments.DepartmentName
 from Employees left join Departments on Employees.DepartmentId = Departments.DepartmentID;

SELECT order_id,item,first_name FROM Orders
left join Customers on Customers.customer_id = Orders.customer_id;

employeeid	  name	departmentid
1	         John	      101
2	         Alice	      102
3	         Bob	      NULL
4	         Eve	      101