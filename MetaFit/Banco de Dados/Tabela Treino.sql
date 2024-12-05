create table Treino(
idTreino CHAR(36) PRIMARY KEY,
idProfessor CHAR(36),
nome VARCHAR(100) not null,
especialidades text not null,
descricao VARCHAR(200) not null,
instrucoes TEXT not null,
FOREIGN KEY (idProfessor)
REFERENCES Professor(idProfessor) ON DELETE SET NULL
) ENGINE InnoDB;
describe Treino;
drop table Treino;

select * from treino