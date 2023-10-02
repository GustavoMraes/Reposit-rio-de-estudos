drop database estudo;
create database estudo;
use estudo;

-- 

-- Criação da tabela Clientes
CREATE TABLE Clientes (
    ID INT PRIMARY KEY,
    Nome VARCHAR(50),
    Sobrenome VARCHAR(50),
    Cidade VARCHAR(50)
);

-- Inserção de dados na tabela Clientes
INSERT INTO Clientes (ID, Nome, Sobrenome, Cidade) VALUES
(1, 'João', 'Silva', 'São Paulo'),
(2, 'Maria', 'Santos', 'Rio de Janeiro'),
(3, 'Pedro', 'Costa', 'Belo Horizonte'),
(4, 'Ana', 'Oliveira', 'Salvador'),
(5, 'Carlos', 'Rocha', 'Recife');

-- Criação da tabela Categorias
CREATE TABLE Categorias (
    ID INT PRIMARY KEY,
    Nome VARCHAR(50)
);

-- Inserção de dados na tabela Categorias
INSERT INTO Categorias (ID, Nome) VALUES
(1, 'Eletrônicos'),
(2, 'Roupas'),
(3, 'Alimentos');

-- Criação da tabela Produtos
CREATE TABLE Produtos (
    ID INT PRIMARY KEY,
    Nome VARCHAR(100),
    Preço DECIMAL(10, 2),
    Categoria_ID INT,
    FOREIGN KEY (Categoria_ID) REFERENCES Categorias(ID)
);

-- Inserção de dados na tabela Produtos
INSERT INTO Produtos (ID, Nome, Preço, Categoria_ID) VALUES
(1, 'Smartphone', 799.99, 1),
(2, 'Notebook', 1299.99, 1),
(3, 'Camiseta', 19.99, 2),
(4, 'Calça Jeans', 39.99, 2),
(5, 'Arroz', 4.99, 3),
(6, 'Feijão', 3.99, 3);

-- Criação da tabela Pedidos
CREATE TABLE Pedidos (
    ID INT PRIMARY KEY,
    Cliente_ID INT,
    DataPedido DATE,
    FOREIGN KEY (Cliente_ID) REFERENCES Clientes(ID)
);

-- Inserção de dados na tabela Pedidos
INSERT INTO Pedidos (ID, Cliente_ID, DataPedido) VALUES
(1, 1, '2023-08-01'),
(2, 2, '2023-08-03'),
(3, 1, '2023-08-05'),
(4, 3, '2023-08-10'),
(5, 2, '2023-08-15'),
(6, 4, '2023-08-20');

-- Criação da tabela DetalhesDoPedido
CREATE TABLE DetalhesDoPedido (
    ID INT PRIMARY KEY,
    Pedido_ID INT,
    Produto_ID INT,
    Quantidade INT,
    PreçoUnitário DECIMAL(10, 2),
    FOREIGN KEY (Pedido_ID) REFERENCES Pedidos(ID),
    FOREIGN KEY (Produto_ID) REFERENCES Produtos(ID)
);

-- Inserção de dados na tabela DetalhesDoPedido
INSERT INTO DetalhesDoPedido (ID, Pedido_ID, Produto_ID, Quantidade, PreçoUnitário) VALUES
(1, 1, 1, 1, 799.99),
(2, 2, 2, 1, 1299.99),
(3, 3, 1, 2, 799.99),
(4, 4, 3, 3, 19.99),
(5, 5, 4, 2, 39.99),
(6, 6, 6, 5, 3.99);


-- CAPÍTULO 1

-- Exercício 1: Liste os nomes dos clientes e os produtos que eles compraram usando um INNER JOIN.

SELECT Clientes.Nome, Produtos.Nome
FROM Clientes
INNER JOIN Pedidos ON Clientes.ID = Pedidos.Cliente_ID
INNER JOIN DetalhesDoPedido ON Pedidos.ID = DetalhesDoPedido.Pedido_ID
INNER JOIN Produtos ON DetalhesDoPedido.Produto_ID = Produtos.ID;

-- Exercício 2: Liste todos os produtos e, se aplicável, os nomes dos clientes que os compraram. Inclua também produtos que não foram comprados por nenhum cliente.

SELECT Produtos.Nome, Clientes.Nome
FROM Produtos
LEFT JOIN DetalhesDoPedido ON DetalhesDoPedido.Produto_ID = Produtos.ID
LEFT JOIN Pedidos ON DetalhesDoPedido.Pedido_ID = Pedidos.ID 
LEFT JOIN Clientes ON  Pedidos.Cliente_ID = Clientes.ID;

-- Exercício 3: Liste os nomes dos clientes e, se aplicável, os produtos que eles compraram usando um RIGHT JOIN.

SELECT Clientes.Nome,  Produtos.Nome AS PRODUTO
FROM Produtos
RIGHT JOIN DetalhesDoPedido ON DetalhesDoPedido.Produto_ID = Produtos.ID
RIGHT JOIN Pedidos ON DetalhesDoPedido.Pedido_ID = Pedidos.ID 
RIGHT JOIN Clientes ON  Pedidos.Cliente_ID = Clientes.ID;

-- Exercício 4: Liste os nomes dos clientes que fizeram pedidos, juntamente com os nomes dos produtos que eles compraram. Inclua apenas clientes que compraram produtos e exiba os resultados em ordem alfabética pelo nome do cliente.

