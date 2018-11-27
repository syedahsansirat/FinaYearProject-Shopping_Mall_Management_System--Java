-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 20, 2018 at 05:49 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `shopping_mall_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
`admin_id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `username`, `password`, `email`) VALUES
(2, '2', '2', '2@22.22');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
`bill_id` int(11) NOT NULL,
  `electricity_bill` double DEFAULT NULL,
  `other_bill` double NOT NULL,
  `gas_bill` double DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`bill_id`, `electricity_bill`, `other_bill`, `gas_bill`) VALUES
(1, 200, 120, 445),
(2, 22, 22, 2),
(3, 22, 11, 11),
(4, 200, 100, 450),
(5, 33, 33, 33),
(6, 100, 33, 33),
(7, 666, 666, 666),
(8, 100, 100, 100),
(9, 33, 44, 44),
(10, 10, 11, 11),
(11, 11, 11, 11),
(12, 11, 11, 11),
(13, 12, 5, 11),
(14, 527, 656, 455),
(15, 555, 333, 455),
(16, 250, 650, 450),
(17, 10, 10, 10),
(18, 11, 11, 11),
(19, 12, 12, 12),
(20, 10, 10, 10);

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE IF NOT EXISTS `log` (
`id` int(11) NOT NULL,
  `time` datetime DEFAULT NULL,
  `text` text CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `log`
--

INSERT INTO `log` (`id`, `time`, `text`) VALUES
(1, '2018-08-29 22:03:30', 'Admin 2 Log in..'),
(2, '2018-08-29 22:03:36', 'Tenant ID = 4 Deleted.'),
(3, '2018-08-29 22:03:36', 'Tenant ID = 5 Deleted.'),
(4, '2018-08-29 22:03:36', 'Reference ID =1 Deleted.'),
(5, '2018-08-31 14:10:46', 'Admin 2 Log in..'),
(6, '2018-08-31 14:13:25', 'Admin 2 Log in..'),
(7, '2018-08-31 15:56:48', 'New Payment Done On  ID =1 .'),
(8, '2018-08-31 15:57:43', 'New Payment Done On  ID =2 .'),
(9, '2018-08-31 16:24:09', 'Rent ID =2 Added.'),
(10, '2018-08-31 16:47:13', 'Admin 2 Log in..'),
(11, '2018-09-03 18:10:20', 'Admin 2 Log in..'),
(12, '2018-09-03 18:12:39', 'New Payment Done On  ID =3 .'),
(13, '2018-09-03 18:17:39', 'Admin 2 Log in..'),
(14, '2018-09-03 18:19:27', 'Rent ID =3 Added.'),
(15, '2018-09-03 18:22:11', 'New Payment Done On  ID =4 .'),
(16, '2018-09-09 22:11:14', 'Admin 2 Log in..'),
(17, '2018-09-09 22:13:30', 'Admin 2 Log in..'),
(18, '2018-09-10 19:14:32', 'Admin 2 Log in..'),
(19, '2018-09-10 19:15:43', 'Reference ID =5 Added.'),
(20, '2018-09-10 19:16:23', 'Reference ID =6 Added.'),
(21, '2018-09-12 17:52:35', 'New Payment Done On  ID =5 .'),
(22, '2018-09-12 17:58:41', 'New Payment Done On  ID =6 .'),
(23, '2018-09-12 18:01:36', 'New Payment Done On  ID =7 .'),
(24, '2018-09-13 11:27:53', 'Admin 2 Log in..'),
(25, '2018-09-13 11:32:53', 'Admin 2 Log in..'),
(26, '2018-09-13 11:33:28', 'Admin 2 Log in..'),
(27, '2018-09-13 11:34:34', 'Admin 2 Log in..'),
(28, '2018-09-13 11:36:17', 'Admin 2 Log in..'),
(29, '2018-09-13 11:37:59', 'New Payment Done On  ID =8 .'),
(30, '2018-09-15 01:59:10', 'New Payment Done On  ID =9 .'),
(31, '2018-09-15 02:03:07', 'New Payment Done On  ID =10 .'),
(32, '2018-09-15 03:41:11', 'Admin 2 Log in..'),
(33, '2018-09-15 18:36:03', 'new Tenant ID =4 Added.'),
(34, '2018-09-15 19:54:33', 'Rent ID =4 Added.'),
(35, '2018-09-15 20:31:58', 'New Payment Done On  ID =11 .'),
(36, '2018-09-15 21:18:20', 'New Payment Done On  ID =12 .'),
(37, '2018-09-15 21:19:03', 'New Payment Done On  ID =13 .'),
(38, '2018-09-15 21:19:27', 'New Payment Done On  ID =14 .'),
(39, '2018-09-15 21:19:57', 'New Payment Done On  ID =15 .'),
(40, '2018-09-15 21:47:35', 'Reference ID =13 Added.'),
(41, '2018-09-19 17:41:54', '(-) Tenant ID = 5 Deleted.'),
(42, '2018-09-19 17:41:54', '(-) Tenant ID = 7 Deleted.'),
(43, '2018-09-19 17:41:55', '(-) Reference ID = 9 Deleted.');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
`payment_id` int(11) NOT NULL,
  `month` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `rent` double NOT NULL,
  `paying_date` date NOT NULL,
  `rent_id` int(11) NOT NULL,
  `bill_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payment_id`, `month`, `year`, `rent`, `paying_date`, `rent_id`, `bill_id`) VALUES
