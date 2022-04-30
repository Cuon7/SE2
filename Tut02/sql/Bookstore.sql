CREATE DATABASE 'bookdb';
USE bookdb;

CREATE TABLE `book` (
  `book_id` int PRIMARY KEY AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `price` float NOT NULL,

) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1

INSERT INTO book (title,author,price)
VALUES("The Angel Next Door", "Saeki-san", 89000),
VALUES("Roshidere", "Sunsunsun", 89000);


