-- 11. The name, state, and population of all cities in Colorado (CO) or Arizona (AZ) (22 rows)
select city_name, state_abbreviation, population
from city
WHERE state_abbreviation = 'CO' OR  state_abbreviation = 'AZ';

