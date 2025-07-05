// Lista (permite duplicatas, ordem de inserção)
List<String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("João");

// Conjunto (sem duplicatas)
Set<String> numeros = new HashSet<>();
numeros.add(10);
numeros.add(10); // Ignorado, pois já existe

// Mapaa (chave-valor, sem duplicatas nas chaves)
Map<String, Integer> idades=  new HashMap<>();
idades.put("Carlos", 30);

// Ordenação
Collections.sort(nomes; // Ordem alfabética