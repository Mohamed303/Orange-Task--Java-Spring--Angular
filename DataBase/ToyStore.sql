CREATE TABLE `category` (
	`id` int(8) NOT NULL AUTO_INCREMENT,
	`name` varchar(32) NOT NULL UNIQUE,
	`description` varchar(64) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `product` (
	`id` int(8) NOT NULL AUTO_INCREMENT,
	`name` varchar(32) NOT NULL,
	`description` varchar(64) NOT NULL,
	`cat_id` int(8) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `product` ADD CONSTRAINT `product_fk0` FOREIGN KEY (`cat_id`) REFERENCES `category`(`id`);

