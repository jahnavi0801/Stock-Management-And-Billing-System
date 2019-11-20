-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: customer
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `cus_info`
--

DROP TABLE IF EXISTS `cus_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cus_info` (
  `sno` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `phno` varchar(10) DEFAULT NULL,
  `items` varchar(300) DEFAULT NULL,
  `totalcost` int(11) DEFAULT NULL,
  `billno` int(11) DEFAULT NULL,
  `Customer_Requests` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cus_info`
--

LOCK TABLES `cus_info` WRITE;
/*!40000 ALTER TABLE `cus_info` DISABLE KEYS */;
INSERT INTO `cus_info` VALUES (1,'A','9876543210','apple - 1 - 159;Tooth Paste - 1 - 92;',251,1,'NA'),(2,'B','9821234523','    Spoon Set    - 1 - 99 ;    Watermelon    - 2 - 112 ; ',211,2,'Add more fruits.'),(3,'C','8500457823','   Tooth Brush   - 2 - 60 ; ',60,3,'NA.'),(4,'J','0987654321','   Dinner Set    - 1 - 899 ; ',899,4,'NA.'),(5,'K','0987654321','   Tooth Paste   - 1 - 92 ;     Face Wash    - 2 - 120 ; ',212,5,'NA.');
/*!40000 ALTER TABLE `cus_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-20  9:54:47
