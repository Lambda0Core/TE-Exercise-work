-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)
SELECT DISTINCT actor.person_name, actor.birthday
FROM person as actor
JOIN movie_actor
ON movie_actor.actor_id = actor.person_id
JOIN movie
ON movie.movie_id = movie_actor.movie_id
WHERE extract(year from movie.release_date) = 1985
AND extract(year from actor.birthday) BETWEEN 1950 AND 1959
ORDER BY actor.birthday ASC;
