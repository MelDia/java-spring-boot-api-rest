-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: valorant_api
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `valorant_images`
--

DROP TABLE IF EXISTS `valorant_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `valorant_images` (
  `id` int NOT NULL AUTO_INCREMENT,
  `character_image` varchar(445) DEFAULT NULL,
  `role_image` varchar(445) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valorant_images`
--

LOCK TABLES `valorant_images` WRITE;
/*!40000 ALTER TABLE `valorant_images` DISABLE KEYS */;
INSERT INTO `valorant_images` VALUES (1,'/valorant-api-rest/src/main/resources/images/JETT.png','/valorant-api-rest/src/main/resources/images/DUELIST.png'),(2,'/valorant-api-rest/src/main/resources/images/NEON.png','/valorant-api-rest/src/main/resources/images/DUELIST.png'),(3,'/valorant-api-rest/src/main/resources/images/PHEONIX.png','/valorant-api-rest/src/main/resources/images/DUELIST.png'),(4,'/valorant-api-rest/src/main/resources/images/ASTRA.png','/valorant-api-rest/src/main/resources/images/DUELIST.png'),(5,'/valorant-api-rest/src/main/resources/images/REYNA.png','/valorant-api-rest/src/main/resources/images/DUELIST.png'),(6,'/valorant-api-rest/src/main/resources/images/YORU.png','/valorant-api-rest/src/main/resources/images/DUELIST.png'),(7,'/valorant-api-rest/src/main/resources/images/RAZE.png','/valorant-api-rest/src/main/resources/images/DUELIST.png'),(8,'/valorant-api-rest/src/main/resources/images/BRIMSTONE.png','/valorant-api-rest/src/main/resources/images/CONTROLLER.png'),(9,'/valorant-api-rest/src/main/resources/images/HARBOR.png','rest/src/main/resources/images/CONTROLLER.png'),(10,'/valorant-api-rest/src/main/resources/images/VIPER.png','rest/src/main/resources/images/CONTROLLER.png'),(11,'/valorant-api-rest/src/main/resources/images/OMEN.png','rest/src/main/resources/images/CONTROLLER.png'),(12,'/valorant-api-rest/src/main/resources/images/KAYO.png','rest/src/main/resources/images/INITIATORS.png'),(13,'/valorant-api-rest/src/main/resources/images/BREACH.png','rest/src/main/resources/images/INITIATORS.png'),(14,'/valorant-api-rest/src/main/resources/images/FADE.png','rest/src/main/resources/images/INITIATORS.png'),(15,'/valorant-api-rest/src/main/resources/images/SKYE.png','rest/src/main/resources/images/INITIATORS.png'),(16,'/valorant-api-rest/src/main/resources/images/SOVA.png','rest/src/main/resources/images/INITIATORS.png'),(17,'/valorant-api-rest/src/main/resources/images/SAGE.png','rest/src/main/resources/images/SENTINELS.png'),(18,'/valorant-api-rest/src/main/resources/images/KILLJOY.png','rest/src/main/resources/images/SENTINELS.png'),(19,'/valorant-api-rest/src/main/resources/images/CHAMBER.png','rest/src/main/resources/images/SENTINELS.png'),(20,'/valorant-api-rest/src/main/resources/images/CYPHER.png','rest/src/main/resources/images/SENTINELS.png');
/*!40000 ALTER TABLE `valorant_images` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-26 23:28:41
