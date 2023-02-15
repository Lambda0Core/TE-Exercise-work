-- SELECT
-- Use a SELECT statement to return a literal string
<<<<<<< HEAD
SELECT 'Hello World!';
Select 'Hello Class';

-- Use a SELECT statement to add two numbers together (and label the result "sum")

SELECT 2+2 AS sum,
       2 + 3 AS incrementalSum;

-- SELECT ... FROM
-- Write queries to retrieve...
select state_abbreviation, state_name
from state;

=======


-- Use a SELECT statement to add two numbers together (and label the result "sum")



-- SELECT ... FROM
-- Write queries to retrieve...
>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

-- The names from all the records in the state table


-- The names and populations of all cities
<<<<<<< HEAD
SELECT city,
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
FROM PUBLIC.park;

select distinct state_abbreviation
from city
WHERE state_abbreviation = 'OH';
=======


-- All columns from the park table


>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

-- SELECT __ FROM __ WHERE
-- Write queries to retrieve...

-- The names of cities in California (CA)
<<<<<<< HEAD
select city_name, population
from city
WHERE state_abbreviation = 'CA';

-- The names and state abbreviations of cities NOT in California
select city_name, population
from city
WHERE state_abbreviation <> 'CA';

-- The names and areas of cities smaller than 25 square kilometers 
SELECT city_name, area
FROM city
WHERE area < 25;

-- The names from all records in the state table that have no assigned census region
select state_name || census_region from state
where census_region IS null;

-- The names and census regions from all records in the state table that have an assigned census region
select state_name, census_region
from state
where census_region IS null;
=======


-- The names and state abbreviations of cities NOT in California


-- The names and areas of cities smaller than 25 square kilometers 


-- The names from all records in the state table that have no assigned census region


-- The names and census regions from all records in the state table that have an assigned census region

>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc


-- WHERE with AND/OR
-- Write queries to retrieve...

-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people


-- The names and census regions of all states (and territories and districts) not in the Midwest region (including those that don't have any census region)


-- The names, areas, and populations of cities in California (CA) or Florida (FL)


-- The names, areas, and populations of cities in New England -- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)



-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_square_meters"
<<<<<<< HEAD
SELECT park_name, (area + 1000000) AS area_in_square_meters
from park;
=======


>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

-- All values vs. distinct values

-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)


-- Do it again, but without the repeats (note the difference in row count)



-- LIKE
-- Write queries to retrieve...

-- The names of all cities that begin with the letter "A"
<<<<<<< HEAD
select city_name
from city
where city_name
LIKE 'A%';
=======

>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

-- The names of all cities that end with "Falls"


-- The names of all cities that contain a space
<<<<<<< HEAD
SELECT park_name, area
from park
WHERE area between 100 and 200;

-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers
SELECT park_name, date_established
FROM park
WHERE date_established < '1/1/1900';
=======



-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers

>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc


-- DATES
-- Write a query to retrieve the names and dates established of parks established before 1900
<<<<<<< HEAD
SELECT park_name, date_established
FROM park
WHERE date_established::date < date '1900-01-01';
=======

>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc
