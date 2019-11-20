-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: product
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
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `SrNo` int(4) NOT NULL,
  `Category` varchar(50) DEFAULT NULL,
  `Product_Name` varchar(50) DEFAULT NULL,
  `ID` int(4) NOT NULL,
  `MRP` varchar(20) DEFAULT NULL,
  `Quantity` varchar(15) DEFAULT NULL,
  `DOM` varchar(15) DEFAULT NULL,
  `DOE` varchar(15) DEFAULT NULL,
  `Initial_Stock` int(4) NOT NULL,
  `Current_Stock` int(4) NOT NULL,
  `Threshold_Stock` int(4) NOT NULL,
  `Total_Sales` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'   Dental  ','   Tooth Paste  ',1,'Rs. 92','  25 gm ','08/10/19','08/04/21',100,85,50,31),(2,'   Dental  ','   Tooth Brush  ',2,'Rs. 30',' 3 units','08/10/19','   NA   ',75,20,20,27),(3,'   Dental  ','   Mouth Wash   ',3,'Rs. 100',' 120 ml ','08/10/19','08/04/21',80,106,50,30),(4,'   Dental  ','      Floss     ',4,'Rs. 88','  2 mg  ','08/10/19','09/04/20',80,65,15,15),(5,'   Dental  ',' Tongue Cleaner ',5,'Rs. 15',' 1 unit ','08/10/19','   NA   ',90,59,30,30),(6,'  Bathing  ','      Soap      ',6,'Rs. 90',' 1 unit ','07/10/19','04/05/21',100,58,20,41),(7,'  Bathing  ','     Shampoo    ',7,'Rs. 90',' 185 ml ','07/07/19','04/03/21',110,70,30,40),(8,'  Bathing  ','   Conditioner  ',8,'Rs. 83','  80 ml ','07/07/19','04/01/21',98,78,25,18),(9,'  Bathing  ','   Shower Gel   ',9,'Rs. 189',' 250 ml ','08/08/19','06/05/21',125,68,35,55),(10,'  Bathing  ','    Face Wash   ',10,'Rs. 60','  50 ml ','06/12/19','06/12/21',80,15,20,45),(11,' Utilities ','  Detergent Bar ',11,'Rs. 10',' 270 gm ','08/10/19','08/07/21',100,74,30,25),(12,' Utilities ','Detergent Powder',12,'Rs. 25',' 500 gm ','09/11/19','08/10/21',95,69,35,25),(13,' Utilities ',' Toilet Cleaner ',13,'Rs. 70',' 250 ml ','08/10/19','09/08/21',90,65,25,25),(14,' Utilities ','    Hand Wash   ',14,'Rs. 75',' 200 ml ','09/10/19','11/01/21',100,91,25,8),(15,' Utilities ','     Bucket     ',15,'Rs. 70',' 1 unit ','08/10/19','   NA   ',90,65,30,25),(16,'   Dairy   ','      Milk      ',16,'Rs. 23',' 500 ml ','19/11/19','21/11/19',30,18,0,12),(17,'   Dairy   ','     Paneer     ',17,'Rs. 92',' 200 gm ','19/11/19','24/11/19',50,31,10,15),(18,'   Dairy   ','      Curd      ',18,'Rs. 35',' 500 gm ','19/11/19','25/11/19',30,15,0,15),(19,'   Dairy   ','     Butter     ',19,'Rs. 46',' 100 gm ','09/10/19','11/06/20',100,70,20,30),(20,'   Dairy   ','     Cheese     ',20,'Rs. 69',' 100 gm ','19/11/19','25/4/20',100,98,70,35),(21,'   Fruits  ','     Orange     ',21,'Rs. 85','  1 kg  ','   NA   ','   NA   ',80,45,25,35),(22,'   Fruits  ','     Banana     ',22,'Rs. 109','  1 kg  ','   NA   ','   NA   ',90,45,20,44),(23,'   Fruits  ','      Apple     ',23,'Rs. 159',' 600 gm ','   NA   ','   NA   ',100,25,35,35),(24,'   Fruits  ','      Guava     ',24,'Rs. 40',' 500 gm ','   NA   ','   NA   ',70,37,20,30),(25,'   Fruits  ','   Watermelon   ',25,'Rs. 56','  2 kg  ','   NA   ','   NA   ',60,45,20,15),(26,' Vegetables','     Tomato     ',26,'Rs. 17',' 500 gm ','   NA   ','   NA   ',100,42,30,57),(27,' Vegetables','      Onion     ',27,'Rs. 50','  1 kg  ','   NA   ','   NA   ',110,85,35,25),(28,' Vegetables','     Potato     ',28,'Rs. 23','  1 kg  ','   NA   ','   NA   ',90,60,30,30),(29,' Vegetables','   Cauliflower  ',29,'Rs. 37',' 500 gm ','   NA   ','   NA   ',50,5,10,25),(30,' Vegetables','    Capsicum    ',30,'Rs. 23',' 500 gm ','   NA   ','   NA   ',80,44,25,35),(31,'Kitchenware','   Dinner Set   ',31,'Rs. 899','18 units','08/10/19','   NA   ',50,33,10,16),(32,'Kitchenware','    Spoon Set   ',32,'Rs. 99',' 6 units','08/12/19','   NA   ',60,35,10,25),(33,'Kitchenware','  Water Bottle  ',33,'Rs. 150',' 1 unit ','09/12/19','   NA   ',70,39,15,30),(34,'Kitchenware','    Lunch Box   ',34,'Rs. 100',' 1 unit ','08/02/19','   NA   ',80,49,20,30),(35,'Kitchenware','     Cup Set    ',35,'Rs. 300',' 6 units','08/05/19','   NA   ',75,58,15,15);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-20  9:54:23
