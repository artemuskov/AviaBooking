CREATE TABLE `locations`
(
	`id` BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    `country` VARCHAR(128) NOT NULL,
    `city` VARCHAR(128) NOT NULL,
    `latitude` double NOT NULL,
    `longitute` DOUBLE NOT NULL
)