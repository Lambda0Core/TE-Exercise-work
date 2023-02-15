-- 20. The state abbreviation, and population of the city with the largest population (name column 'city_population') for all states, territories, and districts.
-- Order the results from highest to lowest populations.
-- (56 rows)
<<<<<<< HEAD
SELECT state_abbreviation, MAX(population) as city_population
from city
GROUP BY state_abbreviation
ORDER BY city_population DESC;
=======
>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

