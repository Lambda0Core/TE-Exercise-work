-- 19. The genre name and the number of movies in each genre. Name the count column 'num_of_movies'.
-- Order the results from the highest movie count to the lowest.
-- (19 rows, the highest expected count is around 400).
SELECT genre.genre_name, count(movie.title) as num_of_movies
FROM genre
JOIN movie_genre
ON genre.genre_id = movie_genre.genre_id
JOIN movie
ON movie_genre.movie_id = movie.movie_id
GROUP BY genre.genre_name
ORDER BY count(movie.title) DESC;

-- SELECT person_name, COUNT(movie_id) AS num_of_movies
-- FROM person p
-- LEFT JOIN movie_actor ma ON p.person_id = ma.actor_id
-- WHERE person_name LIKE 'George %'
-- GROUP BY person_id, person_name
-- ORDER BY person_name
