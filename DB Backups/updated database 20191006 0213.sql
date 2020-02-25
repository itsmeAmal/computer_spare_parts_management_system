-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.27-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema spare_parts_ms
--

CREATE DATABASE IF NOT EXISTS spare_parts_ms;
USE spare_parts_ms;

--
-- Definition of table `brand`
--

DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `brand_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(150) DEFAULT NULL,
  `brand_description` varchar(450) DEFAULT NULL,
  `brand_country_of_origin` varchar(100) DEFAULT NULL,
  `brand_status` tinyint(1) unsigned DEFAULT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;


--
-- Definition of table `cart`
--

DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `cart_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cart_date_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cart_session_id` varchar(150) DEFAULT NULL,
  `cart_user_id` int(10) unsigned DEFAULT NULL,
  `cart_status` tinyint(1) unsigned DEFAULT NULL,
  `cart_total` decimal(10,2) DEFAULT NULL,
  `cart_item_qty` int(10) unsigned DEFAULT NULL,
  `cart_esd_delivery_date` date DEFAULT NULL,
  `cart_payment_date` date DEFAULT NULL,
  `cart_shipping_date` date DEFAULT NULL,
  `cart_delivery_date` date DEFAULT NULL,
  PRIMARY KEY (`cart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;


--
-- Definition of table `cart_details`
--

DROP TABLE IF EXISTS `cart_details`;
CREATE TABLE `cart_details` (
  `cart_detail_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cart_detail_cart_id` int(10) unsigned DEFAULT NULL,
  `cart_detail_item_id` int(10) unsigned DEFAULT NULL,
  `cart_detail_qty` int(10) unsigned DEFAULT NULL,
  `item_retail_price` decimal(10,2) DEFAULT NULL,
  `item_unit_price` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`cart_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart_details`
--

/*!40000 ALTER TABLE `cart_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart_details` ENABLE KEYS */;


--
-- Definition of table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category_name` varchar(150) DEFAULT NULL,
  `category_code` varchar(150) DEFAULT NULL,
  `category_status` tinyint(1) unsigned DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;


--
-- Definition of table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_name` varchar(150) DEFAULT NULL,
  `item_code` varchar(150) DEFAULT NULL,
  `item_category_id` int(10) unsigned DEFAULT NULL,
  `item_status` tinyint(1) unsigned DEFAULT NULL,
  `item_description` varchar(900) DEFAULT NULL,
  `item_image_path` varchar(900) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;


--
-- Definition of table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `payment_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `payment_cart_id` int(10) unsigned DEFAULT NULL,
  `payment_date` date DEFAULT NULL,
  `payment_card_type` tinyint(1) unsigned DEFAULT NULL,
  `payment_card_no` varchar(10) DEFAULT NULL,
  `payment_card_date_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `payment_amount` decimal(10,2) DEFAULT NULL,
  `payment_status` tinyint(1) unsigned DEFAULT NULL,
  `payment_other` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`payment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;


--
-- Definition of table `sub_category`
--

DROP TABLE IF EXISTS `sub_category`;
CREATE TABLE `sub_category` (
  `sub_category_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sub_category_name` varchar(150) DEFAULT NULL,
  `sub_category_item_code` int(10) unsigned DEFAULT '0',
  `sub_category_status` tinyint(1) unsigned DEFAULT '1',
  PRIMARY KEY (`sub_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sub_category`
--

/*!40000 ALTER TABLE `sub_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_category` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_email` varchar(200) DEFAULT NULL,
  `user_name` varchar(150) DEFAULT NULL,
  `user_password` varchar(150) DEFAULT NULL,
  `user_status` tinyint(1) unsigned DEFAULT '1',
  `user_address` varchar(450) DEFAULT NULL,
  `user_contact` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`,`user_email`,`user_name`,`user_password`,`user_status`,`user_address`,`user_contact`) VALUES 
 (1,'kssomasiri@gmail.com','Kushani','0342255065',1,'Horana','0779489052'),
 (2,'Danuka@gmail.com','Danuka','1234',1,'Horana','0779489054'),
 (3,'Amali@gmail.com','Amal','1234',1,'Horana1','0779489055');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
