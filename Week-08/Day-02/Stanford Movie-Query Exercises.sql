-- Q1
SELECT title FROM Movie 
WHERE director = "Steven Spielberg";

-- Q2
SELECT DISTINCT Year FROM Movie
LEFT JOIN Rating ON Movie.mID = Rating.mID
WHERE stars = "4" OR stars = "5"
ORDER BY Movie.Year;

-- Q3
SELECT title from Movie
LEFT JOIN Rating ON Movie.mID = Rating.mID
WHERE stars IS NULL;

-- Q4
SELECT name FROM Reviewer
LEFT JOIN Rating ON Reviewer.rID = Rating.rID
WHERE ratingDate IS NULL;

-- Q5
SELECT Reviewer.name,
Movie.title,
Rating.stars,
Rating.ratingDate
FROM Reviewer
INNER JOIN Rating ON Reviewer.rID = Rating.rID
INNER JOIN Movie ON Rating.mID = Movie.mID
ORDER BY Reviewer.name, Movie.title, Rating.stars;