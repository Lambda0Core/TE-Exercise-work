-- SELECT
-- Use a SELECT statement to return a literal string
SELECT 'Hello World!';
SELECT 'Hello Class';


-- Use a SELECT statement to add two numbers together (and label the result "sum")

SELECT 2 + 2 AS sum, 
	   2 + 3 AS incrementedSum;

-- SELECT ... FROM
-- Write queries to retrieve...

select state_abbreviation, state_name
from state;
-- The names from all the records in the state table


-- The names and populations of all cities
SELECT  city, 
		population, 
		state_abbreviation, 
		area
from city;

-- All columns from the park table
SELECT * 
FROM park;

select 
	park_id,
	park_name,
	date_established,
	area
from public.park;


select distinct state_abbreviation
from city;
-- SELECT __ FROM __ WHERE
-- Write queries to retrieve...

-- The names of cities in California (CA)
SELECT city_name
FROM city
WHERE state_abbreviation = 'CA';

-- The names and state abbreviations of cities NOT in California
SELECT city_name, state_abbreviation
from city
WHERE state_abbreviation <> 'CA';

-- The names and areas of cities smaller than 25 square kilometers 
SELECT city_name, area, population
FROM city
WHERE area < 25;

-- The names from all records in the state table that have no assigned census region
select state_name 
from state
where census_region IS NULL;

-- The names and census regions from all records in the state table that have an assigned census region
select state_name , census_region
from state
where census_region IS NOT NULL;


-- WHERE with AND/OR
-- Write queries to retrieve...

-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people
SELECT city_name, area, population
FROM city
WHERE area < 25 
AND population > 100000;


-- The names and census regions of all states (and territories and districts) 
-- not in the Midwest region (including those that don't have any census region)

SELECT state_name, census_region
from state
WHERE census_region <> 'Midwest'
OR census_region is NULL;


-- The names, areas, and populations of cities in California (CA) or Florida (FL)

SELECT city_name, area, population
from city
where state_abbreviation = 'CA'
OR state_abbreviation = 'FL';


-- The names, areas, and populations of cities in New England 
-- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)
SELECT city_name, area, population
from city
where state_abbreviation in ('CT', 'ME','MA', 'NH', 'RI', 'VT')
;


-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_square_meters"
SELECT park_name, (area * 1000000) AS area_in_square_meters 
from park;


-- All values vs. distinct values

-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)
SELECT city_name
from city;

-- Do it again, but without the repeats (note the difference in row count)
SELECT DISTINCT city_name
from city;


-- LIKE
-- Write queries to retrieve...

-- The names of all cities that begin with the letter "A"
SELECT city_name
from city
WHERE city_name LIKE 'A%';

-- The names of all cities that end with "Falls"
SELECT city_name
from city
WHERE city_name LIKE '%Falls';

-- The names of all cities that contain a space
SELECT city_name
from city
WHERE city_name LIKE '% %';


-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers
SELECT park_name, area
FROM park
WHERE area >= 100
and area <= 200;


SELECT park_name, area
FROM park
WHERE area between 100 and 200;


-- DATES
-- Write a query to retrieve the names and dates established of parks established before 1900
SELECT park_name, date_established
FROM park
WHERE date_established < '1/1/1900';

--Timestamp
SELECT park_name, date_established
FROM park
WHERE date_established::date < date '1900-01-01';
