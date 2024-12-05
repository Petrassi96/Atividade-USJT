create table Aluno(
idAluno CHAR(36) PRIMARY KEY,
idUsuario CHAR(36) NOT NULL,
idade tinyint not null,
peso double not null,
genero char(1) not null,
pesoMeta double,
FOREIGN KEY (idUsuario)
REFERENCES Usuario(idUsuario) ON DELETE CASCADE
) ENGINE InnoDB;
describe Aluno;

select * from aluno;
