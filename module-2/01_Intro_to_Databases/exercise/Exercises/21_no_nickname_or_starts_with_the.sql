-- 21. The name and nickname for all records in the state table with no official nickname (NULL) or nickname starts with the word "The" (13 rows)
<<<<<<< HEAD
select state_name, state_nickname
from state
where state_nickname IS null OR state_nickname LIKE 'The%'
=======
>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

