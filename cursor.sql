

Declare c is select * from emp_information where emp_no<=2;
tmp emp_information%rowtype;

Begin

Open c;

for tmp in c loop
