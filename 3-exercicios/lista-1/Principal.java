import escola.Principal;

public class Principal {
    public int maiorElem(int a, int b) {
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        return maior;
    }

    public int maiorElem(int a, int b, int c) {
        int maior = maiorElem(a, b);
        return maiorElem(maior, c);
    }

    public static void main(String args[]) {
        Principal objMaior = new Principal();
        int x = 10;
        int y = 25;
        int z = 15;
        System.out.println("O maior elemento entre " + x + " e " + y + " é: " + objMaior.maiorElem(x, y));
        System.out.println("O maior elemento entre " + x + ", " + y + " e " + z + " é: " + objMaior.maiorElem(x, y, z));
    }
}