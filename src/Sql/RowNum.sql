--ROW_NUMBER() method will fetch the top of the rows
-- Here i am getting the departmentid top 3 give its getting the top three

SELECT *
FROM (
    SELECT *, ROW_NUMBER() OVER (ORDER BY departmentid DESC) AS row_num
    FROM Employees
) WHERE row_num <= 3;


SELECT *
FROM (
    SELECT *, ROW_NUMBER() OVER (ORDER BY Employees.Name DESC) AS row_num
    FROM Employees
) WHERE row_num <= 3;