# Sistema Bancário Simples
## Funcionalidades
1. Depositar valor (`depositar(double valor)`)
2. Consultar saldo (`getSaldo()`)

## Como executar
```bash
javac Conta.java
java Conta

---

### 📂 **3. exercicios/lista-1**
#### 📄 `Exercicio1.java`
```java
// Polimorfismo
interface Forma {
    double calcularArea();
}

class Circulo implements Forma {
    double raio;
    public double calcularArea() { 
    return Math.PI * raio * raio; 
    }
}