-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 18 juin 2018 à 16:21
-- Version du serveur :  10.1.32-MariaDB
-- Version de PHP :  7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanquev2`
--

-- --------------------------------------------------------
--
-- Structure de la table `personne`
--

CREATE TABLE `personne` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `telephone` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`id`, `nom`, `prenom`, `adresse`, `telephone`) VALUES
(1,'Durieux', 'Elocia', '20, avenue Gambetta, Paris', 0154859632),
(2,'john', 'vanhertmann', '20, rue du jouet, Strasbourg', 0654858532),
(3,'monsieur', 'conseiller', '14 bd saint georges, Paris', 0755556937),
(4,'joiut', 'hermann', '30 rue lecourbe, Avignon', 0642421687),
(5,'jojo', 'dudu', '158 avenue de france, 75006 Paris', 0785204612),
(6,'franck', 'bonhomme', '75 rue saint jacques, Rosny', 0612457865),
(7,'Roussel', 'Sylvain', '4 rue de la glacière,75014 Paris', 0616657835);



-- ---------------------------------------------------------------------


--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`) VALUES
(1),
(4),
(6),
(7);

-- --------------------------------------------------------


--
-- Structure de la table `conseiller`
--

CREATE TABLE `conseiller` (
  `id` int(11) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `conseiller`
--

INSERT INTO `conseiller` (`id`, `login`, `password`) VALUES
(2, 'jvanher', 'mdp'),
(3, 'conseiller', 'secret'),
(5, 'jodudu', 'hello');


-- --------------------------------------------------------

--
-- Structure de la table `comptes`
--

CREATE TABLE `comptes` (
  `id` int(11) NOT NULL,
  `solde` decimal(60,2) DEFAULT NULL,
  `typeCompte` varchar(7) NOT NULL,
  `decouvert` decimal(7,2) DEFAULT NULL,
  `taux` decimal(4,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `comptes`
--

INSERT INTO `comptes` (`id`, `solde`, `typeCompte`, `decouvert`, `taux`) VALUES
(1, '5000.00', 'epargne', NULL, '0.12'),
(2, '7000.00', 'courant', '500.00', NULL),
(3, '2500.00', 'courant', '500.00', NULL),
(4, '3000.00', 'epargne', NULL, '0.06'),
(5, '600.00', 'courant', '300.00', NULL),
(6, '1000.00', 'courant', '300.00', NULL);


-- --------------------------------------------------------



--
-- Structure de la table `client_compte`
--

CREATE TABLE `client_compte` (
  `idClient` int(11) NOT NULL,
  `idCompte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client_compte`
--

INSERT INTO `client_compte` (`idClient`, `idCompte`) VALUES
(1, 1),
(1, 2),
(4, 3),
(4, 4),
(6, 5),
(7, 6);





-- --------------------------------------------------------

--
-- Structure de la table `conseiller_clients`
--

CREATE TABLE `conseiller_clients` (
  `idConseiller` int(11) NOT NULL,
  `idClient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `conseiller_clients`
--

INSERT INTO `conseiller_clients` (`idConseiller`, `idClient`) VALUES
(2, 1),
(2, 4),
(2, 6),
(3, 7);

-- --------------------------------------------------------



--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `client_compte`
--
ALTER TABLE `client_compte`
  ADD PRIMARY KEY (`idClient`,`idCompte`) USING BTREE;

--
-- Index pour la table `comptes`
--
ALTER TABLE `comptes`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `conseiller`
--
ALTER TABLE `conseiller`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `conseiller_clients`
--
ALTER TABLE `conseiller_clients`
  ADD PRIMARY KEY (`idConseiller`,`idClient`),
  ADD UNIQUE KEY `idClient` (`idClient`) USING BTREE,
  ADD KEY `idConseiller` (`idConseiller`) USING BTREE;

--
-- Index pour la table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `comptes`
--
ALTER TABLE `comptes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `conseiller`
--
ALTER TABLE `conseiller`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `personne`
--
ALTER TABLE `personne`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
