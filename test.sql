-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 28-08-2019 a las 23:04:39
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `id_autor` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `nacionalidad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`id_autor`, `nombre`, `nacionalidad`) VALUES
(1, 'Unit Dose Services', 'Poland'),
(4, 'Alcon Laboratories, Inc', 'Brazil'),
(5, 'Preferred Pharmaceuticals, Inc.', 'Brazil'),
(7, 'Medimetriks Pharmaceuticals, Inc.', 'China'),
(11, 'Lil\' Drug Store Products, Inc.', 'Dominican Republic'),
(14, 'General Injectables & Vaccines, Inc', 'Brazil'),
(16, 'NorthStar Rx LLC', 'Japan'),
(19, 'Wal-Mart Stores Inc', 'Vietnam'),
(20, 'Maximiliano Roselli', 'Argentina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

CREATE TABLE `direccion` (
  `id_direccion` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `altura` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `direccion`
--

INSERT INTO `direccion` (`id_direccion`, `nombre`, `altura`) VALUES
(1, 'Ms', 1101),
(3, 'Dr', 474),
(4, 'Ms', 2071),
(5, 'Mr', 2492),
(12, 'Rev', 2766),
(13, 'Mrs', 19),
(14, 'Honorable', 218),
(15, 'Mr', 1847),
(16, 'Rev', 1949),
(18, 'Mr', 600);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `establecimiento`
--

CREATE TABLE `establecimiento` (
  `id_establecimiento` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `fecha_inicio` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `establecimiento`
--

INSERT INTO `establecimiento` (`id_establecimiento`, `nombre`, `descripcion`, `fecha_inicio`) VALUES
(1, 'Google', 'Empresa de tecnologia', '2000-04-04'),
(4, 'Zooxo', '1.8', '2018-01-03'),
(10, 'Youopia', '0.73', '2017-05-22'),
(12, 'Skippad', '0.6.3', '2015-01-21'),
(13, 'Avavee', '6.70', '2015-05-28'),
(14, 'Nlounge', '1.8.0', '2016-07-03'),
(15, 'Twitterlist', '7.2.4', '2019-01-20'),
(16, 'Thoughtbeat', '9.42', '2018-03-13'),
(20, 'Shuffletag', '5.7', '2017-08-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `id_libro` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `id_autor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`id_libro`, `nombre`, `id_autor`) VALUES
(2, 'Dr. Reddy\'s Laboratories Limited', 20),
(5, 'Bryant Ranch Prepack', 4),
(7, 'REMEDYREPACK INC.', 5),
(10, 'Theravance, Inc.', 7),
(11, 'Pan Aromas LLC', 20),
(12, 'Profoot, Inc.', 4),
(14, 'Rebel Distributors Corp', 5),
(16, 'B. Braun Medical Inc.', 7),
(19, 'Paddock Laboratories, Inc.', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `apellido` varchar(150) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `id_hijo` int(11) DEFAULT NULL,
  `id_direccion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_persona`, `nombre`, `apellido`, `fecha_nacimiento`, `id_hijo`, `id_direccion`) VALUES
(1, 'Emmett', 'Siggee', '1998-08-07', NULL, 1),
(2, 'Virginie', 'Larman', '2012-12-03', 1, 12),
(3, 'Virginie', 'Larman', '2012-12-03', 2, 3),
(4, 'Maximiliano', 'Roselli', '1990-04-04', 3, 4),
(5, 'Maximiliano', 'Roselli', '1990-04-04', 4, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_establecimiento`
--

CREATE TABLE `persona_establecimiento` (
  `id_persona` int(11) NOT NULL,
  `id_establecimiento` int(11) NOT NULL,
  `fecha_inicio` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona_establecimiento`
--

INSERT INTO `persona_establecimiento` (`id_persona`, `id_establecimiento`, `fecha_inicio`) VALUES
(1, 4, '2019-08-28'),
(1, 10, '2019-08-28'),
(1, 15, '2019-08-28'),
(1, 16, '2019-08-28'),
(1, 18, '2019-08-28'),
(2, 11, '2019-08-28'),
(4, 5, '2019-08-28'),
(4, 14, '2019-08-28'),
(5, 20, '2019-08-28'),
(7, 20, '2019-08-28'),
(8, 7, '2019-08-28'),
(8, 13, '2019-08-28'),
(9, 8, '2019-08-28'),
(12, 1, '2019-08-28'),
(13, 10, '2019-08-28'),
(14, 13, '2019-08-28'),
(15, 12, '2019-08-28'),
(17, 1, '2019-08-28'),
(18, 14, '2019-08-28'),
(19, 13, '2019-08-28');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id_autor`);

--
-- Indices de la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`id_direccion`);

--
-- Indices de la tabla `establecimiento`
--
ALTER TABLE `establecimiento`
  ADD PRIMARY KEY (`id_establecimiento`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id_libro`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_persona`),
  ADD KEY `id_direccion` (`id_direccion`);

--
-- Indices de la tabla `persona_establecimiento`
--
ALTER TABLE `persona_establecimiento`
  ADD PRIMARY KEY (`id_persona`,`id_establecimiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autor`
--
ALTER TABLE `autor`
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `direccion`
--
ALTER TABLE `direccion`
  MODIFY `id_direccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `establecimiento`
--
ALTER TABLE `establecimiento`
  MODIFY `id_establecimiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id_persona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
