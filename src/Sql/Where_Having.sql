--If there's no GROUP BY, always use WHERE.

--"employeeid"	"name"	"departmentid"
--    1	        "John"	    101
--    2	        "Alice"	    102
--    3	        "Bob"	    103
--    4	        "Eve"	    101


select Employees.EmployeeId , Employees.Name ,Employees.DepartmentId
from Employees
where Employees.DepartmentID > 101 ;

--output

--"employeeid"	"name"	"departmentid"
--    2	        "Alice"	    102
--    3	        "Bob"	    103


--count aggregator

select Employees.DepartmentId , count(*) as empcount
from Employees
group by DepartmentId
having count(*) > 0

--output

--"departmentid"	"empcount"
--    101	            2
--    103	            1
--    102	            1


SELECT SUM(DepartmentID) AS TotalDepartmentID
FROM Employees
HAVING SUM(DepartmentID) > 0;


