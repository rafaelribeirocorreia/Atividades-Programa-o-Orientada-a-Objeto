# Exercício de POO — Paciente

## Descrição

Crie uma classe `Paciente` para representar um paciente de uma clínica, com atributos para armazenar:

- `nome`
- `sexo`
- `peso`
- `altura`

A classe deve possuir um método `calcularIMC()` para calcular o Índice de Massa Corporal (IMC) do paciente.

**Fórmula:**

```text
IMC = peso / altura²
```

## Representação UML

```text
┌─────────────────────────────┐
│          Paciente           │
├─────────────────────────────┤
│ ~ nome: String              │
│ ~ sexo: String              │
│ ~ peso: Double              │
│ ~ altura: Double             │
├─────────────────────────────┤
│ + calcularIMC(): Double     │
└─────────────────────────────┘
```

## Classe Paciente

A classe deve conter os seguintes atributos:

```java
String nome;
String sexo;
Double peso;
Double altura;
```

E o método:

```java
public Double calcularIMC()
```

O método deve retornar o IMC calculado utilizando a fórmula:

```text
IMC = peso / (altura * altura)
```

## Classe Clinica

Crie uma classe `Clinica` com o método:

```java
public static void main(String[] args)
```

Dentro do `main`, o programa deve:

1. Instanciar **dois pacientes**.
2. Ler os valores dos atributos de cada paciente.
3. Calcular o IMC de cada paciente.
4. Mostrar os **nomes, sexos e IMCs** dos pacientes.

## Modificadores UML

Os sinais utilizados na UML representam os modificadores:

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
- Método `main`.
- Entrada de dados.
- Cálculo do IMC.
- Representação de classes utilizando UML.
- Modificadores de acesso.
