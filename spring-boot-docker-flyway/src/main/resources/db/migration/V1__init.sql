CREATE TABLE person
(
    id        INTEGER NOT NULL,
    firstname VARCHAR(25),
    lastname  VARCHAR(25),
    PRIMARY KEY (id)
);

INSERT INTO person
VALUES (1, 'firstname1', 'lastname1');

INSERT INTO person
VALUES (2, 'firstname2', 'lastname2');

INSERT INTO person
VALUES (3, 'firstname3', 'lastname3');