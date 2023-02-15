-- 21. The census region, and the average, minimum, and maximum population of states and districts in each census region. Exclude ones that don't have a census region.
-- Name the population columns 'average_population, 'min_population', and 'max_population'.
-- Order the results from lowest to highest average population.
-- (4 rows)
<<<<<<< HEAD
SELECT census_region, AVG(population) AS average_population, MIN(population) AS min_population, MAX(population) AS max_population
FROM state
WHERE state.census_region IS NOT null
GROUP BY census_region
ORDER BY average_population ASC;
=======
>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

