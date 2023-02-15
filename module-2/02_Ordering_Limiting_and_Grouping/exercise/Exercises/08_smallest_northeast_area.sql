-- 8. The area of the smallest state in the "Northeast" census region. Name the column 'smallest_northeast_area'.
-- Expected answer is around 4,000
-- (1 row)
<<<<<<< HEAD
SELECT MIN(area) as smallest_northeast_area
FROM state
WHERE census_region = 'Northeast';

=======
>>>>>>> 351c55f855de2bba0e210a8598bc0632118bbadc

