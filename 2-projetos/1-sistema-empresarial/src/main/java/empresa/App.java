package empresa;

import empresa.model.*;

public class App {
    public static void main(String[] args) {
        // Criando funcionários
        Gerente gerenteVendas = new Gerente("João Silva", "123.456.789-00", 8000, "Vendas", 1500);
        Vendedor vendedor1 = new Vendedor("Maria Souza", "987.654.321-00", 2500, 100);
        vendedor1.registrarVenda(5000);

        // Criando departamento
        Departamento deptVendas = new Departamento("Vendas", gerenteVendas);
        deptVendas.adicionarFuncionario(vendedor1);

        // Listando funcionários
        deptVendas.listarFuncionarios();
    }
}