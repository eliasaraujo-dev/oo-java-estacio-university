package empresa.model;

public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonus) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Gerente | Departamento: " + departamento;
    }
}