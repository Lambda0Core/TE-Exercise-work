-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)
SELECT movie.title
FROM movie
JOIN collection
ON collection.collection_id = movie.collection_id

JOIN person as director
ON director.person_id = movie.director_id
WHERE director.person_name <> 'George Lucas'
AND collection_name = 'Star Wars Collection'
ORDER BY movie.title;

