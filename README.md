# Desafio DIO: API RESTful com Java e Spring Boot

API RESTful baseada em um aplicativo bancário construída em Java 22 com Spring Boot 3.

[Projeto de Referência](https://github.com/digitalinnovationone/santander-dev-week-2023-api/tree/main)

##

<h3 align=center>Diagrama de Classes (Domínio da API)</h3>

```mermaid
classDiagram
    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
    User : -String name
    User : -Account account
    User : -Feature[] features
    User : -Card card
    User : -News[] news

    class Account{
      -String number
      -String agency
      -Number balance
      -Number limit
    }
    class Feature{
      -String icon
      -String description
    }
    class Card{
      -String number
      -Number limit
    }
       class News{
      -String icon
      -String description
    }
```

##

<h3>💻 Tecnologias</h3>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
