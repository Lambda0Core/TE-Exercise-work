-- 17. The highest population density of all records in the state table. Name the column 'population_density'.
-- Population density is expressed as people per square kilometer. In other words, population divided by area.
-- Exepcted answer is around 4,000
-- (1 row)
<<<<<<< HEAD
SELECT (population/area) AS population_density
from state
ORDER BY (population/area) DESC
LIMIT 1;
=======

>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc
