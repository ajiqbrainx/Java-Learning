-- add column
alter table employee add emp_mail varchar(100)
-- change column name
alter table employee change emp_mail email varchar(100)
-- change column name in postgresql
alter table employee rename emp_mail to email
-- drop column name
alter table employee drop emp_mail