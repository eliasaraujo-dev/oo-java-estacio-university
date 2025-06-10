// Definição da classe Escola
class Escola {

    // Atributos privados da classe Escola

    // Nome da escola
    private String nome;

    // CNPJ da escola (identificador fiscal no Brasil)
    private String CNPJ;

    // Endereço da escola (pressupõe existência da classe Endereco)
    private Endereco endereco;

    // Vetor que armazenará até 10 departamentos da escola
    private Departamento departamentos[];

    // Vetor que armazenará até 1000 alunos da escola
    private Aluno discentes[];

    // Quantidade atual de alunos matriculados
    private int nr_discentes;

    // Quantidade atual de departamentos criados
    private int nr_departamentos;

    // Construtor da classe Escola
    public Escola(String nome, String CNPJ) {
        this.nome = nome;                     // Define o nome da escola
        this.CNPJ = CNPJ;                     // Define o CNPJ da escola
        this.departamentos = new Departamento[10];  // Cria vetor com espaço para 10 departamentos
        this.discentes = new Aluno[1000];            // Cria vetor com espaço para 1000 alunos
        this.nr_departamentos = 0;            // Inicializa número de departamentos com 0
        this.nr_discentes = 0;                // Inicializa número de discentes com 0
    }

    // Método para criar um novo departamento na escola
    public void criarDepartamento(String nomeDepartamento) {
        // Verifica se ainda há espaço no vetor de departamentos
        if (nr_departamentos < 10) {
            // Cria um novo departamento e o adiciona ao vetor
            departamentos[nr_departamentos] = new Departamento(nomeDepartamento);
            // Incrementa o contador de departamentos
            nr_departamentos++;
        } else {
            // Se o limite foi atingido, exibe mensagem
            System.out.println("Nao e possivel criar outro Departamento.");
        }
    }

    // Método para matricular um aluno na escola
    public void matricularAluno(Aluno novoAluno) {
        // Adiciona o aluno no vetor de discentes (alunos)
        discentes[nr_discentes] = novoAluno;
        // Incrementa o contador de alunos matriculados
        nr_discentes++;
    }
}
