```markdown
# 🧩 Design Patterns em Java

*Padrões de projeto implementados em Java com exemplos práticos*

---

## 📌 Índice
1. [Padrões Criacionais](#-padrões-criacionais)
2. [Padrões Estruturais](#-padrões-estruturais)
3. [Padrões Comportamentais](#-padrões-comportamentais)

---

## 🏗️ Padrões Criacionais

### Singleton
**Problema:** Garantir uma única instância de classe  
**Solução:**

```java
public class Configuracao {
    private static Configuracao instancia;
    
    private Configuracao() {}
    
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
}
```

**Uso:**
```java
Configuracao config = Configuracao.getInstancia();
```

---

### Factory Method
**Problema:** Criar objetos sem especificar classes concretas  
**Diagrama:**
```
Creator → FactoryMethod() → Product
```

**Implementação:**
```java
public interface Documento {
    void abrir();
}

public class Pdf implements Documento {
    public void abrir() {
        System.out.println("Abrindo PDF...");
    }
}

public class CriadorDocumento {
    public Documento criarDocumento(String tipo) {
        if (tipo.equals("pdf")) {
            return new Pdf();
        }
        throw new IllegalArgumentException("Formato inválido");
    }
}
```

---

## 🧱 Padrões Estruturais

### Adapter
**Problema:** Interface incompatível  
**Exemplo:**

```java
public class TomadaEuropeia {
    public void conectar() {
        System.out.println("Conectado na tomada europeia");
    }
}

public class Adaptador extends TomadaEuropeia {
    public void conectarBrasileiro() {
        super.conectar();
        System.out.println("-> Adaptado para padrão brasileiro");
    }
}
```

---

## 🤹 Padrões Comportamentais

### Observer
**Problema:** Notificar múltiplos objetos sobre mudanças  

```java
public interface Observador {
    void atualizar(String mensagem);
}

public class SistemaNotificacao {
    private List<Observador> observadores = new ArrayList<>();
    
    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }
    
    public void notificar(String msg) {
        for (Observador o : observadores) {
            o.atualizar(msg);
        }
    }
}
```

---

## 📚 Recursos Adicionais
- [Refactoring Guru](https://refactoring.guru/design-patterns/java)
- `Padrões de Projeto: Soluções Reutilizáveis` (Livro GoF)

*Última atualização: {{05/09/2025}}*
```

### 💡 Dicas:
1. Use diagramas UML para complementar
2. Adicione exemplos reais de aplicação
3. Mantenha os exemplos autocontidos (copie e execute)