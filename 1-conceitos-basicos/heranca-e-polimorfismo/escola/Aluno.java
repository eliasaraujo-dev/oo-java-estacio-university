// Classe Aluno que herda de Pessoa
public class Aluno extends Pessoa {
    // Atributos específicos da classe Aluno
    private String matricula;

    // Construtor da classe Aluno
    public Aluno(String nome, Calendar data_nascimento,
             long cpf, Endereco endereco) {
        super (nome, data_nascimento, cpf, endereco);)
    }
}
