-- Q1
SELECT name FROM Reviewers
LEFT JOIN Rating ON Reviewer.rID = Rating.rID
LEFT JOIN Movie ON Movie.mID = Rating.mID
WHERE Movie.title = "Gone with the Wind";

-- Q2
SELECT Reviewer.name,
Movie.title,
Rating.stars
FROM Reviewer
INNER JOIN Rating ON Reviewer.rID = Rating.rID
INNER JOIN Movie ON Rating.mID = Movie.mID
WHERE Reviewer.name = Movie.Director;