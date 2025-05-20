import java.util.Random;

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Pessoa
        Pessoa p1 = new Pessoa("Teste A");
        Pessoa p2 = new Pessoa("Teste B");

        // Exibindo os dados das pessoas
        System.out
                .println("[Pessoa 1] Nome: " + p1.getNome() + ", Código Identificador: " + p1.getCodigoIdentificador());
        System.out
                .println("[Pessoa 2] Nome: " + p2.getNome() + ", Código Identificador: " + p2.getCodigoIdentificador());
        System.out.println();

        // Criando escola e atribuindo endereço
        Escola escola = new Escola("Escola Central", "00.000.000/0001-00");
        escola.setEndereco("Rua das Flores", 123);
        escola.showEndereco();

        // Matriculando aluno
        Aluno aluno1 = new Aluno("Carlos", 18);
        escola.matricularAluno(aluno1);
    }
}

// Classe Pessoa
class Pessoa {
    private String nome;
    private double codigo_identificador;
    private Random aleatorio;

    public Pessoa(String nome) {
        aleatorio = new Random();
        this.nome = nome;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public double getCodigoIdentificador() {
        return codigo_identificador;
    }
}

// Classe Aluno (poderia herdar Pessoa, mas aqui está independente)
class Aluno {
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    public Aluno(String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getCodigoIdentificador() {
        return codigo_identificador;
    }
}

// Classe Escola
class Escola {
    private String nome, CNPJ;
    private Endereco endereco;
    private Departamento[] departamentos;
    private Aluno[] discentes;
    private int nr_discentes;
    private int nr_departamentos;

    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno[1000];
        this.nr_discentes = 0;
        this.nr_departamentos = 0;
    }

    public void setEndereco(String rua, int numero) {
        this.endereco = new Endereco(rua, numero);
    }

    public void showEndereco() {
        if (endereco != null) {
            System.out.println("Endereço da escola: " + endereco);
        } else {
            System.out.println("Endereço não definido.");
        }
    }

    public void criarDepartamento(String nomeDepartamento) {
        if (nr_departamentos < 10) {
            departamentos[nr_departamentos] = new Departamento(nomeDepartamento);
            nr_departamentos++;
        } else {
            System.out.println("Número máximo de departamentos atingido.");
        }
    }

    public void matricularAluno(Aluno novoAluno) {
        if (nr_discentes < 1000) {
            discentes[nr_discentes] = novoAluno;
            nr_discentes++;
        } else {
            System.out.println("Número máximo de alunos atingido.");
        }
    }
}

// Classe Endereco
class Endereco {
    private String nome_rua;
    private int numero;

    public Endereco(String nome_rua, int numero) {
        this.nome_rua = nome_rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Rua: " + nome_rua + ", nº " + numero;
    }
}

// Classe Departamento
class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }
}
