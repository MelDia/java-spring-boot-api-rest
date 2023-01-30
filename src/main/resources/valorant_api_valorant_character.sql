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
-- Table structure for table `valorant_character`
--

DROP TABLE IF EXISTS `valorant_character`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `valorant_character` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(225) DEFAULT NULL,
  `origin` varchar(225) DEFAULT NULL,
  `role` varchar(225) DEFAULT NULL,
  `id_abilities` int DEFAULT NULL,
  `biography` varchar(400) DEFAULT NULL,
  `id_images` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_abilities_idx` (`id_abilities`),
  KEY `id_images_idx` (`id_images`),
  CONSTRAINT `id_abilities` FOREIGN KEY (`id_abilities`) REFERENCES `valorant_abilities` (`id_character`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_images` FOREIGN KEY (`id_images`) REFERENCES `valorant_images` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valorant_character`
--

LOCK TABLES `valorant_character` WRITE;
/*!40000 ALTER TABLE `valorant_character` DISABLE KEYS */;
INSERT INTO `valorant_character` VALUES (1,'Jett','South Korea','Duelist',1,'Representing her home country of South Korea, Jett agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies before they even know what hit them.',1),(2,'Neon','Philippines','Duelist',2,'Filipino Agent Neon surges forward at shocking speeds, discharging bursts of bioelectric radiance as fast as her body generates it. She races ahead to catch enemies off guard, then strikes them down quicker than lightning.',NULL),(3,'Phoenix','United Kingdom','Duelist',3,'Hailing from the U.K., Phoenix is star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he is got backup or not, he will rush into a fight on his own terms.',NULL),(4,'Astra','Ghana','Controller',4,'Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she’s always eons ahead of her enemy’s next move.',NULL),(5,'Reyna','Mexico','Duelist',5,'Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance.',NULL),(6,'Yoru','Japan','Duelist',6,'Japanese native Yoru rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal \r measure, he gets the drop on each target before they know where to look.',NULL),(7,'Raze','Brazil','Duelist',7,'Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched \r enemies and clearing tight spaces with a generous dose of “boom.”',NULL),(8,'Brimstone','United States','Controllers',8,'Joining from the USA, Brimstone is orbital arsenal ensures his squad always has the advantage. His ability to deliver \r utility precisely and from a distance make him an unmatched boots-on-the-ground \r commander.',NULL),(9,'Harbor','India','Controllers',9,'Hailing from India is coast, Harbor storms the field wielding ancient technology with dominion over water. He unleashes frothing \r rapids and crushing waves to shield his allies and to pummel those that oppose him.',NULL),(10,'Viper','United States','Controllers',10,'The American chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and cripple \r the enemy is vision. If the toxins dont kill her prey, her mind games surely will.',NULL),(11,'Omen','Earth','Controllers',11,'A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as \r his foe scrambles to learn where he might strike next.',NULL),(12,'Kay/o','Cybernetic','Initiators',12,'KAY/O is a machine of war built for a single purpose: neutralizing radiants. His power to suppress enemy abilities cripples his opponents\' capacity to fight back, securing him and his allies the ultimate edge',NULL),(13,'Breach','Sweden','Initiators',13,'Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.',NULL),(14,'Fade','Turkey','Initiators',14,'Turkish bounty hunter Fade unleashes the power of raw nightmare to seize enemy secrets. Attuned with terror itself, she hunts down targets and reveals their deepest fears - before crushing them in the dark.',NULL),(15,'Skye','Australia','Initiators',15,'Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye\'s side.',NULL),(16,'Sova','Russia','Initiators',16,'Born from the eternal winter of Russia\'s tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.',NULL),(17,'Sage','China','Sentinels',17,'The bastion of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight.',NULL),(18,'Killjoy','Germany','Sentinels',18,'The genius of Germany, Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn\'t stop her enemies, her robots debuff will help make short work of them.',NULL),(19,'Chamber','France','Sentinels',19,'Well dressed and well armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan.',NULL),(20,'Cypher','Morocco','Sentinels',20,'The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy’s every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.',NULL);
/*!40000 ALTER TABLE `valorant_character` ENABLE KEYS */;
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
