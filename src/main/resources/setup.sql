CREATE DATABASE `final_project_db`;

USE `final_project_db`;

CREATE TABLE `person`
(
  `id`   BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  `first_name` VARCHAR(128) NOT NULL,
  `last_name` VARCHAR(128) NOT NULL,
  `age` INT NOT NULL,
  `passport` VARCHAR(32) NOT NULL,
  `email` VARCHAR(64) NOT NULL
);

INSERT INTO person (first_name, last_name, age, passport, email) VALUES ("Artem", "Uskov", 35, "AA1234BB", "mama@deneg.net");
INSERT INTO person (first_name, last_name, age, passport, email) VALUES ("Roman", "Kurilko", 30, "AN5555BB", "roman@deneg.net");
INSERT INTO person (first_name, last_name, age, passport, email) VALUES ("Sergey", "Nastaj", 32, "AGA1478BB", "sergey@deneg.net");
INSERT INTO person (first_name, last_name, age, passport, email) VALUES ("Rita", "Rovnaya", 25, "AR4409BB", "rita@deneg.net");

CREATE TABLE `locations`
(
	`id` BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `country` VARCHAR(128) NOT NULL,
    `city` VARCHAR(128) NOT NULL,
    `latitude` double NOT NULL,
    `longitute` DOUBLE NOT NULL
)

CREATE TABLE `plane`
(
	`id` BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `model` VARCHAR(128) NOT NULL,
)

CREATE TABLE `place`
 (
 	`id` BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
     `number` INTEGER NOT NULL,
     `plane` INTEGER NOT NULL,
     `empty` TINYINT NOT NULL,
     `business` TINYINT NOT NULL,
     FOREIGN KEY (plane) REFERENCES plane (id)
 )

 CREATE TABLE `flight`
 (
 	`id` BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
     `flight_number` VARCHAR(128) NOT NULL,
     `plane` INTEGER NOT NULL,
     `location_out` VARCHAR(128) NOT NULL,
     `location_in` VARCHAR(128) NOT NULL,
      FOREIGN KEY (plane) REFERENCES plane (id),
      FOREIGN KEY (location_out) REFERENCES location (id),
      FOREIGN KEY (location_in) REFERENCES location (id)
 )