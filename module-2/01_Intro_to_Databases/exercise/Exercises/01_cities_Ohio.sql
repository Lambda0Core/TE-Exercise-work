-- 1. The name and population of all cities in Ohio (OH) (6 rows)
select city_name, population
from city
WHERE state_abbreviation = 'OH';
