CREATE DATABASE REST_API;
\c REST-API;
CREATE TABLE users(id SERIAL PRIMARY KEY, employee_name VARCHAR, position VARCHAR, role VARCHAR);
CREATE TABLE department(id SERIAL PRIMARY KEY, description VARCHAR, number_of_workers INTEGER);
CREATE TABLE news(id SERIAL PRIMARY KEY, title VARCHAR, content VARCHAR,userId INTEGER);
CREATE TABLE department_user(id SERIAL PRIMARY KEY, user_id INTEGER, department_id INTEGER);