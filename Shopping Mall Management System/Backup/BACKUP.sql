-- MySQL dump 10.13  Distrib 5.6.21, for Win32 (x86)
--
-- Host: localhost    Database: shopping_mall_database
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `shopping_mall_database`
--

/*!40000 DROP DATABASE IF EXISTS `shopping_mall_database`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `shopping_mall_database` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci */;

USE `shopping_mall_database`;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (2,'2','2','2@22.22');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `bill_id` int(11) NOT NULL AUTO_INCREMENT,
  `electricity_bill` double DEFAULT NULL,
  `other_bill` double NOT NULL,
  `gas_bill` double DEFAULT NULL,
  PRIMARY KEY (`bill_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,200,120,445),(2,22,22,2),(3,22,11,11),(4,200,100,450),(5,33,33,33),(6,100,33,33),(7,666,666,666),(8,100,100,100),(9,33,44,44),(10,10,11,11),(11,11,11,11),(12,11,11,11),(13,12,5,11),(14,527,656,455),(15,555,333,455),(16,250,650,450),(17,10,10,10),(18,11,11,11),(19,12,12,12),(20,10,10,10);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` datetime DEFAULT NULL,
  `text` text CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES (1,'2018-08-29 22:03:30','Admin 2 Log in..'),(2,'2018-08-29 22:03:36','Tenant ID = 4 Deleted.'),(3,'2018-08-29 22:03:36','Tenant ID = 5 Deleted.'),(4,'2018-08-29 22:03:36','Reference ID =1 Deleted.'),(5,'2018-08-31 14:10:46','Admin 2 Log in..'),(6,'2018-08-31 14:13:25','Admin 2 Log in..'),(7,'2018-08-31 15:56:48','New Payment Done On  ID =1 .'),(8,'2018-08-31 15:57:43','New Payment Done On  ID =2 .'),(9,'2018-08-31 16:24:09','Rent ID =2 Added.'),(10,'2018-08-31 16:47:13','Admin 2 Log in..'),(11,'2018-09-03 18:10:20','Admin 2 Log in..'),(12,'2018-09-03 18:12:39','New Payment Done On  ID =3 .'),(13,'2018-09-03 18:17:39','Admin 2 Log in..'),(14,'2018-09-03 18:19:27','Rent ID =3 Added.'),(15,'2018-09-03 18:22:11','New Payment Done On  ID =4 .'),(16,'2018-09-09 22:11:14','Admin 2 Log in..'),(17,'2018-09-09 22:13:30','Admin 2 Log in..'),(18,'2018-09-10 19:14:32','Admin 2 Log in..'),(19,'2018-09-10 19:15:43','Reference ID =5 Added.'),(20,'2018-09-10 19:16:23','Reference ID =6 Added.'),(21,'2018-09-12 17:52:35','New Payment Done On  ID =5 .'),(22,'2018-09-12 17:58:41','New Payment Done On  ID =6 .'),(23,'2018-09-12 18:01:36','New Payment Done On  ID =7 .'),(24,'2018-09-13 11:27:53','Admin 2 Log in..'),(25,'2018-09-13 11:32:53','Admin 2 Log in..'),(26,'2018-09-13 11:33:28','Admin 2 Log in..'),(27,'2018-09-13 11:34:34','Admin 2 Log in..'),(28,'2018-09-13 11:36:17','Admin 2 Log in..'),(29,'2018-09-13 11:37:59','New Payment Done On  ID =8 .'),(30,'2018-09-15 01:59:10','New Payment Done On  ID =9 .'),(31,'2018-09-15 02:03:07','New Payment Done On  ID =10 .'),(32,'2018-09-15 03:41:11','Admin 2 Log in..'),(33,'2018-09-15 18:36:03','new Tenant ID =4 Added.'),(34,'2018-09-15 19:54:33','Rent ID =4 Added.'),(35,'2018-09-15 20:31:58','New Payment Done On  ID =11 .'),(36,'2018-09-15 21:18:20','New Payment Done On  ID =12 .'),(37,'2018-09-15 21:19:03','New Payment Done On  ID =13 .'),(38,'2018-09-15 21:19:27','New Payment Done On  ID =14 .'),(39,'2018-09-15 21:19:57','New Payment Done On  ID =15 .'),(40,'2018-09-15 21:47:35','Reference ID =13 Added.');
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT,
  `month` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `rent` double NOT NULL,
  `paying_date` date NOT NULL,
  `rent_id` int(11) NOT NULL,
  `bill_id` int(11) NOT NULL,
  PRIMARY KEY (`payment_id`),
  KEY `bill_payment_fk` (`bill_id`),
  KEY `rent_payment_fk` (`rent_id`),
  CONSTRAINT `bill_payment_fk` FOREIGN KEY (`bill_id`) REFERENCES `bill` (`bill_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `rent_payment_fk` FOREIGN KEY (`rent_id`) REFERENCES `rent` (`rent_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,2,1995,44,'2018-08-31',1,6),(2,3,1995,555,'2018-08-31',1,7),(3,1,2018,1000,'2018-09-03',2,8),(4,3,2000,100,'2018-09-03',3,9),(5,2,2018,5000,'2018-09-12',2,10),(6,4,1111,5000,'2018-09-12',2,11),(7,3,111,5000,'2018-09-12',1,12),(8,6,20018,5000,'2018-09-13',3,13),(9,11,2018,5000,'2018-09-15',2,14),(10,9,2018,5000,'2018-09-15',2,15),(11,8,2018,5000,'2018-09-15',1,16),(12,1,2018,5000,'2018-09-15',4,17),(13,2,2018,5000,'2018-09-15',1,18),(14,1,2018,5000,'2018-09-15',1,19),(15,5,2018,5000,'2018-09-15',4,20);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reference`
--

DROP TABLE IF EXISTS `reference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reference` (
  `reference_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `address` varchar(100) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `imageUrl` varchar(50) NOT NULL,
  `company` varchar(30) NOT NULL,
  `office_address` varchar(100) NOT NULL,
  PRIMARY KEY (`reference_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reference`
--

LOCK TABLES `reference` WRITE;
/*!40000 ALTER TABLE `reference` DISABLE KEYS */;
INSERT INTO `reference` VALUES (4,'Bill Gates','23 Jacksouth, Washington','info@microsoft.com','Image/reference/1.jpg','Microsoft Corporation','44 vicarge Lane, New York, USA'),(5,'Mr Mendela','dsfgsd','11€@11.11','Image/reference/5.jpg','ABCD Co Ltd.','11'),(6,'David Camaroon','11','SS@SS.ss','Image/reference/6.jpg','Peoples Club','11'),(7,'Rahat syed','1','11€@11.11','Image/reference/5.jpg','Peoples Club','1'),(8,'Mr Sam','1','1','Image/reference/5.jpg','Peoples Club','1'),(9,'Abadur Rahman','1','1','1','Saarc Intl. €Co','1'),(10,'Jon Wishling','1','1','1','Peoples Club','1'),(11,'Jonny fatinba','1','11€@11.11','1','Peoples Club','1'),(12,'Charls Marley','1','1','1','Peoples Club','1'),(13,'Alamin Khandokar','Kazir Bazar, Sylhet','alihaydar.23@gmnail.com','Image/reference/13.jpg','NEUB','NEUB,VIP road, sylhet');
/*!40000 ALTER TABLE `reference` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rent`
--

DROP TABLE IF EXISTS `rent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rent` (
  `rent_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(25) DEFAULT NULL,
  `shop_id` int(11) NOT NULL,
  `tenant_id` int(11) NOT NULL,
  PRIMARY KEY (`rent_id`),
  KEY `tenant_rent_fk` (`tenant_id`),
  KEY `shop_rent_fk` (`shop_id`),
  CONSTRAINT `shop_rent_fk` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tenant_rent_fk` FOREIGN KEY (`tenant_id`) REFERENCES `tenant` (`tenant_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rent`
--

LOCK TABLES `rent` WRITE;
/*!40000 ALTER TABLE `rent` DISABLE KEYS */;
INSERT INTO `rent` VALUES (1,'new hop',3,1),(2,'amar dukan',2,3),(3,'Sports Shop',4,2),(4,'hello shop',7,8);
/*!40000 ALTER TABLE `rent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rent_increment`
--

DROP TABLE IF EXISTS `rent_increment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rent_increment` (
  `rent_increment_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_id` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `increment` int(11) NOT NULL,
  PRIMARY KEY (`rent_increment_id`),
  KEY `shop_rent_increment_fk` (`shop_id`),
  CONSTRAINT `shop_rent_increment_fk` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rent_increment`
--

LOCK TABLES `rent_increment` WRITE;
/*!40000 ALTER TABLE `rent_increment` DISABLE KEYS */;
/*!40000 ALTER TABLE `rent_increment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screenshot`
--

DROP TABLE IF EXISTS `screenshot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `screenshot` (
  `status` int(11) NOT NULL,
  PRIMARY KEY (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screenshot`
--

LOCK TABLES `screenshot` WRITE;
/*!40000 ALTER TABLE `screenshot` DISABLE KEYS */;
INSERT INTO `screenshot` VALUES (1);
/*!40000 ALTER TABLE `screenshot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop` (
  `shop_id` int(11) NOT NULL AUTO_INCREMENT,
  `security_fee` int(11) NOT NULL,
  `rent` int(11) NOT NULL,
  `floor` varchar(10) DEFAULT NULL,
  `block` varchar(20) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `area` int(11) NOT NULL,
  `image_url` varchar(50) NOT NULL,
  `ac_enable` int(11) NOT NULL,
  `room_no` varchar(10) NOT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` VALUES (2,20000,5000,'1st',NULL,NULL,NULL,20,'Image/shop/2.jpg',1,'102'),(3,5000,5000,'2nd',NULL,NULL,NULL,30,'Image/shop/3.jpg',1,'203'),(4,444,44,'4th','gg','gg','gg',44,'44',1,'426'),(5,50000,5000,'2nd','4B','5000','5000',5000,'5000',1,'216'),(6,5000,5000,'4th','4B',NULL,NULL,3,'3',1,'417'),(7,5000,5000,'5th',NULL,NULL,NULL,5000,'5000',1,'501');
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tenant`
--

DROP TABLE IF EXISTS `tenant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tenant` (
  `tenant_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `image_url` varchar(50) NOT NULL,
  `national_id_pic_url` varchar(50) NOT NULL,
  `national_id_number` varchar(30) NOT NULL,
  `address` varchar(100) NOT NULL,
  `occupation` varchar(20) NOT NULL,
  `business_in_shop` varchar(30) NOT NULL,
  `email` varchar(40) DEFAULT NULL,
  `phone_number` varchar(16) NOT NULL,
  `reference_id` int(11) NOT NULL,
  PRIMARY KEY (`tenant_id`),
  KEY `reference_tenant_fk` (`reference_id`),
  CONSTRAINT `reference_tenant_fk` FOREIGN KEY (`reference_id`) REFERENCES `reference` (`reference_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tenant`
--

LOCK TABLES `tenant` WRITE;
/*!40000 ALTER TABLE `tenant` DISABLE KEYS */;
INSERT INTO `tenant` VALUES (1,'ABDULLAH AL MAMUN','sds','sd','sdsa','sdsd','TEACHER','dsa','1@gmail.com','dsc',4),(2,'Habib Wahid','Image/tenant/2.jpg','Image/tenant/2NID.jpg','435456333356','lamabazar,Sylhet','Student','Clothing','clothingabcd@yahoo.com','0175478655',4),(3,'ALISHA HASAN','44','5','5','5','BUSINESSWOMAN','5','5','5',4),(4,'Mr Abdulla','Image/tenant/4.jpg','Image/tenant/4NID.jpg','156263781637251672836','yarkishtan, Sylhet','Software Engineer','IT Firm','addiman.research@gmail.com','0174569823789',4),(5,'SYED HUSBAN','1','1','1','1','GAME EXPERT','1','11€@11.11','1',9),(6,'LABIB SHAHRIYAR','1','','1','','BANKER','1','1','1',12),(7,'JAMIL AHMED','1','1','','1','RESTAURANT MANAGER','1','1','1',9),(8,'POLASH BARI','1','Image/tenant/2NID.jpg','435456333356','1','SINGER','1','1','1',5),(9,'BINDASH LAL','1','1','1','1','SINGER','1','1','1',10);
/*!40000 ALTER TABLE `tenant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-15 22:16:09
