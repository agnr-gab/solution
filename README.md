
## Descrição do Projeto

O projeto consiste em duas partes:

### Web API

O projeto de Web API é um microserviço de carrinho de compras. Ele recebe os produtos e armazena as informações em um banco de dados, registrando o status de vendido ou não. A API permite a adição de produtos, consulta dos itens no carrinho e atualização do status de vendido.

### Comando

O projeto comando realiza a chamada da API de carrinho de compras. Ele  interage com a API, permitindo a adição de produtos ao carrinho, consulta dos itens e atualização do status de vendido.

## Problema do Posto de Gasolina

O método `PostoDeGasolina` recebe um array de carros, onde cada carro possui uma propriedade de tempo de abastecimento e o nome do carro. O método também recebe o parâmetro de quantidade de bombas de gasolina disponíveis. Cada bomba de gasolina está apta para o primeiro carro que chegou e deve abastecer de acordo com o tempo de abastecimento. A bomba permanece bloqueada até que o carro seja atendido e, em seguida, o próximo carro da fila é atendido.

## Exemplo de entrada: 
Array de Entrada de Carros:
       
    Carro1, Tempo abastecimento: 10 segs
    Carro2, Tempo abastecimento: 5 segs
    Carro3, Tempo abastecimento: 1 segs
    Carro4, Tempo abastecimento: 1 segs
    Carro5, Tempo abastecimento: 1 segs

Bombas de Gasolina (3)

## Exemplo de ordem de saída dos carros: 
Array de Saída de Carros:

    
    Carro3, Tempo abastecimento: 1 segs
    Carro4, Tempo abastecimento: 1 segs
    Carro5, Tempo abastecimento: 1 segs
    Carro2, Tempo abastecimento: 5 segs
    Carro1, Tempo abastecimento: 10 segs



## Tecnologias Utilizadas

O projeto utiliza as seguintes tecnologias:

-   Java
-   Spring Framework (Boot e Data: Hibernate/JPA)
-   Maven
- Banco de Dados Relacional (H2)
-   Git

## Como Executar o Projeto

Para executar o projeto, siga as instruções abaixo:

1.  Certifique-se de ter o Java e o Maven instalados em seu sistema.
2.  Faça o clone do repositório do projeto utilizando o comando `git clone https://github.com/agnr-gab/solution.git`.
3.  Acesse o diretório do projeto clonado.
4.  Execute o comando `mvn clean install` para compilar o projeto e baixar as dependências necessárias.
5.  Execute o comando `mvn spring-boot:run` para iniciar a aplicação.
6.  A WEB API estará disponível em `http://localhost:8081`
7. Posto de Gasolina estará disponível em `http://localhost:8080`


## Endpoints Web API (carrinho de compras)

A API possui os seguintes endpoints principais:

-   `GET /produtos`: Retorna a lista de produtos cadastrados.
-   `GET /{id}`: Retorna os detalhes de um produto específico.
-   `GET /vendidos`: Retorna a lista de produtos vendidos.
-   `GET /naovendidos`: Retorna a lista de produtos disponíveis.
-   `POST /produtos`: Cria um novo produto.
-   `PUT /{id}`: Atualiza status do pedido.

## Endpoints Posto de Gasolina
A API possui os seguintes endpoints principais:

-   `POST /posto/abastecer"`: estamos enviando uma requisição POST para `http://localhost:8080/posto/abastecer`, com o payload contendo o array de carros e o parâmetro `quantidadeBombas` A implementação interna do método `abastecerCarros` será responsável por lidar com o array de carros e retornar a ordem de saída desejada com base no tempo de abastecimento.


