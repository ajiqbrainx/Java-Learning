--A foreign key is a column in one table that refers to the primary key of another table.
--It's a link between two tables, establishing a relationship between them.
--Think of it as a way to say,
--"This data in this table is related to this specific data in that other table."

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(50),
    DepartmentID INT
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);


--When you use the CONSTRAINT keyword,
--you explicitly name the foreign key constraint.
--This is helpful for future reference (e.g., if you need to drop or modify the constraint later)
-- and for clarity in larger database designs.
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(50),
    DepartmentID INT
    CONSTRAINT cons_emp_fk foreign KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);