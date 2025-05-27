public class Principal {
    // Atributos da classe Principal
    private static Aluno aluno;
    private static Endereco endereco;

    // Método main para executar o programa
    public static void main(String[] args) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco();
        endereco.definirPais("Brasil");
        endereco.definirUF("RJ");
        endereco.definirCIdade("Rio de Janeiro");
        endereco.definirRua("Rua da Programação");
        endereco.definirNumero(123);
        endereco.definirCEP(20040900);
        endereco.definirComplemento("Apto 777");
        aluno = new Aluno("Elias Araujo", data, 12345678901L, endereco);
        aluno.atualizarIdade();
        idade = aluno.recuperarIdade();
    }
}
