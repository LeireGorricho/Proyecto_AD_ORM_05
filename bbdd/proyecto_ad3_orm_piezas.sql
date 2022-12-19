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
-- Table structure for table `piezas`
--

DROP TABLE IF EXISTS `piezas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `piezas` (
  `codigo` varchar(6) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` text,
  `estado` varchar(4) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `piezas`
--

LOCK TABLES `piezas` WRITE;
/*!40000 ALTER TABLE `piezas` DISABLE KEYS */;
INSERT INTO `piezas` VALUES ('DEGS42','Cinta de doble cara',6.99,'Es una cinta que tiene propiedades adhesivas por ambas caras.','ALTA'),('ELAK68','Atornillador elect',30,'Herramienta electrica que se utiliza para unir materiales entre si con tronillos.','ALTA'),('FRGH56','Tornillo',0.5,'Es una pieza metálica que tiene como función unir dos o mas elementos.','ALTA'),('GAVB28','Taco plástico',0.25,'Es un componenete wue se utiliza para fijar un tornillo en un material estructural.','ALTA'),('GHAW30','Cinta adhesiva',5.99,'Es una cinta de plástico flexible que, en una de las dos carar, posse una solución adhesiva.','ALTA'),('GRHT13','Destornillador',7.5,'Es una herramienta manual que se utiluza para apretar y aflojar tornillos.','ALTA'),('GTHJ56','Clavo',0.1,'Es una herramienta que mantiene los elementos unidos.','ALTA'),('WEED76','Martillo',10,'','ALTA');
/*!40000 ALTER TABLE `piezas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-19 14:46:32
