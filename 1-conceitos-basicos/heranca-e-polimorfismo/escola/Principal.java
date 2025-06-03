package escola;
public class Principal {
    // Atributos
    private static Empregado empregado, diretor;

    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        empregado = new Empregado("Clara Silva", data, 211456937, null);
        empregado.gerarMatricula();
        diretor = new Diretor("Marco Antônio", data, 90156498, null);
        diretor.gerarMatricula();
        System.out.println("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println("A matrícula do Empregado é: " + empregado.recuperarMatricula());
    }
}