SELECT Clientes.Nome, Produtos.Nome AS PRODUTO
FROM Clientes
INNER JOIN Pedidos ON Clientes.ID = Pedidos.Cliente_ID
INNER JOIN DetalhesDoPedido ON Pedidos.ID = DetalhesDoPedido.Pedido_ID
INNER JOIN Produtos ON DetalhesDoPedido.Produto_ID = Produtos.ID
ORDER BY Clientes.Nome;

-- Exercício 5: Liste os nomes dos produtos que foram comprados e a quantidade total de cada produto que foi comprada. Ordene os resultados em ordem decrescente pela quantidade total vendida.

SELECT Produtos.Nome, SUM(DetalhesDoPedido.Quantidade) AS QuantidadeTotalVendida
FROM Produtos
INNER JOIN DetalhesDoPedido ON DetalhesDoPedido.Produto_ID = Produtos.ID
GROUP BY Produtos.Nome
ORDER BY QuantidadeTotalVendida DESC;


-- CAPÍTULO 2

-- Exercício 1: Liste o nome do cliente, a cidade onde moram e o total de pedidos feitos por cada cliente. Ordene os resultados em ordem decrescente pelo total de pedidos.

SELECT Clientes.Nome, Clientes.Cidade, COUNT(Pedidos.ID) AS QuantidadeDePedidos 
FROM Clientes
LEFT JOIN Pedidos ON Clientes.ID = Pedidos.Cliente_ID
GROUP BY Clientes.ID
ORDER BY QuantidadeDePedidos DESC;

-- Exercício 2: Liste o nome do produto, a categoria à qual pertence e a quantidade total desse produto vendida (soma de todas as quantidades em todos os pedidos).

SELECT p.Nome, Categorias.Nome AS Categoria, SUM(DetalhesDoPedido.Quantidade) AS QuantidadeDePedidos
FROM Produtos p
INNER JOIN Categorias ON p.Categoria_ID = Categorias.ID
INNER JOIN DetalhesDoPedido ON p.ID = DetalhesDoPedido.Produto_ID
GROUP BY p.Nome
ORDER BY QuantidadeDePedidos DESC;


-- Exercício 3: Liste o nome do cliente, o nome do produto e a quantidade de cada produto que eles compraram. Inclua todos os clientes, mesmo que não tenham feito compras, e ordene os resultados alfabeticamente pelo nome do cliente.

SELECT C.Nome, Produtos.Nome, SUM(DetalhesDoPedido.Quantidade) AS QuantidadeComprada
FROM Clientes C
LEFT JOIN Pedidos ON Pedidos.Cliente_ID = C.ID
LEFT JOIN DetalhesDoPedido ON DetalhesDoPedido.Pedido_ID = Pedidos.ID
LEFT JOIN Produtos ON Produtos.ID = DetalhesDoPedido.Produto_ID
GROUP BY C.nome, Produtos.Nome
ORDER BY C.Nome;

-- Exercício 4: Liste os nomes dos produtos e a quantidade total de cada produto que foi comprada por clientes de uma cidade específica. Escolha uma cidade e exiba os resultados em ordem decrescente pela quantidade total vendida.

SELECT P.Nome, SUM(DetalhesDoPedido.Quantidade) AS Quantidade
FROM Produtos P
LEFT JOIN DetalhesDoPedido ON DetalhesDoPedido.Produto_ID = P.ID
LEFT JOIN Pedidos ON Pedidos.ID = DetalhesDoPedido.ID
LEFT JOIN Clientes ON Pedidos.Cliente_ID = Clientes.ID
WHERE Clientes.Cidade = "Rio de Janeiro"
GROUP BY P.ID
ORDER BY Quantidade DESC;

-- A solução acima cumpre o requisito e mostra os produtos na cidade específica, mas apenas os que de fato foram comprados.
-- Para mostrar até os que não foram comprados, GPT apresentou esta solução (Estudar a fundo depois):

SELECT P.Nome, IFNULL(SUM(DP.Quantidade), 0) AS Quantidade
FROM Produtos P
LEFT JOIN (
    SELECT D.Produto_ID, SUM(D.Quantidade) AS Quantidade
    FROM DetalhesDoPedido D
    INNER JOIN Pedidos PE ON D.Pedido_ID = PE.ID
    INNER JOIN Clientes C ON PE.Cliente_ID = C.ID
    WHERE C.Cidade = 'Rio de Janeiro'
    GROUP BY D.Produto_ID
) AS DP ON P.ID = DP.Produto_ID
GROUP BY P.ID, P.Nome
ORDER BY Quantidade DESC;




-- Exercício 5: Liste os nomes dos clientes que compraram produtos de uma categoria específica. Escolha uma categoria de produto e exiba os resultados em ordem alfabética pelo nome do cliente.

SELECT C.Nome
FROM Clientes C
INNER JOIN Pedidos P ON P.Cliente_ID = C.ID
INNER JOIN DetalhesDoPedido D ON D.Pedido_ID = P.ID
INNER JOIN Produtos PR ON D.Produto_ID = PR.ID
INNER JOIN Categorias ON PR.Categoria_ID = Categorias.ID
WHERE Categorias.Nome = "Roupas";
 



