# Exercícios de POO

## Exercício

Crie uma classe `Funcionario` para representar um funcionário com
atributos para armazenar:

-   `nome`
-   `horasTrabalhadas`
-   `valorDaHora`

A classe deve possuir um método `salarioFinal()` para calcular o salário
do trabalhador, considerando um **desconto de previdência de 11%**.

Também deve ser criada uma classe `Empresa` com um método `main` que:

1.  Instancie três funcionários.
2.  Leia os valores dos atributos de cada funcionário.
3.  Calcule o salário final de cada funcionário.
4.  Mostre os nomes e salários dos funcionários.

## Representação UML

A classe `Funcionario` deve ser representada em UML da seguinte forma:

``` text
┌─────────────────────────────┐
│        Funcionario          │
├─────────────────────────────┤
│ ~ nome: String              │
│ ~ horasTrabalhadas: Double  │
│ ~ valorDaHora: Double       │
├─────────────────────────────┤
│ + salarioFinal(): Double    │
└─────────────────────────────┘
```

### Elementos da classe

**Nome da classe:** `Funcionario`

**Atributos:**

-   `~ nome: String`
-   `~ horasTrabalhadas: Double`
-   `~ valorDaHora: Double`

**Método:**

-   `+ salarioFinal(): Double`

## Modificadores UML

Os símbolos utilizados na UML representam os modificadores de acesso:

  Símbolo   Modificador   Descrição
  --------- ------------- -----------------
  `~`       Default       Sem modificador
  `+`       Public        Público
  `-`       Private       Privado
  `#`       Protected     Protegido

## Classes esperadas

### Funcionario

Deve conter os atributos:

``` java
String nome;
Double horasTrabalhadas;
Double valorDaHora;
```

E o método:

``` java
public Double salarioFinal()
```

O método deve calcular o salário considerando o desconto de **11% de
previdência**.

### Empresa

Deve conter o método:

``` java
public static void main(String[] args)
```

Dentro do `main`, devem ser criados **três objetos da classe
`Funcionario`**, seus dados devem ser lidos e, ao final, devem ser
exibidos seus nomes e salários.

## Objetivo

O exercício tem como objetivo praticar:

-   Criação de classes em Java.
-   Criação e utilização de objetos.
-   Atributos e métodos.
-   Método `main`.
-   Entrada de dados.
-   Cálculos utilizando atributos de objetos.
-   Representação de classes utilizando UML.
-   Modificadores de acesso.
