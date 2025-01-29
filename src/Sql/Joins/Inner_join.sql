CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50)
);

-- Insert data into Departments table
INSERT INTO Departments (DepartmentID, DepartmentName) VALUES
(101, 'HR'),
(102, 'IT'),
(104, 'Finance');

--select * from Departments

--output

--"departmentid"	"departmentname"
--101	                "HR"
--102	                "IT"
--104	                "Finance"


CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(50),
    DepartmentID INT
--    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);


INSERT INTO Employees (EmployeeID, Name, DepartmentID) VALUES
(1, 'John', 101),
(2, 'Alice', 102),
(3, 'Bob', 103),
(4, 'Eve', 101);

--select * from Employees

--"employeeid"	"name"	"departmentid"
--    1	          "John"	101
--    2	          "Alice"	102
--    3	          "Bob"	    103
--    4	          "Eve"	    101

select Employees.EmployeeID , Employees.Name ,Departments.DepartmentName
 from Employees inner join Departments on Employees.DepartmentId = Departments.DepartmentID;

--output

-- employeeid	  name	departmentid
-- 1	         John	      101
-- 2	         Alice	      102
-- 4	         Eve	      101