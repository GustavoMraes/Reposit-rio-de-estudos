drop database estudo2;
create database estudo2;
use estudo2;

CREATE TABLE Autores (
    ID INT PRIMARY KEY,
    Nome VARCHAR(50)
);

INSERT INTO Autores (ID, Nome) VALUES
(1, 'Paulo Coelho'),
(2, 'J.K. Rowling'),
(3, 'Machado de Assis'),
(4, 'Agatha Christie'),
(5, 'Stephen King'),
(6, 'Autor Sem Livros'),
(7, 'George Orwell'),
(8, 'J.R.R. Tolkien');

CREATE TABLE Gêneros (
    ID INT PRIMARY KEY,
    Nome VARCHAR(50)
);

INSERT INTO Gêneros (ID, Nome) VALUES
(1, 'Romance'),
(2, 'Fantasia'),
(3, 'Clássico');

CREATE TABLE Livros (
    ID INT PRIMARY KEY,
    Título VARCHAR(100),
    Autor_ID INT,
    Gênero_ID INT,
    FOREIGN KEY (Autor_ID) REFERENCES Autores(ID),
    FOREIGN KEY (Gênero_ID) REFERENCES Gêneros(ID)
);

INSERT INTO Livros (ID, Título, Autor_ID, Gênero_ID) VALUES
(1, 'Alquimista', 1, 1),
(2, 'HP e a Pedra Filosofal', 2, 2),
(3, 'Dom Casmurro', 3, 3),
(4, 'O Assassinato no Expresso Oriente', 4, 1),
(5, 'It', 5, 2),
(6, '1984', 7, 3),
(7, 'O Senhor dos Anéis: A Sociedade do Anel', 8, 2),
(8, 'Mistério em Styles', 4, 1);

CREATE TABLE Empréstimos (
    ID INT PRIMARY KEY,
    Livro_ID INT,
    Cliente VARCHAR(50),
    Data DATE,
    FOREIGN KEY (Livro_ID) REFERENCES Livros(ID)
);



INSERT INTO Empréstimos (ID, Livro_ID, Cliente, Data) VALUES
(1, 1, 'João', '2023-08-01'),
(2, 2, 'Maria', '2023-08-03'),
(3, 1, 'Pedro', '2023-08-05'),
(4, 2, 'João', '2023-08-10'),
(5, 3, 'Maria', '2023-08-15'),
(6, 1, 'Pedro', '2023-08-20'),
(7, 2, 'Ana', '2023-08-25'),
(8, 3, 'Carlos', '2023-08-30'),
(9, 1, 'Mariana', '2023-09-05'),
(10, 2, 'Isabela', '2023-09-10'),
(11, 3, 'Lucas', '2023-09-15'),
(12, 1, 'Vitor', '2023-09-20'),
(13, 2, 'Eduarda', '2023-09-25');

-- Exercício 1: Liste o nome dos autores e o título dos livros que eles escreveram.

SELECT Autores.Nome, Livros.Título 
FROM Autores
INNER JOIN Livros ON Livros.Autor_ID = Autores.ID;

-- Exercício 2: Liste os títulos dos livros e os nomes dos clientes que fizeram empréstimos deles.

SELECT Livros.Título, Empréstimos.Cliente
FROM Livros
INNER JOIN Empréstimos on Empréstimos.Livro_ID = Livros.ID;

-- Exercício 3: Liste os nomes dos clientes e os títulos dos livros que eles pegaram emprestado, ordenados por data de empréstimo.

SELECT Empréstimos.Cliente, Livros.Título, Empréstimos.Data
FROM Empréstimos
INNER JOIN Livros on Livros.ID = Empréstimos.Livro_ID
ORDER BY Empréstimos.Data;

-- Exercício 4: Liste os nomes dos clientes e o número de livros diferentes que eles pegaram emprestado.

SELECT Empréstimos.Cliente, COUNT(Livro_ID) AS Quantidade_de_Livros_Emprestados -- Usar o COUNT para contar os livros
FROM Empréstimos
GROUP BY Cliente
ORDER BY Quantidade_de_Livros_Emprestados desc; -- Ordem DECRESCENTE

-- Exercício 5: Liste o título dos livros e os nomes dos autores, apenas para livros do gênero "Romance".

SELECT Livros.Título, Autores.Nome
FROM Livros
INNER JOIN Autores on Autores.ID = Livros.Autor_ID
WHERE Gênero_ID = 1;

-- Extra: se fosse colocar o nome do gênero tambem

SELECT Livros.Título, Autores.Nome, Gêneros.Nome AS Nome_do_Gênero -- Colocar o as para nao ter 2 coluna com mesmo nome
FROM Livros
INNER JOIN Autores ON Autores.ID = Livros.Autor_ID
INNER JOIN Gêneros ON Gêneros.ID = Livros.Gênero_ID -- Segundo join para pegar a coluna dos gêneros
WHERE Gêneros.ID = 1;

-- Capítulo 2: LEFT JOINS

-- Exercício 1 Liste todos os autores e, se aplicável, os títulos dos livros que eles escreveram. Inclua também autores que não têm livros na lista.

SELECT Autores.Nome, Livros.Título
FROM Autores
LEFT JOIN  Livros on Livros.Autor_ID = Autores.ID;

-- Exercicio 2 Liste todos os livros e, se aplicável, os nomes dos clientes que os pegaram emprestado. Inclua também livros que não foram emprestados.

SELECT Livros.Título, Empréstimos.Cliente
FROM Livros
LEFT JOIN Empréstimos on Empréstimos.Livro_ID = Livros.id;

-- Exercício 3 Liste todos os clientes e, se aplicável, a quantidade de livros que eles pegaram emprestado. Inclua também clientes que não pegaram emprestado nenhum livro.

SELECT Empréstimos.Cliente, COUNT(Livro_ID) as Quantidade_de_Livros_Emprestados
FROM Empréstimos
GROUP BY Cliente -- Aqui o chat gpt foi burro e nao criou a table cliente para poder ter cliente sem empréstimos mas esta certo

