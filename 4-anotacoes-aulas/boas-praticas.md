```markdown
# 📚 Repositório de POO em Java - Estácio

Estrutura completa para estudos de Programação Orientada a Objetos com Java.

## ✅ Boas Práticas Implementadas

### 📛 Nomenclatura Consistente
- **Classes**: `PascalCase` (ex: `ContaBancaria`)
- **Métodos**: `camelCase` (ex: `calcularSaldo()`)
- **Arquivos**: Nomes idênticos às classes públicas

### 🗂 Organização por Temas
```plaintext
poo-java-estacio/
├── 1-conceitos-basicos/
│   ├── classes-objetos/
│   ├── encapsulamento/
│   └── heranca/
├── 2-projetos/
│   ├── sistema-bancario/
│   └── agenda-contatos/
├── 3-exercicios/
└── 4-anotacoes/
```

### 📚 Documentação Completa
Cada pasta contém:
- `README.md` com explicações teóricas
- Exemplos executáveis com comentários:
```java
// Exemplo de encapsulamento
public class Conta {
    private double saldo;
    
    public void depositar(double valor) {
        if(valor > 0) {  // Validação
            saldo += valor;
        }
    }
}
```

## 🚀 Próximos Passos

### 📌 Adicionar Exemplos
- `Classes abstratas` (ex: `Funcionario`)
- `Interfaces funcionais` (ex: `Comparador`)
- `Tratamento de exceções customizadas`

### 🔧 Implementar
[![Diagrama UML de Implementação](https://drive.google.com/file/d/1UmYlL0sm-DTLDSMBzOE05GDLvYXcTIYv/view?usp=sharing)](https://drive.google.com/file/d/1UmYlL0sm-DTLDSMBzOE05GDLvYXcTIYv/view?usp=sharing)

*(Clique na imagem para ver em alta resolução)*

### 🔍 Expandir Para
| Área               | Tecnologias              | Exemplo                |
|--------------------|--------------------------|------------------------|
| Padrões de Projeto | Singleton, Factory       | `Database.getInstance()`|
| Princípios SOLID   | SRP, Liskov              | `interface Forma`      |
| Java Collections   | Stream API               | `list.stream().filter()`|

---

## 📦 Estrutura Detalhada dos Arquivos

### 1. Projeto Sistema Bancário
```
sistema-bancario/
├── Main.java            # Ponto de entrada
├── Conta.java           # Classe base (abstrata)
├── ContaCorrente.java   # Implementação
├── Cliente.java         # Composição
└── README.md            # Documentação
```

### 2. Como Contribuir
1. Clone o repositório
2. Adicione novos exemplos na pasta correspondente
3. Atualize a documentação
4. Envie um Pull Request

```bash
git clone https://github.com/seu-usuario/poo-java-estacio.git
```

**Próximos tópicos a desenvolver:**
- [ ] Padrão Observer
- [ ] Generics em Java
- [ ] Lambda Expressions
```