(1, 2, 1995, 44, '2018-08-31', 1, 6),
(2, 3, 1995, 555, '2018-08-31', 1, 7),
(3, 1, 2018, 1000, '2018-09-03', 2, 8),
(4, 3, 2000, 100, '2018-09-03', 3, 9),
(5, 2, 2018, 5000, '2018-09-12', 2, 10),
(6, 4, 1111, 5000, '2018-09-12', 2, 11),
(7, 3, 111, 5000, '2018-09-12', 1, 12),
(8, 6, 20018, 5000, '2018-09-13', 3, 13),
(9, 11, 2018, 5000, '2018-09-15', 2, 14),
(10, 9, 2018, 5000, '2018-09-15', 2, 15),
(11, 8, 2018, 5000, '2018-09-15', 1, 16),
(12, 1, 2018, 5000, '2018-09-15', 4, 17),
(13, 2, 2018, 5000, '2018-09-15', 1, 18),
(14, 1, 2018, 5000, '2018-09-15', 1, 19),
(15, 5, 2018, 5000, '2018-09-15', 4, 20);

-- --------------------------------------------------------

--
-- Table structure for table `reference`
--

CREATE TABLE IF NOT EXISTS `reference` (
`reference_id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `address` varchar(100) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `imageUrl` varchar(50) NOT NULL,
  `company` varchar(30) NOT NULL,
  `office_address` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reference`
--

INSERT INTO `reference` (`reference_id`, `name`, `address`, `email`, `imageUrl`, `company`, `office_address`) VALUES
(4, 'Bill Gates', '23 Jacksouth, Washington', 'info@microsoft.com', 'Image/reference/1.jpg', 'Microsoft Corporation', '44 vicarge Lane, New York, USA'),
(5, 'Mr Mendela', 'dsfgsd', '11€@11.11', 'Image/reference/5.jpg', 'ABCD Co Ltd.', '11'),
(6, 'David Camaroon', '11', 'SS@SS.ss', 'Image/reference/6.jpg', 'Peoples Club', '11'),
(7, 'Rahat syed', '1', '11€@11.11', 'Image/reference/5.jpg', 'Peoples Club', '1'),
(8, 'Mr Sam', '1', '1', 'Image/reference/5.jpg', 'Peoples Club', '1'),
(10, 'Jon Wishling', '1', '1', '1', 'Peoples Club', '1'),
(11, 'Jonny fatinba', '1', '11€@11.11', '1', 'Peoples Club', '1'),
(12, 'Charls Marley', '1', '1', '1', 'Peoples Club', '1'),
(13, 'Alamin Khandokar', 'Kazir Bazar, Sylhet', 'alihaydar.23@gmnail.com', 'Image/reference/13.jpg', 'NEUB', 'NEUB,VIP road, sylhet');

-- --------------------------------------------------------

--
-- Table structure for table `rent`
--

CREATE TABLE IF NOT EXISTS `rent` (
`rent_id` int(11) NOT NULL,
  `shop_name` varchar(25) DEFAULT NULL,
  `shop_id` int(11) NOT NULL,
  `tenant_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rent`
--

INSERT INTO `rent` (`rent_id`, `shop_name`, `shop_id`, `tenant_id`) VALUES
(1, 'new hop', 3, 1),
(2, 'amar dukan', 2, 3),
(3, 'Sports Shop', 4, 2),
(4, 'hello shop', 7, 8);

-- --------------------------------------------------------

--
-- Table structure for table `rent_increment`
--

CREATE TABLE IF NOT EXISTS `rent_increment` (
`rent_increment_id` int(11) NOT NULL,
  `shop_id` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `increment` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `screenshot`
--

CREATE TABLE IF NOT EXISTS `screenshot` (
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Dumping data for table `screenshot`
--

INSERT INTO `screenshot` (`status`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `shop`
--

CREATE TABLE IF NOT EXISTS `shop` (
`shop_id` int(11) NOT NULL,
  `security_fee` int(11) NOT NULL,
  `rent` int(11) NOT NULL,
  `floor` varchar(10) DEFAULT NULL,
  `block` varchar(20) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `area` int(11) NOT NULL,
  `image_url` varchar(50) NOT NULL,
  `ac_enable` int(11) NOT NULL,
  `room_no` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shop`
--

INSERT INTO `shop` (`shop_id`, `security_fee`, `rent`, `floor`, `block`, `location`, `description`, `area`, `image_url`, `ac_enable`, `room_no`) VALUES
(2, 20000, 5000, '1st', NULL, NULL, NULL, 20, 'Image/shop/2.jpg', 1, '102'),
(3, 5000, 5000, '2nd', NULL, NULL, NULL, 30, 'Image/shop/3.jpg', 1, '203'),
(4, 444, 44, '4th', 'gg', 'gg', 'gg', 44, '44', 1, '426'),
(5, 50000, 5000, '2nd', '4B', '5000', '5000', 5000, '5000', 1, '216'),
(6, 5000, 5000, '4th', '4B', NULL, NULL, 3, '3', 1, '417'),
(7, 5000, 5000, '5th', NULL, NULL, NULL, 5000, '5000', 1, '501');

-- --------------------------------------------------------

--
-- Table structure for table `tenant`
--

CREATE TABLE IF NOT EXISTS `tenant` (
`tenant_id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `image_url` varchar(50) NOT NULL,
  `national_id_pic_url` varchar(50) NOT NULL,
  `national_id_number` varchar(30) NOT NULL,
  `address` varchar(100) NOT NULL,
  `occupation` varchar(20) NOT NULL,
  `business_in_shop` varchar(30) NOT NULL,
  `email` varchar(40) DEFAULT NULL,
  `phone_number` varchar(16) NOT NULL,
  `reference_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tenant`
--

INSERT INTO `tenant` (`tenant_id`, `name`, `image_url`, `national_id_pic_url`, `national_id_number`, `address`, `occupation`, `business_in_shop`, `email`, `phone_number`, `reference_id`) VALUES
(1, 'ABDULLAH AL MAMUN', 'sds', 'sd', 'sdsa', 'sdsd', 'TEACHER', 'dsa', '1@gmail.com', 'dsc', 4),
(2, 'Habib Wahid', 'Image/tenant/2.jpg', 'Image/tenant/2NID.jpg', '435456333356', 'lamabazar,Sylhet', 'Student', 'Clothing', 'clothingabcd@yahoo.com', '0175478655', 4),
(3, 'ALISHA HASAN', '44', '5', '5', '5', 'BUSINESSWOMAN', '5', '5', '5', 4),
(4, 'Mr Abdulla', 'Image/tenant/4.jpg', 'Image/tenant/4NID.jpg', '156263781637251672836', 'yarkishtan, Sylhet', 'Software Engineer', 'IT Firm', 'addiman.research@gmail.com', '0174569823789', 4),
(6, 'LABIB SHAHRIYAR', '1', '', '1', '', 'BANKER', '1', '1', '1', 12),
(8, 'POLASH BARI', '1', 'Image/tenant/2NID.jpg', '435456333356', '1', 'SINGER', '1', '1', '1', 5),
(9, 'BINDASH LAL', '1', '1', '1', '1', 'SINGER', '1', '1', '1', 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
 ADD PRIMARY KEY (`bill_id`);

--
-- Indexes for table `log`
--
ALTER TABLE `log`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
 ADD PRIMARY KEY (`payment_id`), ADD KEY `bill_payment_fk` (`bill_id`), ADD KEY `rent_payment_fk` (`rent_id`);

--
-- Indexes for table `reference`
--
ALTER TABLE `reference`
 ADD PRIMARY KEY (`reference_id`);

--
-- Indexes for table `rent`
--
ALTER TABLE `rent`
 ADD PRIMARY KEY (`rent_id`), ADD KEY `tenant_rent_fk` (`tenant_id`), ADD KEY `shop_rent_fk` (`shop_id`);

--
-- Indexes for table `rent_increment`
--
ALTER TABLE `rent_increment`
 ADD PRIMARY KEY (`rent_increment_id`), ADD KEY `shop_rent_increment_fk` (`shop_id`);

--
-- Indexes for table `screenshot`
--
ALTER TABLE `screenshot`
 ADD PRIMARY KEY (`status`);

--
-- Indexes for table `shop`
--
ALTER TABLE `shop`
 ADD PRIMARY KEY (`shop_id`);

--
-- Indexes for table `tenant`
--
ALTER TABLE `tenant`
 ADD PRIMARY KEY (`tenant_id`), ADD KEY `reference_tenant_fk` (`reference_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
MODIFY `bill_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `log`
--
ALTER TABLE `log`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=44;
--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
MODIFY `payment_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `reference`
--
ALTER TABLE `reference`
MODIFY `reference_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `rent`
--
ALTER TABLE `rent`
MODIFY `rent_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `rent_increment`
--
ALTER TABLE `rent_increment`
MODIFY `rent_increment_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `shop`
--
ALTER TABLE `shop`
MODIFY `shop_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `tenant`
--
ALTER TABLE `tenant`
MODIFY `tenant_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
ADD CONSTRAINT `bill_payment_fk` FOREIGN KEY (`bill_id`) REFERENCES `bill` (`bill_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `rent_payment_fk` FOREIGN KEY (`rent_id`) REFERENCES `rent` (`rent_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `rent`
--
ALTER TABLE `rent`
ADD CONSTRAINT `shop_rent_fk` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `tenant_rent_fk` FOREIGN KEY (`tenant_id`) REFERENCES `tenant` (`tenant_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `rent_increment`
--
ALTER TABLE `rent_increment`
ADD CONSTRAINT `shop_rent_increment_fk` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tenant`
--
ALTER TABLE `tenant`
ADD CONSTRAINT `reference_tenant_fk` FOREIGN KEY (`reference_id`) REFERENCES `reference` (`reference_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
