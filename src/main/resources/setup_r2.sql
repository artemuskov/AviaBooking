/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

DROP DATABASE IF EXISTS `aviabooking`;
CREATE DATABASE IF NOT EXISTS `aviabooking` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `aviabooking`;

DROP TABLE IF EXISTS `flight`;
CREATE TABLE IF NOT EXISTS `flight` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `flight_number` varchar(50) DEFAULT NULL,
  `plane_id` bigint(20) DEFAULT NULL,
  `departure_id` bigint(20) DEFAULT NULL,
  `arrival_id` bigint(20) DEFAULT NULL,
  `departure_date` datetime DEFAULT NULL,
  `arrival_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `FK_flight_location` (`departure_id`),
  KEY `FK_flight_location_2` (`arrival_id`),
  KEY `FK_flight_plane` (`plane_id`),
  CONSTRAINT `FK_flight_location` FOREIGN KEY (`departure_id`) REFERENCES `location` (`id`),
  CONSTRAINT `FK_flight_location_2` FOREIGN KEY (`arrival_id`) REFERENCES `location` (`id`),
  CONSTRAINT `FK_flight_plane` FOREIGN KEY (`plane_id`) REFERENCES `plane` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

DELETE FROM `flight`;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` (`id`, `flight_number`, `plane_id`, `departure_id`, `arrival_id`, `departure_date`, `arrival_date`) VALUES
	(1, 'E27', 1, 1, 2, '2016-11-19 17:50:19', '2016-11-19 17:50:21');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;

DROP TABLE IF EXISTS `location`;
CREATE TABLE IF NOT EXISTS `location` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `country` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `Latitude` double DEFAULT NULL,
  `Longitute` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

DELETE FROM `location`;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` (`id`, `country`, `city`, `Latitude`, `Longitute`) VALUES
	(1, 'Ukraine', 'Dnipro', 21.1, 42.1),
	(2, 'Ukraine', 'Lviv', 21.1, 42.1);
/*!40000 ALTER TABLE `location` ENABLE KEYS */;

DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(128) NOT NULL,
  `last_name` varchar(128) NOT NULL,
  `age` int(11) NOT NULL,
  `passport` varchar(50) NOT NULL,
  `email` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

DELETE FROM `person`;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`id`, `first_name`, `last_name`, `age`, `passport`, `email`) VALUES
	(1, 'Test Name', 'Ivanov', 20, 'AA123456', 'deneg.tet@dergites.tut');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

DROP TABLE IF EXISTS `place`;
CREATE TABLE IF NOT EXISTS `place` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `place_number` int(11) DEFAULT NULL,
  `is_business` int(11) DEFAULT NULL,
  `plane_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `FK_place_plane` (`plane_id`),
  CONSTRAINT `FK_place_plane` FOREIGN KEY (`plane_id`) REFERENCES `plane` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DELETE FROM `place`;
/*!40000 ALTER TABLE `place` DISABLE KEYS */;
INSERT INTO `place` (`id`, `place_number`, `is_business`, `plane_id`) VALUES
	(1, 1, 1, 1),
	(2, 2, 1, 1),
	(3, 3, 1, 1),
	(4, 4, 0, 1);
/*!40000 ALTER TABLE `place` ENABLE KEYS */;

DROP TABLE IF EXISTS `plane`;
CREATE TABLE IF NOT EXISTS `plane` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `plane_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DELETE FROM `plane`;
/*!40000 ALTER TABLE `plane` DISABLE KEYS */;
INSERT INTO `plane` (`id`, `plane_name`) VALUES
	(1, 'Boeing 747'),
	(2, 'АН'),
	(3, 'ТУ'),
	(4, 'Airbus');
/*!40000 ALTER TABLE `plane` ENABLE KEYS */;

DROP TABLE IF EXISTS `ticket`;
CREATE TABLE IF NOT EXISTS `ticket` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `place_id` bigint(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `flight_id` bigint(20) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `FK_ticket_place` (`place_id`),
  KEY `FK_ticket_flight` (`flight_id`),
  KEY `FK_ticket_person` (`person_id`),
  CONSTRAINT `FK_ticket_flight` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`id`),
  CONSTRAINT `FK_ticket_person` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`),
  CONSTRAINT `FK_ticket_place` FOREIGN KEY (`place_id`) REFERENCES `place` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

DELETE FROM `ticket`;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` (`id`, `place_id`, `price`, `flight_id`, `state`, `person_id`) VALUES
	(1, 1, 200, 1, 1, 1);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
