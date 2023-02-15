-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent first. 
-- (9 rows)
SELECT movie.title
FROM movie
JOIN collection
ON collection.collection_id = movie.collection_id

-- JOIN person as director
-- ON director.person_id = movie.director_id
-- WHERE director.person_name <> 'George Lucas'
-- AND
WHERE collection_name = 'Star Wars Collection'
ORDER BY movie.release_date DESC;
