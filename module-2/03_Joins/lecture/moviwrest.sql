select movie.title, director.person_name as director, actor.person_name as actor
from movie
INNER JOIN person as director
    ON director.person_id = movie.director_id
	INNER JOIN movie_actor
	    on movie_actor.movie_id = movie.movie_id
		INNER JOIN person as actor
		ON actor.person_id = movie_actor.movie_id
		
		WHERE actor.person_name = 'Tom Hanks'