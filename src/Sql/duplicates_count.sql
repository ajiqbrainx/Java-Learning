--count the duplicates of departmentid

select departmentid , count (*) as countNumber
from employees
group by departmentid
having count(*) >0