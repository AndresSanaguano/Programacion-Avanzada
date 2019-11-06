-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 30-10-2019 a las 13:59:06
-- Versión del servidor: 5.7.17-log
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `appmobile`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

CREATE TABLE `product` (
  `id` int(10) NOT NULL,
  `name_p` varchar(30) NOT NULL,
  `description` varchar(30) NOT NULL,
  `stock` int(10) NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `product`
--

INSERT INTO `product` (`id`, `name_p`, `description`, `stock`, `price`) VALUES
(1, 'queso', 'lacteo', 10, 2),
(2, 'fanta', 'bebidad', 10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provider`
--

CREATE TABLE `provider` (
  `id` int(10) NOT NULL,
  `name_p` varchar(30) NOT NULL,
  `addres` varchar(30) NOT NULL,
  `telephone` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `provider`
--

INSERT INTO `provider` (`id`, `name_p`, `addres`, `telephone`) VALUES
(1723764021, 'juan', 'pintag', '2384010'),
(1723764032, 'maria', 'quito', '2384019');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `report`
--

CREATE TABLE `report` (
  `id` int(10) NOT NULL,
  `name_pr` varchar(30) NOT NULL,
  `stock` int(10) NOT NULL,
  `price` int(10) NOT NULL,
  `id_p` int(10) NOT NULL,
  `name_p` varchar(30) NOT NULL,
  `addres` varchar(30) NOT NULL,
  `telephone` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `report`
--

INSERT INTO `report` (`id`, `name_pr`, `stock`, `price`, `id_p`, `name_p`, `addres`, `telephone`) VALUES
(1, 'queso', 10, 2, 1723764021, 'juan', 'pintag', '2384010'),
(2, 'fanta', 10, 1, 1723764032, 'maria', 'quito', '2384019');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
