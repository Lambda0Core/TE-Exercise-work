-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)
SELECT DISTINCT genre.genre_name 
FROM genre
JOIN movie_genre ON movie_genre.genre_id = genre.genre_id
JOIN movie_actor ON movie_genre.movie_id = movie_actor.movie_id
JOIN person ON movie_actor.actor_id = person.person_id
JOIN movie ON movie.movie_id = movie_genre.movie_id
-- WHERE person_name = 'Robert De Niro'
WHERE extract(year from movie.release_date) >= 2010 
AND person_name = 'Robert De Niro'
ORDER BY genre.genre_name

