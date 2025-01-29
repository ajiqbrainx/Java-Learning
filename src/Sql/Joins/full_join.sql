--It fetch the all values combine the left join and right join

select Employees.EmployeeID , Employees.Name ,Departments.DepartmentName
 from Employees
 full join Departments on Employees.DepartmentId = Departments.DepartmentID;

--output

--employeeid	  name	departmentid
--1	             John	      101
--2	             Alice	      102
--3	             Bob	      NULL
--4	             Eve	      101
--NULL	         NULL	      104
