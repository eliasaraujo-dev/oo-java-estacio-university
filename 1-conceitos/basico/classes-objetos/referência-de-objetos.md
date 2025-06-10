// Uso de referência de objetos em Java
```java
class Aluno {
    // Atributos
    private String nome;
    private int idade;

    // Métodos
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public String recuperarNome() {
        return this.nome;
    }
}
// Exemplo
public class Referencia{
    private Aluno a1, a2;
    public Referencia(){
        a1 = new Aluno("Carlos", 28);
        a2 = new Aluno("Ana", 40);
        System.out.println("O nome do aluno a1 é "+a1.recuperarNome());
        System.out.println("O nome do aluno a2 é "+a2.recuperarNome());
        a1 = a2; 
        a2.definirNome("Flávia");
        System.out.println("O nome do aluno a1 é "+a1.recuperarNome());
        manipulaAluno(a1);
        System.out.println("O nome do aluno a1 é "+a1.recuperarNome());
    }
    public void manipulaAluno(Aluno aluno){
        aluno.definirNome("Márcia");
    }
    public static void main(String args[]){
        Referencia r = new Referencia();
        System.out.println("Fim da Execução ");
    }
}