# Encapsulamento
## Conceito
- Ocultação dos dados internos (private)
- Controle de acesso via métodos públicos (getters/setters)

## Exemplo prático
```java
ContaBancaria conta = new ContaBancaria();
conta.depositar(1000);
System.out.println(conta.getSaldo());