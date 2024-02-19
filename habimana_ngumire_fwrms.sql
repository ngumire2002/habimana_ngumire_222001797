-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 12:18 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `habimana_ngumire_fwrms`
--

-- --------------------------------------------------------

--
-- Table structure for table `waste_prevention_measures`
--

CREATE TABLE `waste_prevention_measures` (
  `waste_events_id` int(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `quantity_wasted` varchar(100) NOT NULL,
  `reason` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `waste_prevention_measures`
--

INSERT INTO `waste_prevention_measures` (`waste_events_id`, `date`, `quantity_wasted`, `reason`) VALUES
(12, 'WER', 'ER', 'WE'),
(123, 'QWERQWER', 'QWER', 'QWERF'),
(234, 'QWERT', 'ASDFGH', 'ASDFGH'),
(1234, 'qwer', 'werfg', 'wsedrf'),
(12345, 'qwerty', 'qwerty', 'werty'),
(123456, 'qasdfg', 'sdfgh', 'sdfg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `waste_prevention_measures`
--
ALTER TABLE `waste_prevention_measures`
  ADD PRIMARY KEY (`waste_events_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
