Em Java uma função lambda é uma implementação concisa de uma interface funcional (uma interface com apenas um método abstrato). Ela permite escrever código mais limpo e expressivo, especialmente útil para operações como callbacks, filtros em coleções e processamento com Streams.

## Sintaxe básica

```java
(parametros) -> { corpo }
```
- (parametros): Lista de parâmetros (parênteses opcionais se houver apenas 1 parâmetro).
- ->: Operador lambda.
- { corpo }: Bloco de código (chaves opcionais se o corpo for uma única expressão).

Como Escrever: 

1. Sem parâmetros:
```java
() -> System.out.println("Olá, Mundo!");
```
Exemplo Completo
```java
Runnable run = () -> System.out.println("Olá, Mundo!");
run.run(); // Imprime "Olá, Mundo!"
```

2. Com um parâmetro (parênteses opcionais)
```java
s -> System.out.println(s)
```

Exemplo completo:
```java
Consumer<String> print = s -> System.out.println(s);
print.accept("Java"); // Imprime "Java"
```

Com múltiplos parâmetros:
```java
(a, b) -> a + b
```
Exemplo completo:
```java
BinaryOperator<Integer> soma = (a, b) -> a + b;
System.out.println(soma.apply(5, 3)); // Resultado: 8
```
4. Com corpo entre chaves (múltiplas instruções):
```java
(nome, idade) -> {
    String msg = "Nome: " + nome + ", Idade: " + idade;
    return msg;
}
```
Exemplo completo:
```java
BiFunction<String, Integer, String> info = (nome, idade) -> {
    return "Nome: " + nome + ", Idade" + idade;
};
System.out.println(info.apply("Ana", 30)); // Saída: Nome: Ana, Idade: 30
```
## Regras Importantes
1. Inferência de Tipos:
    - O compilador infere os tipos dos parâmetros automaticamente:
```java
Function<Integer, String> converter = num -> String.valueOf(num); // num é Integer
```
2. **return** explícito:
    - Se o corpo tem mais de uma linha, use **return** e chaves **{}**.
3. Variáveis Locais:
    - Lambdas podem acessar variáveis locais **final** ou efetivamente finais:

```java
int x = 10;
Function<Integer, Integer> Multiplicador = n -> n * x; // x é efetivamente final
```

Exemplos Práticos:

Filtrar uma lista com Stream:
```java
List<String> nomes = Arrays.asList("Ana", "João", "Maria");
List<String> resultado = nomes.stream()
    .filter(nome -> nome.startsWith("A")) 
    // Lambda como Predicate
    .collect(Collectors.toList());
    // Resultado: ["Ana"]
```

Ordenação:
```java
List<Integer> numeros = Arrays.asList(5, 3, 8);
numeros.sort((a, b) -> a.compareTo(b));
// Ordena: [3, 5, 8]
```

## Interfaces Funcionais Comuns:

| Interface           | Método              | Uso da Lambda         |
|---------------------|---------------------|------------------------|
| Runnable            | run()               | `() -> {...}`         |
| Consumer<T>         | accept(T t)         | `(t) -> {...}`        |
| Function<T, R>      | apply(T t)          | `(t) -> { return ... }` |
| Predicate<T>        | test(T t)           | `(t) -> true/false`   |
| Supplier<T>         | get()               | `() -> { return ... }` |
| BinaryOperator<T>   | apply(T a, T b)     | `(a, b) -> ...`       |

Vantagens:
- Código mais curto que classes anônimas.
- Legibilidade em operações funcionas (Ex.: Streams).
- Flexibilidade para implementar comportamentos "on-the-fly".

📌 Nota: Lambdas foram introduzidas no Java 8. Use-as sempre que uma interface funcional for esperada!