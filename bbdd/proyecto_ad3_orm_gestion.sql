CREATE DATABASE  IF NOT EXISTS `proyecto_ad3_orm` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `proyecto_ad3_orm`;
-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: proyecto_ad3_orm
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `gestion`
--

DROP TABLE IF EXISTS `gestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gestion` (
  `codigo` varchar(6) NOT NULL,
  `codpieza` varchar(6) NOT NULL,
  `codproyecto` varchar(6) NOT NULL,
  `codproveedor` varchar(6) NOT NULL,
  `cantidad` int NOT NULL,
  `estado` varchar(4) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `piezacod_idx` (`codpieza`),
  KEY `proyectocod_idx` (`codproyecto`),
  KEY `proveedorcod_idx` (`codproveedor`),
  CONSTRAINT `piezacod` FOREIGN KEY (`codpieza`) REFERENCES `piezas` (`codigo`),
  CONSTRAINT `proveedorcod` FOREIGN KEY (`codproveedor`) REFERENCES `proveedores` (`codigo`),
  CONSTRAINT `proyectocod` FOREIGN KEY (`codproyecto`) REFERENCES `proyectos` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gestion`
--

LOCK TABLES `gestion` WRITE;
/*!40000 ALTER TABLE `gestion` DISABLE KEYS */;
INSERT INTO `gestion` VALUES ('EFGY34','DEGS42','EGVJ40','CVBN24',40,'ALTA'),('EFLK24','GAVB28','RGNK45','DFSA42',200,'ALTA'),('EGTH56','DEGS42','EGVJ40','CVBN24',20,'ALTA'),('ELTA30','GHAW30','RGNK45','ERTY81',20,'ALTA'),('KGET54','GRHT13','EWRT29','DFSA42',25,'ALTA'),('SVMS34','GTHJ56','RGNK45','DFGH73',1000,'ALTA'),('UTMN29','WEED76','QLTI86','QWER90',31,'ALTA'),('WESG23','FRGH56','RGNK45','ERTY81',500,'ALTA');
/*!40000 ALTER TABLE `gestion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-19 15:45:59
