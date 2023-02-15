-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie.
-- Order the results by movie title (A-Z)
-- (73 rows)
SELECT movie.title, director.person_name
FROM movie
JOIN movie_actor 
ON movie.movie_id = movie_actor.movie_id
JOIN person as actor 
ON movie_actor.actor_id = actor.person_id
JOIN person as director
ON director.person_id = movie.director_id
WHERE director.person_name = actor.person_name
ORDER BY movie.title;
