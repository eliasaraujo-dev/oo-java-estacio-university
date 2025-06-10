public void agruparAlunos(int a) {
    Map<String, Set<Aluno>>agrupamento =
    discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade,
            Collectors.toSet()));
            System.out.println("Resultado do agrupamento por naturalidade: ");
            agrupamento.forEach((String chave, Set<Aluno>conjunto) ->
            System.out.println(chave+" = "+conjunto));)))
}