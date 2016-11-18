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