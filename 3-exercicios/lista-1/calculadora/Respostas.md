
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
    public double calcularArea() { return Math.PI * raio * raio; }
}
```
## Resposta do Exercício 1
**Questão:** Implemente polimorfismo com `Circulo` e `Quadrado`.  
**Solução:**  
- Criei a interface `Forma` com o método `calcularArea()`.
- Classes implementam a interface de formas diferentes.