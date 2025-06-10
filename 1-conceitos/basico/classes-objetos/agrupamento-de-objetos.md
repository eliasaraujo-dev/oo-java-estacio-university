# Agrupamento de objetos em Java

O propósito do agrupamento é permitir que, a partir de objetos, grupos de objetos afins sejam estabelecidos com base em determinado critério.

## Fundamentos

No agrupamento, o estado final desejado é ter objetos agrupados, e cada agrupamento deve ser mapeado para a chave usada como critério.

Buscamos construir uma função que a partir de um universo de objetos de entrada, tenha como saída "n" pares ordenados formados pela chave de particionamento e a lista de objetos agrupados.


### Implementação de agrupamento de objetos

Usaremos "Map", que faz o mapemaneto entre uma chave e um valor.

A estrutura "Map", possui métodos que nos ajudarão, não permite chaves duplicadas.


```java
public class Aluno {
    // Atributos
    private String matricula, nome, naturalidade;
    // Métodos
    public Aluno(String nome, String naturalidade) {
            this.nome = nome;
            this.naturalidade = naturalidade;
    }
        @Override
        public String toString(){
            return String.format("%s(%s)", nome, naturalidade);
        }
}

class Escola{
    //Atributos
    private String nome,CNPJ;   
    private Endereco endereco;
    private List departamentos;
    private List discentes;
    //Métodos
    public Escola(String nome,String CNPJ){
        this.nome=nome;
        this.CNPJ=CNPJ;
        this.departamentos=new ArrayList<Departamento>();
        this.discentes=new ArrayList<Aluno>();
    }
    public void criarDepartamento(String nomeDepartamento){
        departamentos.add(new Departamento(nomeDepartamento));
    }
    public void fecharDepartamento(Departamento departamento){
        departamentos.remove(departamento);
    }
    public void matricularAluno(Aluno novoAluno){
        discentes.add(novoAluno);
    }
    public void trancarMatriculaAluno(Aluno aluno){
        discentes.remove(aluno);
    }
    public void agruparAlunos(){
        Map<String,List<Aluno>> agrupamento=new HashMap<>();
        for (Aluno a: discentes){
            if(!agrupamento.containsKey(a.recuperarNaturalidade())) {
                 agrupamento.put(a.recuperarNaturalidade(),new ArrayList<>());
            }
        agrupamento.get(a.recuperarNaturalidade()).add(a);
        }
    System.out.println ("Resultado do agrupamento por naturalidade: "+agrupamento);
    }
}
