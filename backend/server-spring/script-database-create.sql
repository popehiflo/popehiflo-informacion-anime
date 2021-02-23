-- -----------------------------------------------------
-- MySQL Server 8.0.23
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema popehifloanime_db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `popehifloanime_db`;

CREATE SCHEMA `popehifloanime_db`;
USE `popehifloanime_db` ;

-- -----------------------------------------------------
-- Table `popehifloanime_db`.`anime`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `popehifloanime_db`.`anime` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(150) NOT NULL,
  `anio` INT(11) NOT NULL,
  `fecha_creacion` DATETIME(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `popehifloanime_db`.`personaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `popehifloanime_db`.`personaje` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(150) NOT NULL,
  `anime_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_anime` (`anime_id`),
  CONSTRAINT `fk_anime` FOREIGN KEY (`anime_id`) REFERENCES `anime` (`id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Create new MySQL Server 8.0.23 user for our app 
-- -----------------------------------------------------
DROP USER IF EXISTS `popehifloanime_user`;

CREATE USER 'popehifloanime_user'@'localhost' IDENTIFIED BY 'popehifloanime_user';
GRANT ALL PRIVILEGES ON popehifloanime_db.* TO 'popehifloanime_user'@'localhost';
ALTER USER 'popehifloanime_user'@'localhost' IDENTIFIED WITH mysql_native_password BY 'popehifloanime_pass';