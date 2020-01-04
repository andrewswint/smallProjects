# CREATE USER 'santaclaus'@'localhost' IDENTIFIED BY 'password';
#
# GRANT ALL ON *.* TO 'santaclaus'@'localhost';
# CREATE DATABASE IF NOT EXISTS christmas_db;
USE christmas_db;
# CREATE TABLE people(
#     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     first_name VARCHAR(50) NOT NULL,
#     last_name VARCHAR(50) NOT NULL,
#     age INT NOT NULL,
#     birthday VARCHAR(50) NOT NULL,
#     nice BOOLEAN NOT NULL,
#     wishlist BLOB,
#     PRIMARY KEY (id)
# );

# ALTER TABLE people
#     ADD  UNIQUE (first_name, last_name);

INSERT INTO people (first_name, last_name, age, birthday, nice, wishlist)
    VALUES ('James', 'Swint', 1, 'aug 1 2020', true, 'thing 1, thing 2, thing 3, thing 4, thing 5, thing 6, something else, another something, some more something'),
           ('Lillian', 'Swint', 1, 'aug 2 2020', true, 'thing 1, thing 2, thing 3, thing 4, thing 5, thing 6, something else, another something, some more something'),
           ('Joan', 'Swint', 1, 'aug 3 2020', false, 'thing 1, thing 2, thing 3, thing 4, thing 5, thing 6, something else, another something, some more something');