# Diagrama de classes UML

## Código Java

```java
public class Retangulo {
    private int altura;
    private int largura;

    public Retangulo(int al, int la){
        this.altura = al;
        this.largura = la;
    }

    public int getArea(){
        int area = al * la;
        return area;
    }
}
```

 ## Diagrama UML (exemplos)


### Exemplo 1

```mermaid
classDiagram
%% variavel: tipo
    class Retangulo {
        -altura: int
        -largura: int
        +Retangulo(al: int, la: int)
        +getArea() int
    }
```

### Exemplo 2

```mermaid
classDiagram

    direction LR

    class Carro {
        -marca: String
        -propulsor: Motor
        +Carro()
        +acelerar(v: int) void
    }

    class Motor {
        -hp: int
        -giroAtual: int
        -cilindros: int
        +Motor()
        +acelerar(v: int) void
    }

    Carro o-- Motor

```