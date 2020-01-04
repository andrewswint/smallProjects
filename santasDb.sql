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

ALTER TABLE people
    ADD  UNIQUE (first_name, last_name);

