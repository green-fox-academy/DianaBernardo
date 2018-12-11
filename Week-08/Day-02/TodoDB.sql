CREATE DATABASE Todo;
CREATE TABLE Tasks(
ID int NOT NULL AUTO_INCREMENT,
Task VARCHAR(255),
Status VARCHAR (20),
CHECK (Status IN ("Todo", "Done")),
PRIMARY KEY (ID)
);

INSERT INTO Tasks (Task, Status)
VALUES ("Learn Java Basics", "Done"),
("Learn Spring", "Todo"),
("Learn SQL", "Todo");