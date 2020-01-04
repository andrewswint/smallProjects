# CREATE USER 'santaclaus'@'localhost' IDENTIFIED BY 'password';
#
# GRANT ALL ON *.* TO 'santaclaus'@'localhost';

# CREATE DATABASE IF NOT EXISTS christmas_db;
USE christmas_db;

CREATE TABLE people(
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    birthday VARCHAR(50) NOT NULL,
    nice BOOLEAN NOT NULL,
    wishlist BLOB
);