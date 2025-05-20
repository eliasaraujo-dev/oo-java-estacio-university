# Tipos de relações entre objetos

## Associação
**Associação** é um relacionamento **fracamente acoplado** entre objetos, onde um objeto **usa** outro, mas **sem dependência** de ciclo de vida. Pode ser **unidirecional** ou **bidirecional**.
**Ex: Professor (Professor) e Disciplina (Disciplina)**
- Um **professor** pode **ministrar** uma **Disciplina**, mas:
    - Se o **Professor** deixar de existir, a **Disciplina** pode continuar (outro professor pode assumir).
    - Se a **Disciplina** for removida, o **Professor** ainda existe.

## Agregação
**Agregação** é definido como relação **todo-parte** onde o objeto-pai **contém** objetos-filhos, mas os filhos **têm o ciclo de vida independente**.
- **Características:**
    - Se o objeto-pai for destruído, os filhos **continuam existindo**.
    - Representa um relacionamento **mais forte** que a associação, mas ainda **não dependente**.
- **Ex:**
    - **Escola** e **Alunos** => Se a escola fechar, os alunos ainda existem.

## Composição 
**Composição** é a relação **todo-parte** onde o objeto-pai **controla o ciclo de vida** dos objetos-filhos.
- **Características:**
    - Se o objeto-pai for destruído, os filhos **também são destruídos**.
    - Representa o **mais forte acoplamento** entre as relações.
- **Ex:**
    - **Casa** e **Cômodos** => Se a casa for demolida, os cômodos deixam de existir.

```java
class Escola {
    //Atributos
    private String nome, cpnj;
    private Endereco endereco; // Associação
    private Departamento departamentos [];//Composição
    private Aluno discentes [];
    private int nr_discentes, nr_departamentos;
    //Métodos
    public Escola(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno[1000];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }
    public void criarDepartamento(String nomeDepartamento){
        if(nr_departamento <= 10)
        {
            departamento[nr_departamentos] = new Departamento(nomeDepartamento);
            nr_departamento++;
        } else {
            System.out.println( "Não é possível criar outro Departamento" )
        }
        public void matricularAluno(Aluno novoAluno){
            discentes[nr_discentes] = novoAluno;
        }
    }
}


```