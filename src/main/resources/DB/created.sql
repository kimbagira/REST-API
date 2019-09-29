SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS User (
 id int PRIMARY KEY auto_increment,
 employee_name VARCHAR,
 position VARCHAR,
 role VARCHAR
);

CREATE TABLE IF NOT EXISTS News (
 id int PRIMARY KEY auto_increment,
 title VARCHAR,
 content VARCHAR
);

CREATE TABLE IF NOT EXISTS Department (
 id int PRIMARY KEY auto_increment,
 description VARCHAR,
 number_of_workers VARCHAR,
 userId INTEGER
);
