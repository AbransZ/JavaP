-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 04-08-2023 a las 17:35:04
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centro`
--

CREATE TABLE `centro` (
  `Cod_centro` int(11) NOT NULL,
  `Director` int(11) NOT NULL,
  `Nom_centro` varchar(100) DEFAULT NULL,
  `Poblacion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `centro`
--

INSERT INTO `centro` (`Cod_centro`, `Director`, `Nom_centro`, `Poblacion`) VALUES
(1, 24815101, 'palmeras', '182'),
(2, 24815101, 'santa cruz', '355'),
(3, 12345, 'margarita', '350'),
(4, 12345, 'barinas', '500'),
(5, 123456, 'el palmar', '800');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `Cod_dep` int(11) NOT NULL,
  `Nom_dep` varchar(100) DEFAULT NULL,
  `Presupuesto` double DEFAULT NULL,
  `Cod_centro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`Cod_dep`, `Nom_dep`, `Presupuesto`, `Cod_centro`) VALUES
(1, 'vendedores', 200.5, 1),
(12, 'produccion', 5000.8, 2),
(15, 'recursos humanos', 18000, 5),
(16, 'Administrativo\r\n', 300, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

CREATE TABLE `direccion` (
  `id` int(11) NOT NULL,
  `Av` varchar(100) DEFAULT NULL,
  `Calle` varchar(100) DEFAULT NULL,
  `Cod_centro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `direccion`
--

