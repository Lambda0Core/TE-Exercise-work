-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)
SELECT DISTINCT actor.person_name
FROM movie
JOIN collection
ON collection.collection_id = movie.collection_id
JOIN movie_actor 
ON movie.movie_id = movie_actor.movie_id
JOIN person as actor
ON movie_actor.actor_id = actor.person_id
-- JOIN person as actor
-- ON actor.person_id = movie.director_id
-- WHERE actor.person_name <> 'George Lucas'
-- AND
WHERE collection_name = 'Back to the Future Collection'
ORDER BY actor.person_name;

