--largest element in the column

select max(departmentid)
from employees

--second largest element in the column
--It wont takes the duplicate value : answer is 103

select max(departmentid)
from employees
where departmentid < (select max(departmentid)from employees)

--largest element in the column

select departmentid
from employees
order by departmentid desc
limit 1 offset 0

--second largest element in the column
--It takes the duplicate value  :  answer is 104
select departmentid
from employees
order by departmentid desc
limit 1 offset 1

--"employeeid"	"name"	"departmentid"
--    1	          "John"	104
--    2	          "Alice"	102
--    3	          "Bob"	    103
--    4	          "Eve"	    104
