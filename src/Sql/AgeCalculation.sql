select Extract(year from age(dob)) from students
--26

--dob is my column name
--age(dob)  age is method calculate current date to dob date
--so usually its comes 26 years 3 months 3 days
--we just extract the years only 26 that why we used Extract


select age(dob) from students
--26 years 11 months 2 days
