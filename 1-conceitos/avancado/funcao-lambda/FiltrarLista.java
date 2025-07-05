List<String> nomes = Array.asList("Ana", "João", "Maria");
List<String> resultado = nomes.stream()
        .filter(nome -> nome.startsWith("A")) // Lambda como Predicate
        .collect(Collectors.toList()); // Coleta em uma nova lista)
// Resultado: ["Ana"]