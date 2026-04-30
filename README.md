# Sistema de Folha de Pagamento em Java

Projeto prático desenvolvido com o objetivo de aplicar conceitos fundamentais da linguagem Java, incluindo estruturas de decisão, repetição, entrada e saída de dados e manipulação de listas.

---

## Objetivo

Desenvolver um sistema simples de folha de pagamento que permita:

* Cadastrar colaboradores
* Armazenar dados em memória utilizando ArrayList
* Calcular o salário final com base no tipo de vínculo
* Interagir com o usuário via terminal (CLI)

---

## Conceitos aplicados

Este projeto utiliza os seguintes conceitos estudados:

* Tipos de dados primitivos e compostos
* Declaração e utilização de variáveis e constantes
* Entrada e saída de dados (Scanner e System.out)
* Estruturas condicionais (if, else if, switch)
* Estruturas de repetição (while, for)
* Estrutura de seleção com menu interativo
* Manipulação de listas dinâmicas com ArrayList
* Organização básica em classes e métodos

---

## Estrutura do projeto

```
.
├── README.md
├── docs/
│   ├── boas-praticas.md
│   └── planejamento.md
└── src/
    └── SistemaFolhaPagamento.java
```

---

## Funcionalidades

O sistema possui um menu interativo com as seguintes opções:

* Cadastrar colaborador
* Listar colaboradores
* Calcular folha de pagamento
* Buscar colaborador
* Encerrar o sistema

---

## Tipos de vínculo suportados

* CLT
* PJ
* Estagiário
* Horista

Cada tipo de vínculo possui uma regra específica de cálculo de salário.

---

## Exemplo de regras de cálculo

* CLT: salário base com aplicação de descontos
* PJ: salário base sem descontos
* Estagiário: bolsa fixa acrescida de auxílio
* Horista: cálculo baseado em horas trabalhadas e valor por hora

---

## Como executar o projeto

### Compilação

```
javac src/SistemaFolhaPagamento.java
```

### Execução

```
java -cp src SistemaFolhaPagamento
```

---

## Documentação adicional

* Planejamento: docs/planejamento.md
* Boas práticas: docs/boas-praticas.md

---

## Melhorias futuras

* Separação do código em múltiplas classes
* Persistência de dados em arquivo ou banco de dados
* Implementação de interface gráfica
* Validação mais robusta dos dados de entrada
* Inclusão de testes automatizados

---

## Autores

Henrique Alves de Almeida
Kayky Silveira Silva

Projeto desenvolvido para fins acadêmicos.

