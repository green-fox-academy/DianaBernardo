-- Q1
SELECT H2.name
FROM Highschooler H1, Highschooler H2, Friend
where H1.ID = Friend.ID1
and H1.name = 'Gabriel'
and H2.ID = Friend.ID2;


-- Q2
SELECT hs1.name, hs1.grade, hs2.name, hs2.grade
FROM highschooler AS hs1, highschooler AS hs2, likes AS l
WHERE(
hs1.ID = l.ID1
AND l.ID2 = hs2.ID
AND hs1.grade - hs2.grade >= 2
)
OR
(hs1.ID = l.ID2
AND l.ID1 = hs2.ID
AND hs1.grade - hs2.grade >= 2
);


-- Q3
SELECT DISTINCT hs1.name, hs1.grade, hs2.name, hs2.grade
FROM highschooler AS hs1, highschooler AS hs2, likes as l1, likes as l2
WHERE(
hs1.ID = l1.ID1
AND l1.ID2 = hs2.ID
)
AND
(hs2.ID = l2.ID1
AND l2.ID2 = hs1.ID
)
AND hs1.name < hs2.name;


-- Q4
SELECT DISTINCT hs.name, hs.grade 
FROM highschooler AS hs, likes as l
WHERE(
hs.id NOT IN (SELECT ID1 FROM likes)
) AND
(hs.id NOT IN (SELECT ID2 FROM likes)
)
ORDER BY hs.grade, hs.name;


-- Q5
SELECT DISTINCT hs1.name, hs1.grade, hs2.name, hs2.grade
FROM highschooler AS hs1, highschooler AS hs2, likes as l
WHERE(
hs1.ID = l.ID1
AND hs2.ID = l.ID2
AND l.ID2 NOT IN (SELECT ID1 FROM likes)
);


-- Q6
SELECT DISTINCT hs1.name, hs1.grade
FROM highschooler AS hs1, highschooler AS hs2, friend AS f
WHERE hs1.id = f.id1
AND hs2.id = f.id2
AND hs1.id NOT IN
(
    SELECT hs1.id
    FROM highschooler AS hs1, highschooler AS hs2, friend AS f
    WHERE hs1.id = f.id1
    AND hs2.id = f.id2
    AND hs1.grade != hs2.grade
)
ORDER BY hs1.grade, hs1.name;


-- Q8
SELECT COUNT(*)
- (
    SELECT COUNT(DISTINCT hs.name)
    FROM highschooler AS hs
  ) AS difference
FROM highschooler;
