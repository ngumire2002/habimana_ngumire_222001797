-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 12:53 PM
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
-- Table structure for table `dashboard`
--

CREATE TABLE `dashboard` (
  `waste_events` varchar(250) NOT NULL,
  `food_inventory` varchar(250) NOT NULL,
  `waste_preventions` varchar(250) NOT NULL,
  `storage_location` varchar(250) NOT NULL,
  `reports` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `food_inventory`
--

CREATE TABLE `food_inventory` (
  `food_id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `expire_date` int(50) NOT NULL,
  `purchase_date` varchar(50) NOT NULL,
  `quantity` int(50) NOT NULL,
  `password` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `food_inventory`
--

INSERT INTO `food_inventory` (`food_id`, `name`, `expire_date`, `purchase_date`, `quantity`, `password`) VALUES
(98, 'dfg', 45, '34', 234, 34),
(134, 'trew', 5432, 'yttre', 654323, 76543),
(1223, 'wrty', 2345, 'werty', 2345, 2345),
(1234, 'asdf', 1234, 'qwer', 2345, 0),
(2345, 'werty', 12345, 'qwerty', 12345, 0),
(12345, 'ASDFG', 12345, 'ASDFG', 12345, 0),
(123456, 'SDFGH', 123456, 'FDGFGHJ', 12345, 0);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `password` int(100) NOT NULL,
  `confirm_password` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reports`
--

CREATE TABLE `reports` (
  `report_id` int(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `period` varchar(100) NOT NULL,
  `generated_date` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reports`
--

INSERT INTO `reports` (`report_id`, `type`, `period`, `generated_date`, `date`) VALUES
(12345, 'WERARC', 'VICTOR', 'MUNDEKWE', 'KHAN');

-- --------------------------------------------------------

--
-- Table structure for table `storage_location`
--

CREATE TABLE `storage_location` (
  `location_id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `temperature_range` int(50) NOT NULL,
  `capacity` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `storage_location`
--

INSERT INTO `storage_location` (`location_id`, `name`, `temperature_range`, `capacity`) VALUES
(1233, 'WERT', 1234567, 234567),
(12345, 'asdf', 1234, 1234),
(34567, 'wertyuy', 123456, 876543);

-- --------------------------------------------------------

--
-- Table structure for table `waste_events`
--

CREATE TABLE `waste_events` (
  `measure_id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `target_location` int(50) NOT NULL,
  `target_food_cartegory` varchar(50) NOT NULL,
  `implementation_date` int(50) NOT NULL,
  `responsible_person` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `waste_events`
--

INSERT INTO `waste_events` (`measure_id`, `name`, `target_location`, `target_food_cartegory`, `implementation_date`, `responsible_person`) VALUES
(123, 'GOD', 456, 'KHAN', 789, 'WEKO'),
(12345, 'eretyguh', 123456, 'wsedrfgh', 654321, 'asdfg'),
(123456, 'werty', 21345, 'sdfgh', 123456, 'etthuyytrr');

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
