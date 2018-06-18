-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 18 juin 2018 à 10:12
-- Version du serveur :  10.1.33-MariaDB
-- Version de PHP :  7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanque`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `adresse` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `nom`, `prenom`, `adresse`) VALUES
(1, 'Elsisi', 'Kamir', '20, avenue Gambetta, Paris'),
(2, 'Dupont', 'David', '97, rue de la haute marne, Rosny'),
(3, 'Becauld', 'Nathalie', '30,avenue LeMarchand 93220 Gagny');

-- --------------------------------------------------------

--
-- Structure de la table `conseiller`
--

CREATE TABLE `conseiller` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `conseiller`
--

INSERT INTO `conseiller` (`id`, `nom`, `prenom`, `login`, `password`) VALUES
(1, 'Charpone', 'Bernard', 'charpBer', 'secret'),
(4, 'Aubert', 'martine', 'aubmart', 'free');

-- --------------------------------------------------------

--
-- Structure de la table `conseiller_clients`
--

CREATE TABLE `conseiller_clients` (
  `idConseiller` int(11) NOT NULL,
  `idClients` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `conseiller_clients`
--

INSERT INTO `conseiller_clients` (`idConseiller`, `idClients`) VALUES
(1, 1),
(1, 2),
(4, 3);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `conseiller`
--
ALTER TABLE `conseiller`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `login` (`login`),
  ADD UNIQUE KEY `password` (`password`);

--
-- Index pour la table `conseiller_clients`
--
ALTER TABLE `conseiller_clients`
  ADD PRIMARY KEY (`idConseiller`,`idClients`),
  ADD KEY `fk_clients` (`idClients`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `conseiller`
--
ALTER TABLE `conseiller`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `conseiller_clients`
--
ALTER TABLE `conseiller_clients`
  ADD CONSTRAINT `fk_clients` FOREIGN KEY (`idClients`) REFERENCES `client` (`id`),
  ADD CONSTRAINT `fk_conseiller` FOREIGN KEY (`idConseiller`) REFERENCES `conseiller` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
