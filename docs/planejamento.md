# Planejamento do Sistema de Folha de Pagamento

## 1. Introdução

Este documento tem como objetivo descrever o planejamento do desenvolvimento do sistema de folha de pagamento em Java. O sistema será desenvolvido com foco na aplicação de conceitos fundamentais da linguagem, como estruturas de controle, entrada e saída de dados, manipulação de listas e organização básica de código.

---

## 2. Objetivo do sistema

Desenvolver um sistema simples que permita:

* Cadastrar colaboradores
* Armazenar informações em memória
* Calcular o salário final de acordo com o tipo de vínculo
* Exibir informações de forma interativa via terminal

---

## 3. Escopo do projeto

### Incluído

* Cadastro de colaboradores
* Listagem de colaboradores
* Cálculo de salário
* Menu interativo via terminal
* Uso de ArrayList para armazenamento
* Uso de estruturas condicionais e de repetição

### Não incluído

* Persistência em banco de dados
* Interface gráfica
* Integração com sistemas externos
* Autenticação de usuários

---

## 4. Requisitos do sistema

### Requisitos funcionais

* O sistema deve permitir cadastrar um colaborador
* O sistema deve permitir listar colaboradores cadastrados
* O sistema deve calcular o salário conforme o tipo de vínculo
* O sistema deve permitir interação via menu
* O sistema deve encerrar mediante escolha do usuário

### Requisitos não funcionais

* O sistema deve ser executado via terminal
* O código deve ser organizado e legível
* O sistema deve validar entradas básicas do usuário
* O sistema deve utilizar apenas recursos básicos da linguagem Java

---

## 5. Estrutura de dados

Será utilizada uma lista dinâmica para armazenar os colaboradores:

```java
ArrayList<Colaborador> colaboradores
```

### Classe Colaborador (planejada)

A classe terá os seguintes atributos:

* nome
* cargo
* tipoVinculo
* salarioBase
* horasTrabalhadas
* valorHora

---

## 6. Regras de negócio

O cálculo do salário será baseado no tipo de vínculo:

* CLT: salário base com desconto (exemplo: INSS)
* PJ: salário base sem desconto
* Estagiário: bolsa fixa + auxílio
* Horista: horas trabalhadas × valor da hora

---

## 7. Fluxo do sistema

### Menu principal

```text
1 - Cadastrar colaborador
2 - Listar colaboradores
3 - Calcular folha de pagamento
4 - Buscar colaborador
5 - Sair
```

### Fluxo geral

1. Exibir menu
2. Usuário escolhe uma opção
3. Sistema executa a ação correspondente
4. Retorna ao menu até o usuário escolher sair

---

## 8. Estrutura do código

O sistema será implementado inicialmente em um único arquivo:

```text
SistemaFolhaPagamento.java
```

### Organização interna

* Classe principal com método `main`

* Métodos auxiliares:

  * exibirMenu()
  * cadastrarColaborador()
  * listarColaboradores()
  * calcularSalarioFinal()
  * buscarColaborador()

* Classe auxiliar:

  * Colaborador

---

## 9. Tecnologias utilizadas

* Linguagem: Java
* Entrada de dados: Scanner
* Estrutura de dados: ArrayList
* Execução: Terminal (CLI)

---

## 10. Possíveis melhorias futuras

* Separação em múltiplas classes
* Implementação de persistência de dados
* Interface gráfica (GUI)
* Validações mais robustas
* Uso de orientação a objetos mais avançada
* Implementação de testes automatizados

---

## 11. Considerações finais

Este projeto tem como finalidade consolidar os conhecimentos básicos da linguagem Java por meio da construção de um sistema funcional simples. A estrutura proposta permite evolução futura do sistema, mantendo organização e clareza no código.

