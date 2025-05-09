package empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private Gerente gerente;
    private List<Funcionario> funcionarios;

    public Departamento(String nome, Gerente gerente) {
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("\n=== Departamento: " + nome + " ===");
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("\nFuncionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println("-------------------");
        }
    }
}