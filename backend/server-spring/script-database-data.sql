-- -----------------------------------------------------
-- Add sample data
-- -----------------------------------------------------
USE `popehifloanime_db`;

-- -----------------------------------------------------
-- Table `popehifloanime_db`.`anime`
-- -----------------------------------------------------
INSERT INTO PRODUCT_CATEGORY(id, nombre, anio, fecha_creacion) VALUES (1, 'Haikyu!!', 2014, NOW());
INSERT INTO PRODUCT_CATEGORY(id, nombre, anio, fecha_creacion) VALUES (2, '2.43: Seiin Koukou Danshii Volley-bu', 2021,NOW());

-- -----------------------------------------------------
-- Table `full-stack-ecommerce`.`personaje`
-- -----------------------------------------------------
INSERT INTO personaje (id, nombre, anime_id) VALUES
    (1, 'Shoyo Hinata', 1),
    (2, 'Tobio Kageyama', 1),
    (3, 'Kei Tsukishima', 1),
    (4, 'Kimichika Haijima', 2),
    (5, 'Yuni Kuroba', 2);
