--An index is a special data structure
--that improves the speed of data retrieval operationson a database table.
--It works like an index in a book,
--helping the database find rows quickly instead of scanning the entire table.

--    🔹 Without an index, SQL queries scan the entire table (Full Table Scan) to find results.
--    🔹 With an index, SQL can directly access the required data, making queries much faster.
--
--    Think of an index as a sorted list that helps the database locate rows without checking every record.

create index idx_empName on Employees(name);
