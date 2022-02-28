CREATE TABLE IF NOT EXISTS greetings
(
    id SERIAL PRIMARY KEY,
    "value" CHAR(255)
);
INSERT INTO greetings ("value") VALUES ('Hello World!');