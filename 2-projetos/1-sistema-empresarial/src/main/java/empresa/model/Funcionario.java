package empresa.model;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " (CPF: " + cpf + ")";
    }
}