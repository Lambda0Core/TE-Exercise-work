-- 13. The directors of the movies in the "Harry Potter Collection", sorted alphabetically.
-- (4 rows)
SELECT DISTINCT director.person_name
FROM movie
JOIN collection
ON collection.collection_id = movie.collection_id
JOIN person as director
ON director.person_id = movie.director_id
WHERE collection_name = 'Harry Potter Collection'
ORDER BY director.person_name;