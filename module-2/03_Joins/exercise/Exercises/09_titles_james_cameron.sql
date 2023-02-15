-- 9. The titles of movies directed by James Cameron, sorted alphabetically.
-- (6 rows)
SELECT movie.title
FROM movie
JOIN person as director
ON director.person_id = movie.director_id
WHERE director.person_name = 'James Cameron'
ORDER BY movie.title;