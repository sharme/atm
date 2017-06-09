-- MySQL dump 10.13  Distrib 5.6.25, for osx10.10 (x86_64)
--
-- Host: localhost    Database: atm
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `atm_company`
--

DROP TABLE IF EXISTS `atm_company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_company` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `c_name` varchar(255) NOT NULL,
  `c_type` varchar(48) NOT NULL,
  `c_address` varchar(255) DEFAULT NULL,
  `c_country` varchar(48) DEFAULT NULL,
  `c_province` varchar(48) DEFAULT NULL,
  `c_city` varchar(48) DEFAULT NULL,
  `c_people` int(11) DEFAULT NULL,
  `c_desc` text,
  `c_logo` varchar(255) DEFAULT NULL,
  `c_mobile_phone` int(13) DEFAULT NULL,
  `c_qq` int(11) DEFAULT NULL,
  `c_owner` varchar(48) DEFAULT NULL,
  `c_phone` int(13) DEFAULT NULL,
  `c_website` varchar(255) DEFAULT NULL,
  `c_limit` int(11) DEFAULT NULL,
  `c_pic` varchar(255) DEFAULT NULL,
  `c_pic2` varchar(255) DEFAULT NULL,
  `c_pic3` varchar(255) DEFAULT NULL,
  `c_created_by` varchar(48) DEFAULT NULL,
  `c_created_time` datetime NOT NULL,
  `c_updated_by` varchar(48) DEFAULT NULL,
  `c_updated_time` datetime NOT NULL,
  PRIMARY KEY (`c_id`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `atm_company_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_company`
--

LOCK TABLES `atm_company` WRITE;
/*!40000 ALTER TABLE `atm_company` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_company_history`
--

DROP TABLE IF EXISTS `atm_company_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_company_history` (
  `ch_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_id` int(11) NOT NULL,
  `ch_name` varchar(255) NOT NULL,
  `ch_address` varchar(255) NOT NULL,
  `ch_client` varchar(255) NOT NULL,
  `ch_start_time` datetime NOT NULL,
  `ch_end_time` datetime NOT NULL,
  `ch_desc` text,
  `ch_pic` varchar(255) DEFAULT NULL,
  `ch_pic2` varchar(255) DEFAULT NULL,
  `ch_pic3` varchar(255) DEFAULT NULL,
  `ch_created_by` varchar(48) DEFAULT NULL,
  `ch_created_time` datetime NOT NULL,
  `ch_updated_by` varchar(48) DEFAULT NULL,
  `ch_updated_time` datetime NOT NULL,
  PRIMARY KEY (`ch_id`),
  KEY `c_id` (`c_id`),
  CONSTRAINT `atm_company_history_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `atm_company` (`c_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_company_history`
--

LOCK TABLES `atm_company_history` WRITE;
/*!40000 ALTER TABLE `atm_company_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_company_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_company_request_de`
--

DROP TABLE IF EXISTS `atm_company_request_de`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_company_request_de` (
  `crd_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_id` int(11) NOT NULL,
  `crd_to` int(11) NOT NULL,
  `crd_type` varchar(48) NOT NULL,
  `crd_area` int(11) NOT NULL,
  `crd_width` int(11) DEFAULT NULL,
  `crd_length` int(11) DEFAULT NULL,
  `crd_hight` int(11) DEFAULT NULL,
  `crd_cost` int(11) DEFAULT NULL,
  `crd_reward` int(11) DEFAULT NULL,
  `crd_created_by` varchar(48) DEFAULT NULL,
  `crd_created_time` datetime NOT NULL,
  `crd_updated_by` varchar(48) DEFAULT NULL,
  `crd_updated_time` datetime NOT NULL,
  PRIMARY KEY (`crd_id`),
  KEY `c_id` (`c_id`),
  KEY `crd_to` (`crd_to`),
  CONSTRAINT `atm_company_request_de_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `atm_company` (`c_id`) ON DELETE CASCADE,
  CONSTRAINT `atm_company_request_de_ibfk_2` FOREIGN KEY (`crd_to`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_company_request_de`
--

LOCK TABLES `atm_company_request_de` WRITE;
/*!40000 ALTER TABLE `atm_company_request_de` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_company_request_de` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_company_request_ex`
--

DROP TABLE IF EXISTS `atm_company_request_ex`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_company_request_ex` (
  `cre_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_id` int(11) NOT NULL,
  `cre_to` int(11) NOT NULL,
  `cre_name` varchar(255) NOT NULL,
  `cre_logo` varchar(255) DEFAULT NULL,
  `cre_type` varchar(48) NOT NULL,
  `cre_msg` text,
  `cre_created_by` varchar(48) DEFAULT NULL,
  `cre_created_time` datetime NOT NULL,
  `cre_updated_by` varchar(48) DEFAULT NULL,
  `cre_updated_time` datetime NOT NULL,
  PRIMARY KEY (`cre_id`),
  KEY `c_id` (`c_id`),
  KEY `cre_to` (`cre_to`),
  CONSTRAINT `atm_company_request_ex_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `atm_company` (`c_id`),
  CONSTRAINT `atm_company_request_ex_ibfk_2` FOREIGN KEY (`cre_to`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_company_request_ex`
--

LOCK TABLES `atm_company_request_ex` WRITE;
/*!40000 ALTER TABLE `atm_company_request_ex` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_company_request_ex` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_designers`
--

DROP TABLE IF EXISTS `atm_designers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_designers` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `d_name` varchar(255) NOT NULL,
  `d_age` int(11) NOT NULL,
  `d_type` varchar(48) NOT NULL,
  `d_desc` text,
  `d_pic` varchar(255) DEFAULT NULL,
  `d_pic2` varchar(255) DEFAULT NULL,
  `d_pic3` varchar(255) DEFAULT NULL,
  `d_created_by` varchar(48) DEFAULT NULL,
  `d_created_time` datetime NOT NULL,
  `d_updated_by` varchar(48) DEFAULT NULL,
  `d_updated_time` datetime NOT NULL,
  PRIMARY KEY (`d_id`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `atm_designers_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_designers`
--

LOCK TABLES `atm_designers` WRITE;
/*!40000 ALTER TABLE `atm_designers` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_designers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_designers_history`
--

DROP TABLE IF EXISTS `atm_designers_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_designers_history` (
  `dh_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_id` int(11) NOT NULL,
  `dh_name` varchar(255) NOT NULL,
  `dh_desc` text,
  `dh_pic` varchar(255) DEFAULT NULL,
  `dh_pic2` varchar(255) DEFAULT NULL,
  `dh_pic3` varchar(255) DEFAULT NULL,
  `dh_created_by` varchar(48) DEFAULT NULL,
  `dh_created_time` datetime NOT NULL,
  `dh_updated_by` varchar(48) DEFAULT NULL,
  `dh_updated_time` datetime NOT NULL,
  PRIMARY KEY (`dh_id`),
  KEY `d_id` (`d_id`),
  CONSTRAINT `atm_designers_history_ibfk_1` FOREIGN KEY (`d_id`) REFERENCES `atm_designers` (`d_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_designers_history`
--

LOCK TABLES `atm_designers_history` WRITE;
/*!40000 ALTER TABLE `atm_designers_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_designers_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_designers_request`
--

DROP TABLE IF EXISTS `atm_designers_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_designers_request` (
  `dr_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_id` int(11) NOT NULL,
  `dr_to` int(11) NOT NULL,
  `dr_name` varchar(255) NOT NULL,
  `dr_type` varchar(255) NOT NULL,
  `dr_pic` varchar(255) DEFAULT NULL,
  `dr_desc` text,
  `dr_created_by` varchar(48) DEFAULT NULL,
  `dr_created_time` datetime NOT NULL,
  `dr_updated_by` varchar(48) DEFAULT NULL,
  `dr_updated_time` datetime NOT NULL,
  PRIMARY KEY (`dr_id`),
  KEY `d_id` (`d_id`),
  KEY `dr_to` (`dr_to`),
  CONSTRAINT `atm_designers_request_ibfk_1` FOREIGN KEY (`d_id`) REFERENCES `atm_designers` (`d_id`) ON DELETE CASCADE,
  CONSTRAINT `atm_designers_request_ibfk_2` FOREIGN KEY (`dr_to`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_designers_request`
--

LOCK TABLES `atm_designers_request` WRITE;
/*!40000 ALTER TABLE `atm_designers_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_designers_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_exhibitors`
--

DROP TABLE IF EXISTS `atm_exhibitors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_exhibitors` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `e_name` varchar(255) NOT NULL,
  `e_type` varchar(48) DEFAULT NULL,
  `e_desc` text,
  `e_people` int(11) DEFAULT NULL,
  `e_logo` varchar(255) DEFAULT NULL,
  `e_mobile_phone` int(13) DEFAULT NULL,
  `e_qq` int(11) DEFAULT NULL,
  `e_phone` int(13) DEFAULT NULL,
  `e_owner` varchar(48) DEFAULT NULL,
  `e_website` varchar(255) DEFAULT NULL,
  `e_address` varchar(255) DEFAULT NULL,
  `e_country` varchar(48) DEFAULT NULL,
  `e_province` varchar(48) DEFAULT NULL,
  `e_city` varchar(48) DEFAULT NULL,
  `e_created_by` varchar(48) DEFAULT NULL,
  `e_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `e_updated_by` varchar(48) DEFAULT NULL,
  `e_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`e_id`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `atm_exhibitors_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_exhibitors`
--

LOCK TABLES `atm_exhibitors` WRITE;
/*!40000 ALTER TABLE `atm_exhibitors` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_exhibitors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_exhibitors_history`
--

DROP TABLE IF EXISTS `atm_exhibitors_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_exhibitors_history` (
  `eh_id` int(11) NOT NULL AUTO_INCREMENT,
  `e_id` int(11) NOT NULL,
  `eh_location` varchar(255) NOT NULL,
  `eh_start_time` datetime NOT NULL,
  `eh_end_time` datetime NOT NULL,
  `eh_desc` text,
  `eh_area` int(11) NOT NULL,
  `eh_width` int(11) DEFAULT NULL,
  `eh_length` int(11) DEFAULT NULL,
  `eh_hight` int(11) DEFAULT NULL,
  `eh_cost` int(11) DEFAULT NULL,
  `eh_pic` varchar(255) DEFAULT NULL,
  `eh_pic2` varchar(255) DEFAULT NULL,
  `eh_pic3` varchar(255) DEFAULT NULL,
  `eh_created_by` varchar(48) DEFAULT NULL,
  `eh_created_time` datetime NOT NULL,
  `eh_updated_by` varchar(48) DEFAULT NULL,
  `eh_updated_time` datetime NOT NULL,
  PRIMARY KEY (`eh_id`),
  KEY `e_id` (`e_id`),
  CONSTRAINT `atm_exhibitors_history_ibfk_1` FOREIGN KEY (`e_id`) REFERENCES `atm_exhibitors` (`e_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_exhibitors_history`
--

LOCK TABLES `atm_exhibitors_history` WRITE;
/*!40000 ALTER TABLE `atm_exhibitors_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_exhibitors_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_exhibitors_request`
--

DROP TABLE IF EXISTS `atm_exhibitors_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_exhibitors_request` (
  `er_id` int(11) NOT NULL AUTO_INCREMENT,
  `e_id` int(11) NOT NULL,
  `er_to` int(11) NOT NULL,
  `er_name` varchar(255) NOT NULL,
  `er_address` varchar(255) NOT NULL,
  `er_start_time` datetime NOT NULL,
  `er_end_time` datetime NOT NULL,
  `er_area` int(11) DEFAULT NULL,
  `er_width` int(11) DEFAULT NULL,
  `er_length` int(11) DEFAULT NULL,
  `er_hight` int(11) DEFAULT NULL,
  `er_cost` int(11) DEFAULT NULL,
  `er_pic` varchar(255) DEFAULT NULL,
  `er_pic2` varchar(255) DEFAULT NULL,
  `er_pic3` varchar(255) DEFAULT NULL,
  `er_created_by` varchar(48) DEFAULT NULL,
  `er_created_time` datetime NOT NULL,
  `er_updated_by` varchar(48) DEFAULT NULL,
  `er_updated_time` datetime NOT NULL,
  PRIMARY KEY (`er_id`),
  KEY `e_id` (`e_id`),
  KEY `er_to` (`er_to`),
  CONSTRAINT `atm_exhibitors_request_ibfk_1` FOREIGN KEY (`e_id`) REFERENCES `atm_exhibitors` (`e_id`) ON DELETE CASCADE,
  CONSTRAINT `atm_exhibitors_request_ibfk_2` FOREIGN KEY (`er_to`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_exhibitors_request`
--

LOCK TABLES `atm_exhibitors_request` WRITE;
/*!40000 ALTER TABLE `atm_exhibitors_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_exhibitors_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_img`
--

DROP TABLE IF EXISTS `atm_img`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_img` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `it_id` int(11) NOT NULL,
  `i_action_id` int(11) NOT NULL,
  `i_url` varchar(48) NOT NULL,
  `i_created_by` varchar(48) DEFAULT NULL,
  `i_created_time` datetime NOT NULL,
  `i_updated_by` varchar(48) DEFAULT NULL,
  `i_updated_time` datetime NOT NULL,
  PRIMARY KEY (`i_id`),
  KEY `u_id` (`u_id`),
  KEY `it_id` (`it_id`),
  CONSTRAINT `atm_img_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `atm_users` (`u_id`) ON DELETE CASCADE,
  CONSTRAINT `atm_img_ibfk_2` FOREIGN KEY (`it_id`) REFERENCES `atm_img_type` (`it_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_img`
--

LOCK TABLES `atm_img` WRITE;
/*!40000 ALTER TABLE `atm_img` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_img` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_img_type`
--

DROP TABLE IF EXISTS `atm_img_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_img_type` (
  `it_id` int(11) NOT NULL AUTO_INCREMENT,
  `it_name` varchar(255) NOT NULL,
  `it_created_by` varchar(48) DEFAULT NULL,
  `it_created_time` datetime NOT NULL,
  `it_updated_by` varchar(48) DEFAULT NULL,
  `it_updated_time` datetime NOT NULL,
  PRIMARY KEY (`it_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_img_type`
--

LOCK TABLES `atm_img_type` WRITE;
/*!40000 ALTER TABLE `atm_img_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_img_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_roles`
--

DROP TABLE IF EXISTS `atm_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_roles` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(255) NOT NULL,
  `r_description` varchar(255) DEFAULT NULL,
  `r_created_by` varchar(48) DEFAULT NULL,
  `r_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `r_updated_by` varchar(48) DEFAULT NULL,
  `r_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_roles`
--

LOCK TABLES `atm_roles` WRITE;
/*!40000 ALTER TABLE `atm_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm_users`
--

DROP TABLE IF EXISTS `atm_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atm_users` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) NOT NULL,
  `u_phone_num` int(13) DEFAULT NULL,
  `u_email` varchar(255) DEFAULT NULL,
  `u_status` tinyint(10) NOT NULL,
  `u_avatar` varchar(255) DEFAULT NULL,
  `u_desc` varchar(255) DEFAULT NULL,
  `u_role` int(11) NOT NULL,
  `u_created_by` varchar(48) DEFAULT NULL,
  `u_created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `u_updated_by` varchar(48) DEFAULT NULL,
  `u_updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `u_name` (`u_name`),
  UNIQUE KEY `u_phone_num` (`u_phone_num`),
  UNIQUE KEY `u_email` (`u_email`),
  KEY `u_role` (`u_role`),
  CONSTRAINT `atm_users_ibfk_1` FOREIGN KEY (`u_role`) REFERENCES `atm_roles` (`r_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm_users`
--

LOCK TABLES `atm_users` WRITE;
/*!40000 ALTER TABLE `atm_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `atm_users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-09 15:49:11
