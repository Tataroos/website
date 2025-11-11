-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: ecom
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product_data`
--

DROP TABLE IF EXISTS `product_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_data` (
  `id` int NOT NULL,
  `categoryName` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `imageFile` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `unitOfMeasure` varchar(255) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `customerId` int NOT NULL,
  `customerName` varchar(255) DEFAULT NULL,
  `lastUpdated` datetime DEFAULT NULL,
  `orderId` int NOT NULL,
  `productCategoryName` varchar(255) DEFAULT NULL,
  `productDescription` varchar(255) DEFAULT NULL,
  `productId` int NOT NULL,
  `productImageFile` varchar(255) DEFAULT NULL,
  `productName` varchar(255) DEFAULT NULL,
  `productUnitOfMeasure` varchar(255) DEFAULT NULL,
  `quantity` double NOT NULL,
  `status` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_data`
--

INSERT INTO `product_data` VALUES 
(10,'Power Tools','A powerful angle grinder for cutting and polishing.','angle-grinder','Angle Grinder','120.00','piece',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(11,'Power Tools','Bosch brand cordless drill for all your home projects.','bosch-drill','Bosch Drill','150.00','piece',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(12,'Power Tools','Cordless gas-powered saw for heavy-duty cutting.','cordless-gas-saw','Cordless Gas Saw','250.00','piece',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(13,'Safety Gear','Durable work gloves for hand protection.','gloves','Work Gloves','15.00','pair',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(14,'Safety Gear','Hard hat safety helmet for construction or home use.','helmet','Safety Helmet','25.00','piece',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(15,'Gardening','A simple pot for plants and flowers.','pot','Plant Pot','10.00','piece',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(16,'Safety Gear','High-visibility safety vest.','safety-vest','Safety Vest','20.00','piece',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(17,'Gardening','A sturdy spade shovel for digging.','spade-shovel','Spade Shovel','30.00','piece',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL),
(18,'Gardening','Packet of sunflower seeds for your garden.','sunflower','Sunflower Seeds','5.00','packet',NULL,0,NULL,NULL,0,NULL,NULL,0,NULL,NULL,NULL,0,NULL);
/*!40000 ALTER `product_data` ENABLE KEYS */;
UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-10-02  8:30:00
