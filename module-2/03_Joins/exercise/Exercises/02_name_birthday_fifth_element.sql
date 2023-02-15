-- 2. The names and birthdays of actors in "The Fifth Element"
-- Order the results alphabetically (A-Z) by name.
-- (15 rows)
SELECT actor.person_name, actor.birthday
FROM movie
INNER JOIN movie_actor
	    on movie_actor.movie_id = movie.movie_id
		INNER JOIN person as actor
		ON actor.person_id = movie_actor.actor_id
		WHERE movie.title = 'The Fifth Element'
		ORDER BY actor.person_name;
