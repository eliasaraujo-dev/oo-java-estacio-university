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
 ## Herança e Visibilidade
 As propriedades de POO (encapsulamento, herança e polimorfismo são interindependentes.)

 ### Mecanismos de visibilidade

 Existem 4 níveis de acesso em Java
 - **Default:** visibilidade restrita ao pacote Java.
 - **Privado:** atributos e métodos restritos à classe.
 - **Protegido:** visibilidade restrita ao pacote e as subclasses.
 - **Público:** não há restrição de visibilidade.

### Pacotes em Java
Pacotes organizam unidades lógicas, são mais fáceis de dar manutenção e oferecem mais segurança.
 ```java
 // Exemplo 01
 import java.util.Scanner; // Uso de pacote
 class MyClass {
    public static void main(String[] args) {
        Scanner meuObjeto = new Scanner(System.in);
        System.out.println("Entre com o nome do usuário");

        String nomeUsuario = meuObjeto.nextLine();
        System.out.println("o nome do usuário é: " + nomeUsuario);
    }
 }
// Exemplo 02
package meu_pacote; // Implementar classes dentro de um pacote
class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Esta é uma classe dentro do pacote!");
    }
}
```