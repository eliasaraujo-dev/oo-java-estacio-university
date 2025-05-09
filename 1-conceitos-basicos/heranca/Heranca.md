# Herança em Java
## Conceito
- Permite que uma classe (**subclasse**) herde atributos e métodos de outra (**superclasse**).
- Usa a palavra-chave `extends`.

## Exemplo
```java
class Animal {
    void comer() { System.out.println("Animal comendo..."); }
}

class Cachorro extends Animal {
    void latir() { System.out.println("Au au!"); }
}
```

```mermaid
classDiagram
    class Pessoa {
        -nome: String
        -idade: int
        +getNome() String
        +getIdade() int
    }

    class Aluno {
        -matricula: String
        +getMatricula() String
    }

    class Livro {
        -titulo: String
        -autor: String
        +getTitulo() String
    }

    class Empréstimo {
        -dataEmprestimo: Date
        -dataDevolucao: Date
        +calcularAtraso() int
    }

    Pessoa <|-- Aluno : Herança
    Aluno "1" -- "0..*" Empréstimo : Associação
    Livro "1" -- "0..*" Empréstimo : Associação