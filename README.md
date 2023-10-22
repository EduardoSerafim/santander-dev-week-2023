# santander-dev-week-2023
Java RESTful API criada na Santander Dev Week, e no Santander Bootmcamp Java Fullstack da DIO

## Diagrama de classes

```mermaid
classDiagram
  class User {
    +name: string
    +account: Account
    +features: Feature[]
    +card: Card
    +news: News[]
  }

  class Account {
    +number: string
    +agency: string
    +balance: float
    +limit: float
  }

  class Feature {
    +icon: string
    +description: string
  }

  class Card {
    +number: string
    +limit: float
  }

  class News {
    +icon: string
    +description: string
  }

  User --> Account
  User --> Feature
  User --> Card
  User --> News
```
