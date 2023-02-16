-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
INSERT INTO genre(genre_id, genre_name)
VALUES (1337, 'Sports');
-- Why yes, I was active online in the 2000s!

-- Insert into movie_genre
INSERT INTO movie_genre
VALUES (7214, 1337);
