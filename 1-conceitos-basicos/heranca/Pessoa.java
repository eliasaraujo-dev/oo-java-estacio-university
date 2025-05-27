public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long cpf;
    private Endereco endereco;

    // Construtor
    public Pessoa(String nome, int idade, Calendar data_nascimento, long cpf, Endereco endereco) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        atualizarIdade(idade);
    }

    protected void atualizarNome(String nome) {...}

    protected String recuperarNome() {...}

    protected void atualizarIdade(int idade) {...}

    protected int recuperarIdade() {...}

    protected void atualizarCPF(long cpf) {...}

    protected long recuperarCPF() {...}

    protected void atualizarEndereco(Endereco endereco) {...}

    protected Endereco recuperarEndereco() {...}

    private int calcularIdade() {...}

}