INSERT INTO `direccion` (`id`, `Av`, `Calle`, `Cod_centro`) VALUES
(1, 'principal', '1', 1),
(2, 'Av. bolivar, Maracay', '4', 1),
(3, 'los girasoles', '8', 4),
(4, 'Principal,centro', '15', 3),
(5, 'Residencial', '24', 2),
(7, 'bolivar', '3', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `RIF` int(11) NOT NULL,
  `Nom_emp` varchar(100) DEFAULT NULL,
  `Fecha_ingreso` date DEFAULT NULL,
  `salario` double NOT NULL,
  `Cod_dep` int(11) DEFAULT NULL,
  `estado` varchar(15) NOT NULL,
  `contrasenia` int(11) NOT NULL,
  `ID_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`RIF`, `Nom_emp`, `Fecha_ingreso`, `salario`, `Cod_dep`, `estado`, `contrasenia`, `ID_rol`) VALUES
(1234, 'andres1', '2023-07-31', 100, 12, 'activo', 123, 2),
(12345, 'luis amalla', '2023-07-24', 650.2, 1, 'activo', 123, 1),
(123456, 'juan', '2023-07-18', 125.5, 1, 'inactivo', 1234, 2),
(258963, 'roberto', '2022-10-05', 200, 15, 'activo', 123, 2),
(24815101, 'Joseph Nieves', '2023-07-24', 500, 1, 'activo', 123, 1),
(31304244, 'xavier tirado', '2023-08-03', 50, 12, 'ACTIVO', 1234, 2),
(987654321, 'jose perez', '2023-07-24', 120.5, 1, 'activo', 123, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado_habilidad`
--

CREATE TABLE `empleado_habilidad` (
  `id` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `id_habilidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado_habilidad`
--

INSERT INTO `empleado_habilidad` (`id`, `id_empleado`, `id_habilidad`) VALUES
(2, 12345, 1),
(1, 12345, 11),
(13, 258963, 8),
(10, 24815101, 8),
(4, 24815101, 11),
(3, 987654321, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habilidades`
--

CREATE TABLE `habilidades` (
  `Cod_hab` int(11) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habilidades`
--

INSERT INTO `habilidades` (`Cod_hab`, `Descripcion`) VALUES
(1, 'Vendedor'),
(6, 'trato con el cliente'),
(8, 'operario de maquinaria'),
(11, 'administrar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hijos`
--

CREATE TABLE `hijos` (
  `id` int(11) NOT NULL,
  `RIF` int(11) DEFAULT NULL,
  `Fecha_nacimiento` date DEFAULT NULL,
  `Nom_hijo` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `hijos`
--

INSERT INTO `hijos` (`id`, `RIF`, `Fecha_nacimiento`, `Nom_hijo`) VALUES
(1, 24815101, '2020-09-24', 'Kozha'),
(2, 24815101, '2015-10-24', 'tamky'),
(4, 24815101, '2010-01-01', 'cachito'),
(5, 24815101, '2017-09-10', 'tyrone'),
(6, 258963, '2023-08-04', 'juanito');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol_empleado`
--

CREATE TABLE `rol_empleado` (
  `id_rol` int(11) NOT NULL,
  `nombre_rol` varchar(100) NOT NULL,
  `Cod_centro` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rol_empleado`
--

INSERT INTO `rol_empleado` (`id_rol`, `nombre_rol`, `Cod_centro`, `descripcion`) VALUES
(1, 'administrador', 2, 'Crea lee edita elimina usuarios'),
(2, 'empleado comun', 2, 'solo puede vender y mirar sus registros');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefonos`
--

CREATE TABLE `telefonos` (
  `id` int(11) NOT NULL,
  `RIF` int(11) DEFAULT NULL,
  `Tlf_fijo` varchar(100) DEFAULT NULL,
  `Tlf_movil` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `telefonos`
--

INSERT INTO `telefonos` (`id`, `RIF`, `Tlf_fijo`, `Tlf_movil`) VALUES
(1, 24815101, '0243458', '0412458'),
(2, 12345, '024311111', '041255555');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `centro`
--
ALTER TABLE `centro`
  ADD PRIMARY KEY (`Cod_centro`),
  ADD KEY `Director` (`Director`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`Cod_dep`),
  ADD KEY `Cod_centro` (`Cod_centro`);

--
-- Indices de la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Cod_centro` (`Cod_centro`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`RIF`),
  ADD KEY `Cod_dep` (`Cod_dep`),
  ADD KEY `ID_rol` (`ID_rol`);

--
-- Indices de la tabla `empleado_habilidad`
--
ALTER TABLE `empleado_habilidad`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_empleado` (`id_empleado`,`id_habilidad`),
  ADD KEY `id_habilidad` (`id_habilidad`);

--
-- Indices de la tabla `habilidades`
--
ALTER TABLE `habilidades`
  ADD PRIMARY KEY (`Cod_hab`) USING BTREE,
  ADD UNIQUE KEY `Cod_hab` (`Cod_hab`);

--
-- Indices de la tabla `hijos`
--
ALTER TABLE `hijos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `RIF` (`RIF`);

--
-- Indices de la tabla `rol_empleado`
--
ALTER TABLE `rol_empleado`
  ADD PRIMARY KEY (`id_rol`),
  ADD KEY `Cod_centro` (`Cod_centro`);

--
-- Indices de la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `RIF` (`RIF`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `direccion`
--
ALTER TABLE `direccion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `empleado_habilidad`
--
ALTER TABLE `empleado_habilidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `hijos`
--
ALTER TABLE `hijos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `telefonos`
--
ALTER TABLE `telefonos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `centro`
--
ALTER TABLE `centro`
  ADD CONSTRAINT `centro_ibfk_1` FOREIGN KEY (`Director`) REFERENCES `empleado` (`RIF`);

--
-- Filtros para la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD CONSTRAINT `departamento_ibfk_1` FOREIGN KEY (`Cod_centro`) REFERENCES `centro` (`Cod_centro`);

--
-- Filtros para la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD CONSTRAINT `direccion_ibfk_1` FOREIGN KEY (`Cod_centro`) REFERENCES `centro` (`Cod_centro`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`Cod_dep`) REFERENCES `departamento` (`Cod_dep`);

--
-- Filtros para la tabla `empleado_habilidad`
--
ALTER TABLE `empleado_habilidad`
  ADD CONSTRAINT `empleado_habilidad_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`RIF`),
  ADD CONSTRAINT `empleado_habilidad_ibfk_2` FOREIGN KEY (`id_habilidad`) REFERENCES `habilidades` (`Cod_hab`);

--
-- Filtros para la tabla `hijos`
--
ALTER TABLE `hijos`
  ADD CONSTRAINT `hijos_ibfk_1` FOREIGN KEY (`RIF`) REFERENCES `empleado` (`RIF`);

--
-- Filtros para la tabla `rol_empleado`
--
ALTER TABLE `rol_empleado`
  ADD CONSTRAINT `rol_empleado_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `empleado` (`ID_rol`),
  ADD CONSTRAINT `rol_empleado_ibfk_2` FOREIGN KEY (`Cod_centro`) REFERENCES `centro` (`Cod_centro`);

--
-- Filtros para la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD CONSTRAINT `telefonos_ibfk_1` FOREIGN KEY (`RIF`) REFERENCES `empleado` (`RIF`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
