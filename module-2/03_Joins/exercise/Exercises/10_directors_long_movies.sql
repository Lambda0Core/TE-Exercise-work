-- 10. The names of directors who have directed a movie over 3 hours [180 minutes], sorted alphabetically.
-- (15 rows)
SELECT DISTINCT director.person_name
FROM movie
JOIN person as director
ON director.person_id = movie.director_id
WHERE movie.length_minutes > '180'
ORDER BY director.person_name;
