-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population
FROM state
ORDER BY population DESC, state_name ASC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region
from state
ORDER BY census_region DESC, state_name ASC;

-- The biggest park by area
SELECT park_name
from park
ORDER by area DESC
LIMIT 1;

-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name
from city
ORDER BY population DESC
LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.

SELECT 
	park_name, 
	-- CURRENT_DATE - date_established as age
	 (CURRENT_DATE - date_established) /365 as age365,
	date_part('year', CURRENT_DATE) - date_part('year', date_established) as ageDatePart,
	Extract(year from CURRENT_DATE) - EXTRACT(year from date_established) as age
from park
ORDER BY age DESC
LIMIT 20;

-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name || ' (' || state_abbreviation || ')'   as state_abbreviation
from city
order by city_name;

-- The all parks by name and date established.
SELECT 'Name: ' || park_name || ' Date Established: ' || date_established as park_date_established
from park
order by park_name;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT census_region || ': ' || state_name as region_and_state
FROM state
WHERE census_region ILIKE '%west'
order by  region_and_state;


-- AGGREGATE FUNCTIONS

SELECT * from state;
SELECT COUNT(*) FROM state;
SELECT COUNT(state_nickname) FROM state;

SELECT  state_abbreviation, 
		COUNT(city_name) 
FROM city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS average_population
FROM state;

-- Total population in the West and South census regions
SELECT SUM( population) as total_population
FROM state
WHERE census_region = 'West'
OR census_region = 'South';

-- The number of cities with populations greater than 1 million
SELECT COUNT(city_name), COUNT(population)
FROM city
WHERE population > 1000000;

-- The number of state nicknames.
SELECT  COUNT(state_nickname) as nickname_count,
		COUNT(*) as row_count
from state;


SELECT count(city_name) as city_count,
	   count(distinct city_name) as distinct_city_name
from city;
-- The area of the smallest and largest parks.
SELECT MIN(area) as smallest, MAX(area) as largest
from park;

SELECT state_name , population as max_population
from state
ORDER BY max_population DESC;

SELECT state_name , MAX(population) as max_population
from state
GROUP BY state_name
ORDER BY max_population DESC 
LIMIT 1;
-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT(city_name) as cities, state_abbreviation
from city
GROUP BY  state_abbreviation
order by cities DESC;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT has_camping, AVG(area) as average_park_area
from park
GROUP BY has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM(population) as total_city_population
from city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;


-- The smallest city population in each state ordered by city population.
SELECT state_abbreviation, MIN(population) as min_city_population
from city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;

-- HAVING
-- find duplicate city names

SELECT city_name,   COUNT(*) as dup_count
from city
GROUP BY city_name
HAVING  COUNT(*) > 1
ORDER BY dup_count DESC;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT city_name, state_abbreviation, population
from city
ORDER BY city_name, state_abbreviation
OFFSET (10 * 2) ROWS FETCH NEXT 10 ROWS ONLY;


-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT COUNT(city.city_name) as cities,
	  -- city.state_abbreviation
	  (SELECT state_name from state Where state.state_abbreviation = city.state_abbreviation) as stateName
from city 
group by city.state_abbreviation
ORDER BY cities DESC;


-- N (56 * N)
-- Include the names of the smallest and largest parks
SELECT park.park_name, 
		park.area ,
		CASE WHEN park.area = temp.smallest THEN 'SMALLEST' 
			 WHEN park.area > 100 THEN '100'
			 ELSE 'LARGEST' END as park_size
from park,
( SELECT MIN(area) as smallest, 
 		MAX(area) as largest
		from park
		WHERE area > 0) as temp
WHERE park.area = temp.smallest 
OR park.area = temp.largest
ORDER BY CASE when park.area > 100 THEN 0 ELSE 1 END ;

-- List the capital cities for the states in the Northeast census region.
SELECT state.state_abbreviation,
		(SELECT city.city_name FROM city WHERE city.city_id = state.capital LIMIT 1) as city
from state
WHERE state.census_region = 'Northeast'
AND state.state_abbreviation =  (
									SELECT state_abbreviation from state where state_abbreviation in ('CT', 'MA') LIMIT 1)
ORDER BY state.state_abbreviation;

