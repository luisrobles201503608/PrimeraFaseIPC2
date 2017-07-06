-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.2.6-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para bdbanquetzal
CREATE DATABASE IF NOT EXISTS `bdbanquetzal` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bdbanquetzal`;

-- Volcando estructura para tabla bdbanquetzal.agencia
CREATE TABLE IF NOT EXISTS `agencia` (
  `codigoagencia` int(11) NOT NULL,
  `direccion` varchar(500) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `horarioapertura` time DEFAULT NULL,
  `horariocierre` time DEFAULT NULL,
  PRIMARY KEY (`codigoagencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.cheque
CREATE TABLE IF NOT EXISTS `cheque` (
  `correlativo` int(11) NOT NULL,
  `nombre` varchar(70) DEFAULT NULL,
  `monto` int(11) DEFAULT NULL,
  `firmadigital` varchar(50) DEFAULT NULL,
  `cuenta_nocuenta` int(11) NOT NULL,
  `chequera_identificador` varchar(50) NOT NULL,
  PRIMARY KEY (`correlativo`),
  KEY `cheque_chequera_fk` (`chequera_identificador`),
  KEY `cheque_cuenta_fk` (`cuenta_nocuenta`),
  CONSTRAINT `cheque_chequera_fk` FOREIGN KEY (`chequera_identificador`) REFERENCES `chequera` (`identificador`),
  CONSTRAINT `cheque_cuenta_fk` FOREIGN KEY (`cuenta_nocuenta`) REFERENCES `cuenta` (`nocuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.chequera
CREATE TABLE IF NOT EXISTS `chequera` (
  `identificador` varchar(50) NOT NULL,
  `cuenta_nocuenta` int(11) DEFAULT NULL,
  PRIMARY KEY (`identificador`),
  KEY `chequera_cuenta_fk` (`cuenta_nocuenta`),
  CONSTRAINT `chequera_cuenta_fk` FOREIGN KEY (`cuenta_nocuenta`) REFERENCES `cuenta` (`nocuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.clienteindi
CREATE TABLE IF NOT EXISTS `clienteindi` (
  `cui` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `fechanacimiento` date DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `contraseña` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cui`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.clientenomi
CREATE TABLE IF NOT EXISTS `clientenomi` (
  `codigoempresa` varchar(20) NOT NULL,
  `nombreempresa` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codigoempresa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.cuenta
CREATE TABLE IF NOT EXISTS `cuenta` (
  `nocuenta` int(11) NOT NULL,
  `saldo` int(11) DEFAULT NULL,
  `estado` varchar(30) DEFAULT NULL,
  `clienteindi_cui` varchar(20) NOT NULL,
  `tipocuenta_id` int(11) NOT NULL,
  PRIMARY KEY (`nocuenta`),
  KEY `cuenta_clienteindi_fk` (`clienteindi_cui`),
  KEY `tipocuenta_fk` (`tipocuenta_id`),
  CONSTRAINT `cuenta_clienteindi_fk` FOREIGN KEY (`clienteindi_cui`) REFERENCES `clienteindi` (`cui`),
  CONSTRAINT `tipocuenta_fk` FOREIGN KEY (`tipocuenta_id`) REFERENCES `tipocuenta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.estadocuenta
CREATE TABLE IF NOT EXISTS `estadocuenta` (
  `nombreestado` int(11) NOT NULL,
  `prestamo` int(11) DEFAULT NULL,
  `transacterceros` int(11) DEFAULT NULL,
  `transacpersonal` int(11) DEFAULT NULL,
  `puntosacumulados` int(11) DEFAULT NULL,
  `Retiro` int(11) DEFAULT NULL,
  `Deposito` int(11) DEFAULT NULL,
  `cuenta_nocuenta` int(11) DEFAULT NULL,
  PRIMARY KEY (`nombreestado`),
  KEY `estadocuentafk` (`cuenta_nocuenta`),
  CONSTRAINT `estadocuentafk` FOREIGN KEY (`cuenta_nocuenta`) REFERENCES `cuenta` (`nocuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.prestamos
CREATE TABLE IF NOT EXISTS `prestamos` (
  `idprestamo` int(11) NOT NULL AUTO_INCREMENT,
  `cantidadaprestar` int(11) NOT NULL,
  `cuenta_nocuenta` int(11) NOT NULL,
  PRIMARY KEY (`idprestamo`),
  KEY `prestamos_fk` (`cuenta_nocuenta`),
  CONSTRAINT `prestamos_fk` FOREIGN KEY (`cuenta_nocuenta`) REFERENCES `cuenta` (`nocuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.registronomina
CREATE TABLE IF NOT EXISTS `registronomina` (
  `idregistro` int(11) NOT NULL,
  `sueldoempleado` int(11) DEFAULT NULL,
  `clientempresa` varchar(20) NOT NULL,
  `cuenta_nocuenta` int(11) NOT NULL,
  PRIMARY KEY (`idregistro`,`cuenta_nocuenta`),
  KEY `registronomina_clientenomi_fk` (`clientempresa`),
  KEY `registronomina_cuenta_fk` (`cuenta_nocuenta`),
  CONSTRAINT `registronomina_clientenomi_fk` FOREIGN KEY (`clientempresa`) REFERENCES `clientenomi` (`codigoempresa`),
  CONSTRAINT `registronomina_cuenta_fk` FOREIGN KEY (`cuenta_nocuenta`) REFERENCES `cuenta` (`nocuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.roloperador
CREATE TABLE IF NOT EXISTS `roloperador` (
  `idrol` int(11) NOT NULL,
  `rol` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idrol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.tipocuenta
CREATE TABLE IF NOT EXISTS `tipocuenta` (
  `id` int(11) NOT NULL,
  `tipo` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla bdbanquetzal.trabajadorbanco
CREATE TABLE IF NOT EXISTS `trabajadorbanco` (
  `cui` varchar(20) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `fechanacimiento` date DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `usuario` varchar(30) DEFAULT NULL,
  `contraseña` varchar(20) DEFAULT NULL,
  `roloperador_idrol` int(11) NOT NULL,
  `agencia_codigoagencia` int(11) NOT NULL,
  PRIMARY KEY (`cui`),
  KEY `trabajadorbanco_agencia_fk` (`agencia_codigoagencia`),
  KEY `trabajadorbanco_roloperador_fk` (`roloperador_idrol`),
  CONSTRAINT `trabajadorbanco_agencia_fk` FOREIGN KEY (`agencia_codigoagencia`) REFERENCES `agencia` (`codigoagencia`),
  CONSTRAINT `trabajadorbanco_roloperador_fk` FOREIGN KEY (`roloperador_idrol`) REFERENCES `roloperador` (`idrol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
