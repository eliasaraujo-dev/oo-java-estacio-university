import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
    // Atributos
    private static Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9;
    private static Escola escola;

    // Método main
    public static void main(String args[]) {
        escola = new Escola("Escola Pedro Álvares Cabral", "42.336.174/0006-13");
        criarAlunos();
        matricularAlunos();
        escola.agruparAlunos();
    }

    // Métodos
    private static void criarAlunos() {
        aluno1 = new Aluno("Marco Antônio", "Rio de Janeiro");
        aluno2 = new Aluno("Clara Silva", "Rio de Janeiro");
        aluno3 = new Aluno("Marcos Cintra", "Sorocaba");
        aluno4 = new Aluno("Ana Beatriz", "Barra do Pirai");
        aluno5 = new Aluno("Marcio Gomes", "São Paulo");
        aluno6 = new Aluno("João Carlos", "Sorocaba");
        aluno7 = new Aluno("César Augusto", "São Paulo");
        aluno8 = new Aluno("Alejandra Gomez", "Madri");
        aluno9 = new Aluno("Castelo Branco", "São Paulo");
    }

    private static void matricularAlunos() {
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);
        escola.matricularAluno(aluno4);
        escola.matricularAluno(aluno5);
        escola.matricularAluno(aluno6);
        escola.matricularAluno(aluno7);
        escola.matricularAluno(aluno8);
        escola.matricularAluno(aluno9);
    }
}

class Aluno {
    // Atributos
    private String nome;
    private String naturalidade;

    // Métodos
    public Aluno(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", nome, naturalidade);
    }
}

class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }
}

class Escola {
    // Atributos
    private String nome, CNPJ;
    private List<Departamento> departamentos;
    private List<Aluno> discentes;

    // Métodos
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<>();
        this.discentes = new ArrayList<>();
    }

    public void criarDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento(nomeDepartamento));
    }

    public void fecharDepartamento(String nomeDepartamento) {
        departamentos.remove(departamentos);
    }

    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void agruparAlunos() {
        Map<String, List<Aluno>> agrupamento = new HashMap<>();

        for (Aluno a : discentes) {
            String naturalidade = a.getNaturalidade();

            if (!agrupamento.containsKey(naturalidade)) {
                agrupamento.put(naturalidade, new ArrayList<>());
            }
            agrupamento.get(naturalidade).add(a);
        }

        System.out.println("Resultado do agrupamento por naturalidade:");
        for (Map.Entry<String, List<Aluno>> entry : agrupamento.entrySet()) {
            System.out.println("\nNaturalidade: " + entry.getKey());
            for (Aluno aluno : entry.getValue()) {
                System.out.println("  - " + aluno);
            }
        }
    }
}