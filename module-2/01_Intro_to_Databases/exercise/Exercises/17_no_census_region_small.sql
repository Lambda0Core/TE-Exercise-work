-- 17. The name, population, and area of all records in the state table with no census region (NULL) and area less than 5000 square kilometers (3 rows)
<<<<<<< HEAD
SELECT state_name, population, area
FROM state
WHERE census_region IS null AND area < 5000;
=======

>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc
