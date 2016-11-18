CREATE TABLE `place`
 (
 	`id` BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
     `number` INTEGER NOT NULL,
     `plane` INTEGER NOT NULL,
     `empty` TINYINT NOT NULL,
     `business` TINYINT NOT NULL,
     FOREIGN KEY (plane) REFERENCES plane (id)
 )