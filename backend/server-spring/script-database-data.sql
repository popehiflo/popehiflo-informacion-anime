-- -----------------------------------------------------
-- Add sample data
-- -----------------------------------------------------
USE `popehifloanime_db`;

-- -----------------------------------------------------
-- Table `popehifloanime_db`.`anime`
-- ----------------------------------------------------- 
INSERT INTO anime (id, nombre, anio, fecha_creacion) VALUES  
	(1,'Shingeky no Kyojin',2009,'2021-01-15 00:00:00'),
    (2,'Dragon Ball Z',1989,'2021-01-15 00:00:00'),
    (3, 'Haikyu!!', 2014, NOW()),
    (4, '2.43: Seiin Koukou Danshii Volley-bu', 2021, NOW()),
    (6,'Naruto Shippuden',2007,'2021-01-20 05:54:02'),
    (9,'One Piece',2020,'2021-02-01 20:40:38'),
    (10,'Samurai X',2000,'2021-02-01 20:44:32'),
    (11,'Death Note',2002,'2021-02-01 20:46:03'),
    (12,'Naruto',2001,'2021-02-01 20:51:13'),
    (13,'Demon Slayer',2018,'2021-02-01 21:04:32'),
    (14,'Blood +',2001,'2021-02-02 03:59:48'),
    (18,'Nanatsu no taizai',2016,'2021-02-05 20:09:32'),
    (20,'Saint Seiya Mod',1986,'2021-02-05 17:50:38'),
    (21,'Yu yu hakusho',1987,'2021-02-05 19:05:06');
    
-- -----------------------------------------------------
-- Table `full-stack-ecommerce`.`personaje`
-- -----------------------------------------------------
INSERT INTO personaje (id, nombre, anime_id) VALUES
	(1,'Goku',2),
    (2,'Naruto Uzumaki',6),
    (3,'Sasuke Uchiha',6),
    (4, 'Shoyo Hinata', 3),
    (5, 'Tobio Kageyama', 3),
    (6, 'Kei Tsukishima', 3),
    (7, 'Kimichika Haijima', 4),
    (8, 'Yuni Kuroba', 4);
