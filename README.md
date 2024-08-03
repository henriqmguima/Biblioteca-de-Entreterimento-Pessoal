# Biblioteca de Entretenimento Pessoal
## Descrição
Este projeto é uma aplicação em Java para gerenciar uma biblioteca de filmes e séries, com foco no registro de visualizações e características dos conteúdos. O sistema permite ao usuário listar, visualizar detalhes e marcar itens como assistidos. O tema foi delimitado para filmes e séries da `MARVEL`.

## Estrutura do Projeto
### Classes Principais
**Entretenimento** : Classe abstrata que representa os itens da biblioteca, compartilhando atributos comuns como título, sinopse, nota IMDB e porcentagem do Rotten Tomatoes.
**Filme**: Classe que estende Entretenimento, representando filmes e implementando a interface Assistivel.
**Serie**: Classe que estende Entretenimento, representando séries e também implementando a interface Assistivel.
**BibliotecaDeEntretenimento**: Classe que contém coleções de filmes e séries, além de métodos para listar, adicionar e manipular itens assistidos.
**BibliotecaApp**: Classe principal que controla a interação do usuário, apresentando um menu no terminal.
**Assistivel**: Interface que define os métodos que as classes Filme e Serie devem implementar.

### Funcionalidades
**Listar filmes e séries**: O usuário pode ver uma lista de filmes ou séries disponíveis na biblioteca.
Detalhes dos conteúdos: Ao selecionar um item, o usuário pode ver detalhes como sinopse, nota IMDB e porcentagem do Rotten Tomatoes.
**Marcar como assistido**: O usuário pode marcar um filme ou série como assistido, registrando na lista de itens assistidos.
**Listar itens assistidos**: O usuário pode visualizar todos os conteúdos que já assistiu.

## Conceitos de Programação Orientada a Objetos Aplicados
### Encapsulamento
Os atributos das classes são privados e acessados por métodos públicos, garantindo que o acesso a dados sensíveis seja controlado.

### Herança
As classes Filme e Serie herdam características da classe abstrata Entretenimento, permitindo uma estrutura organizada e reutilização de código.

### Polimorfismo
Métodos das interfaces são implementados de forma diferente em cada subclasse, permitindo que objetos de diferentes classes sejam tratados de forma uniforme.

### Classes Abstratas e Interfaces
Entretenimento é uma classe abstrata que representa um conceito genérico, enquanto Assistivel define um contrato que as classes devem seguir.

### Coleções
As listas de filmes e séries são armazenadas em coleções do tipo ArrayList, facilitando a manipulação e acesso a esses dados.

## Como Executar o Projeto
1. Clone o repositório.
2. Compile as classes.
3. Execute a classe BibliotecaApp.

## Conclusão
Este projeto é uma aplicação prática dos conceitos de programação orientada a objetos em Java, demonstrando a construção de uma aplicação funcional e organizada.


