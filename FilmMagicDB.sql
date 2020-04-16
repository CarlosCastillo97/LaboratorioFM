-- Creamos Base de Datos --
CREATE DATABASE FilmMagic;
USE FilmMagic;
-- Creacion de Tablas --
CREATE TABLE Usuarios
(
membresia_usuario varchar(15) PRIMARY KEY,
id_usuario varchar(10) NOT NULL,
nombre_usuario varchar(50) NOT NULL,
direccion_usuario varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE Peliculas
(id_peli VARCHAR(5) PRIMARY KEY,
nombre_peli VARCHAR(25),
genero_peli VARCHAR(20),
stock_peli int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE INDEX FKstock_peli ON Peliculas (stock_peli);

CREATE TABLE Tiendas
(id_tienda VARCHAR(10) PRIMARY KEY,
nombre_tienda VARCHAR (20) NOT NULL,
direccion_tienda VARCHAR(50) NOT NULL,
FKstock_peli int,
FOREIGN KEY (FKstock_peli)
REFERENCES Peliculas(stock_peli)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
