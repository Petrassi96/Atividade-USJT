create table Professor(
idProfessor CHAR(36) PRIMARY KEY,
idUsuario CHAR(36) NOT NULL,
especialidades TEXT not null,
FOREIGN KEY (idUsuario)
REFERENCES Usuario(idUsuario) ON DELETE CASCADE
) ENGINE InnoDB;
describe Professor;
drop table Professor;

select * from professor;