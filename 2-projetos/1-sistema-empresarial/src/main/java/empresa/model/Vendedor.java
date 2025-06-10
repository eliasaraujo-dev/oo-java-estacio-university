package empresa.model;

public class Vendedor extends Funcionario {
    private double comissaoPorVenda;
    private int vendasRealizadas;

    public Vendedor(String nome, String cpf, double salarioBase, double comissaoPorVenda) {
        super(nome, cpf, salarioBase);
        this.comissaoPorVenda = comissaoPorVenda;
        this.vendasRealizadas = 0;
    }

    public void registrarVenda(double valorVenda) {
        vendasRealizadas++;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (vendasRealizadas * comissaoPorVenda);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Vendedor | Vendas: " + vendasRealizadas;
    }
}