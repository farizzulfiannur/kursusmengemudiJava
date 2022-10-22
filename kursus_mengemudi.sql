-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2022 at 10:09 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kursus_mengemudi`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(5) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `nama`, `username`, `password`) VALUES
(1, 'Mochammad Fariz Zulfiannur', 'farizz', 'farizz');

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `Nama` varchar(100) NOT NULL,
  `Telepon` varchar(100) NOT NULL,
  `Tanggal_daftar` varchar(100) NOT NULL,
  `Paket` varchar(100) NOT NULL,
  `Jenis_mobil` varchar(100) NOT NULL,
  `Harga` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`Nama`, `Telepon`, `Tanggal_daftar`, `Paket`, `Jenis_mobil`, `Harga`) VALUES
('Fariz', '08232884684', '19 April 2022', 'Mengulang', 'Manual', '500000'),
('Afkar', '08278438564', '21 April 2022', 'Belajar', 'Manual', '1000000'),
('Abil ', '0827467567334', '22 April 2022', 'Belajar', 'Matic', '1200000'),
('Nafi', '0828748657473', '23 April 2022', 'Mengulang', 'Matic', '600000'),
('Sherly', '08232847453', '17 Oktober 2022', 'Belajar', 'Matic', '1200000'),
('Rehan', '0827864374', '03 April 2022', 'Mengulang', 'Matic', '600000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
