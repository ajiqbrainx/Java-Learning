--  Used when a result from one query is needed for another

SELECT Employees.Name , Employees.DepartmentID
FROM Employees
where DepartmentID = (select DepartmentID from Departments where Departments.DepartmentName = 'IT')

-- JOIN is used to combine rows from multiple tables based on a related column.

SELECT Employees.Name , Departments.DepartmentName
FROM Employees
left join Departments on Departments.DepartmentID = Employees.DepartmentID


