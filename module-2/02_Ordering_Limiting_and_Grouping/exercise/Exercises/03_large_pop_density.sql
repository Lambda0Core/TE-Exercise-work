-- 3. The name, population, area, and population density (name the column 'population_density') of cities with more than 5,000 people per square kilometer.
-- Population density is expressed as people per square kilometer. In other words, population divided by area.
-- Order the results by population density, highest number first.
-- (9 rows)
<<<<<<< HEAD
SELECT city_name, population, area, (population/area) AS population_density
FROM city
WHERE population/area > 5000
ORDER BY population / area DESC;
=======

>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc
