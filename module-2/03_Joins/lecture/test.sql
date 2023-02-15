select * from one;
select * from two;

select one.number, one.description, two.number, two.description
from one
INNER JOIN two
    on two.number = one.number;
----------------------------------
select one.number, two.description
from one
INNER JOIN two
    on two.number = one.number;
	

----------------------------------
select one.*, two.*
from one
LEFT JOIN two
     on two.number = one.number;
	 
----------------------------------
select one.*, two.*
from two
RIGHT JOIN one
    ON two.number = one.number;
	
	
-----------------------------------
select one.*, two.*
from two
FULL OUTER JOIN one
     ON two.number = one.number;
	 
------------------------------------
select one.*, two.*
from one
LEFT JOIN two
   on two.number = one.number
   WHERE two.number IS NULL;