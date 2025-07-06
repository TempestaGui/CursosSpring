INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Guilherme', '236567', '21', 'Programacao Java', '5', 'Guilherme@gmail', '991753456', 'brasilia');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Gustavo', '753567', '31', 'Estrutura de Dados', '2', 'Gustavo@gmail', '991734353', 'brasilia');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Gabriela', '653567', '28', 'Estrutura de Dados', '1', 'Gabriela@gmail', '991755768', 'brasilia');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Mateus', '345567', '45', 'Programacao Java', '7', 'Mateus@gmail', '991723456', 'brasilia');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Lazaro', '143267', '25', 'Estrutura de Dados', '4', 'Lazaro@gmail', '991712345', 'brasilia');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Michael', '565567', '23', 'Programacao Java', '2', 'Michael@gmail', '991712345', 'brasilia');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Renata', '565568', '22', 'Programacao Java', '3', 'Renata@gmail', '991745678', 'são paulo');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Carlos', '565569', '24', 'Estrutura de Dados', '4', 'Carlos@gmail', '991723456', 'rio de janeiro');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('Beatriz', '565570', '21', 'Programacao Java', '5', 'Beatriz@gmail', '991756789', 'salvador');
INSERT INTO tb_aluno (nome, matricula, idade, curso, semestre, email, telefone, cidade) VALUES ('João Pedro', '565571', '20', 'Estrutura de Dados', '1', 'JoaoPedro@gmail', '991798765', 'curitiba');

INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Renata', '236890', '34', 'Matemática', 'renata.silva@email.com', '991711223', 'São Paulo');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Thiago', '753891', '40', 'História', 'thiago.santos@email.com', '991744556', 'Curitiba');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Fernanda', '653892', '30', 'Física', 'fernanda.alves@email.com', '991766778', 'Recife');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Ricardo', '345893', '47', 'Química', 'ricardo.melo@email.com', '991788990', 'Salvador');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Tatiane', '143894', '29', 'Biologia', 'tatiane.pereira@email.com', '991700112', 'Fortaleza');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Eduardo', '565895', '36', 'Programação Web', 'eduardo.oliveira@email.com', '991799223', 'Belo Horizonte');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Patrícia', '785896', '38', 'Lógica de Programação', 'patricia.martins@email.com', '991733344', 'Porto Alegre');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Lucas', '896897', '32', 'Banco de Dados', 'lucas.costa@email.com', '991755566', 'Manaus');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('Juliana', '907898', '41', 'Redes de Computadores', 'juliana.freitas@email.com', '991766677', 'João Pessoa');
INSERT INTO tb_professor (nome, matricula, idade, materia, email, telefone, cidade) VALUES ('André', '018899', '35', 'Segurança da Informação', 'andre.lima@email.com', '991788899', 'Natal');


INSERT INTO tb_curso (nome, descricao, carga_horaria) values ('Programacao Java', 'Curso de introducao a linguagem Java', '60');
INSERT INTO tb_curso (nome, descricao, carga_horaria) VALUES ('Estrutura de Dados', 'Trabalha com listas, pilhas, filas e árvores', '80');

INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('1', '1', '0', '6.50');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('4', '1', '1', '9.21');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('6', '1', '2', '5.32');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('7', '1', '3', '5.32');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('9', '1', '4', '5.32');

INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('5', '2', '0', '1.75');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('3', '2', '1', '8.23');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('2', '2', '2', '7.00');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('8', '2', '3', '5.32');
INSERT INTO tb_aluno_curso(id_aluno, id_curso, position, nota) VALUES('10', '2', '4', '5.32');










