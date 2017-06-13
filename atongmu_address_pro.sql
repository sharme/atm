-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: atongmu
-- ------------------------------------------------------
-- Server version	5.7.17

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
-- Table structure for table `address_pro`
--

DROP TABLE IF EXISTS `address_pro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address_pro` (
  `id_area_pro` int(11) NOT NULL AUTO_INCREMENT,
  `id` int(11) DEFAULT NULL COMMENT '编号',
  `level` varchar(45) COLLATE utf8_lithuanian_ci DEFAULT NULL COMMENT '级别 如1 2 3',
  `name` varchar(45) COLLATE utf8_lithuanian_ci DEFAULT NULL COMMENT '省名称',
  `parent_id` int(11) DEFAULT NULL,
  `postcode` varchar(45) COLLATE utf8_lithuanian_ci DEFAULT NULL,
  PRIMARY KEY (`id_area_pro`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8 COLLATE=utf8_lithuanian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address_pro`
--

LOCK TABLES `address_pro` WRITE;
/*!40000 ALTER TABLE `address_pro` DISABLE KEYS */;
INSERT INTO `address_pro` VALUES (71,110000,'1','北京',1,''),(72,120000,'1','天津',1,''),(73,130000,'1','河北省',1,''),(74,140000,'1','山西省',1,''),(75,150000,'1','内蒙古自治区',1,''),(76,210000,'1','辽宁省',1,''),(77,220000,'1','吉林省',1,''),(78,230000,'1','黑龙江省',1,''),(79,310000,'1','上海',1,''),(80,320000,'1','江苏省',1,''),(81,330000,'1','浙江省',1,''),(82,340000,'1','安徽省',1,''),(83,350000,'1','福建省',1,''),(84,360000,'1','江西省',1,''),(85,370000,'1','山东省',1,''),(86,410000,'1','河南省',1,''),(87,420000,'1','湖北省',1,''),(88,430000,'1','湖南省',1,''),(89,440000,'1','广东省',1,''),(90,450000,'1','广西壮族自治区',1,''),(91,460000,'1','海南省',1,''),(92,500000,'1','重庆',1,''),(93,510000,'1','四川省',1,''),(94,520000,'1','贵州省',1,''),(95,530000,'1','云南省',1,''),(96,540000,'1','西藏自治区',1,''),(97,610000,'1','陕西省',1,''),(98,620000,'1','甘肃省',1,''),(99,630000,'1','青海省',1,''),(100,640000,'1','宁夏回族自治区',1,''),(101,650000,'1','新疆维吾尔自治区',1,''),(102,710000,'1','台湾',1,''),(103,810000,'1','香港特别行政区',1,''),(104,820000,'1','澳门特别行政区',1,''),(105,990000,'1','海外',1,'');
/*!40000 ALTER TABLE `address_pro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-13 20:24:43
