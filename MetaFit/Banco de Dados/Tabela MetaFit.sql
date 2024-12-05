create database MetaFit;
use MetaFit;
create table Usuario(
idUsuario CHAR(36) PRIMARY KEY,
nome VARCHAR(80) not null,
email VARCHAR(50) unique not null,
senha VARCHAR(256) not null,
tipo tinyint not null
) ENGINE = InnoDB;
describe Usuario;
drop table Usuario;

select * from Usuario;

