# Exercício de POO — Aluno

## Descrição

Crie uma classe chamada `Aluno` contendo os seguintes atributos:

- `nome`
- `nota1`
- `nota2`

A classe deve possuir dois métodos:

- `media()` — calcula e retorna a média aritmética das notas.
- `resultado()` — retorna uma `String` com o nome do aluno e a palavra **"APROVADO"** ou **"REPROVADO"**, considerando a média mínima de aprovação igual a **6**.

## Representação UML

```text
┌──────────────────────────────┐
│            Aluno             │
├──────────────────────────────┤
│ ~ nome: String               │
│ ~ nota1: Double              │
│ ~ nota2: Double              │
├──────────────────────────────┤
│ + media(): Double            │
│ + resultado(): String        │
└──────────────────────────────┘
```

## Classe Aluno

A classe deve conter os atributos:

```java
String nome;
Double nota1;
Double nota2;
```

### Método `media()`

O método deve calcular a média aritmética das duas notas:

```text
media = (nota1 + nota2) / 2
```

Em Java:

```java
public Double media()
```

### Método `resultado()`

O método deve verificar a média do aluno.

- Se a média for **maior ou igual a 6**, o resultado será **APROVADO**.
- Se a média for **menor que 6**, o resultado será **REPROVADO**.

O método deve retornar uma `String` contendo o nome do aluno e seu resultado.

```java
public String resultado()
```

## Classe Turma

Crie uma classe `Turma` como classe principal (`Principal`), contendo o método:

```java
public static void main(String[] args)
```

Dentro do `main`, o programa deve:

1. Instanciar **dois objetos** da classe `Aluno`.
2. Ler os valores dos atributos dos dois alunos.
3. Testar o método `media()`.
4. Testar o método `resultado()`.
5. Exibir os resultados na tela.

## Modificadores UML

Os símbolos utilizados na UML representam os modificadores de acesso:

| Símbolo | Modificador | Descrição |
|---|---|---|
| `~` | Default | Sem modificador |
| `+` | Public | Público |
| `-` | Private | Privado |
| `#` | Protected | Protegido |

## Objetivo

O exercício tem como objetivo praticar:

- Criação de classes em Java.
- Criação e utilização de objetos.
- Atributos e métodos.
- Cálculo de média.
- Estruturas condicionais.
- Retorno de valores e `String`.
- Entrada de dados.
- Método `main`.
- Representação de classes utilizando UML.
- Modificadores de acesso.
