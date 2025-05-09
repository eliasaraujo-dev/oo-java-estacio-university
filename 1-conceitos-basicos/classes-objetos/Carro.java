//Exemplo: Classe simples e instância de objeto
public class Carro {
    // Atributos
    String modelo;
    int ano;

    // Método construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos
    public void acelerar() {
        System.out.println(modelo + " está acelerando!");
    }

    // Uso
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", 1970);
        meuCarro.acelerar(); // Saída: "Fusca está acelerando!"")
    }
}