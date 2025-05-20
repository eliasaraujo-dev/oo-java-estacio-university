class Escola {
     private String nome;
     private String cnpj;
     private Endereco endereco;
     private DepartamentoEscola[] departamentos;
     private Aluno[] alunos;
     private int totalDepartamentos;
     private int totalAlunos;

     public Escola(String nome, String cnpj) {
          this.nome = nome;
          this.cnpj = cnpj;
          this.departamentos = new DepartamentoEscola[10];
          this.alunos = new Aluno[1000];
          this.totalDepartamentos = 0;
          this.totalAlunos = 0;
     }

     public void criarDepartamento(String nomeDepartamento) {
          if (totalDepartamentos < departamentos.length) {
               departamentos[totalDepartamentos] = new Departamento(nomeDepartamento);
               totalDepartamentos++;
          } else {
               System.out.println("Não é possível criar outro departamento.");
               ;
          }
     }

     public void matricularAluno(Aluno novoAluno) {
          if (totalAlunos < alunos.length) {
               alunos[totalAlunos] = novoAluno;
               totalAlunos++;
          } else {
               System.out.println("Não é possível matricular mais alunos.");
          }
     }
}