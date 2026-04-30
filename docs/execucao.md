# Execução do Projeto

Este projeto foi desenvolvido em Java, uma linguagem multiplataforma. Isso significa que o código pode ser executado em diferentes sistemas operacionais, como Windows, Linux e macOS, desde que o Java esteja instalado corretamente.

---

## Pré-requisitos

Para compilar e executar o projeto, é necessário instalar o JDK (Java Development Kit).

O JDK inclui as principais ferramentas necessárias para trabalhar com Java:

* `javac`: compilador Java, responsável por transformar arquivos `.java` em arquivos `.class`
* `java`: comando responsável por executar o programa compilado

---

## Verificando a instalação do Java

Após instalar o JDK, é possível verificar se o Java está disponível no terminal com os comandos:

```bash
java -version
```

```bash
javac -version
```

Caso os comandos retornem a versão instalada, o ambiente está pronto para compilar e executar o projeto.

---

## Compilação

A partir da raiz do projeto, execute:

```bash
javac src/SistemaFolhaPagamento.java
```

Esse comando compila o arquivo Java localizado dentro da pasta `src`.

Após a compilação, será gerado um arquivo `.class`, que representa o código compilado e pronto para ser executado pela JVM.

---

## Execução

Após compilar o projeto, execute:

```bash
java -cp src SistemaFolhaPagamento
```

O parâmetro `-cp` significa `classpath` e informa ao Java onde procurar os arquivos compilados.

Neste caso, o Java irá procurar a classe `SistemaFolhaPagamento` dentro da pasta `src`.

---

## Entrada de dados

Durante a execução, o sistema poderá solicitar informações pelo terminal, como:

* Nome do colaborador
* Cargo
* Tipo de vínculo
* Salário base
* Horas trabalhadas
* Valor da hora

Os dados devem ser informados conforme as instruções exibidas pelo menu interativo.

---

## Fluxo básico de execução

```text
1. Instalar o JDK
2. Verificar a instalação com java -version e javac -version
3. Compilar o projeto com javac
4. Executar o projeto com java
5. Informar os dados solicitados pelo sistema
```

---

## Observação

O sistema não utiliza banco de dados nesta etapa. As informações cadastradas ficam armazenadas apenas durante a execução do programa. Ao encerrar o sistema, os dados são perdidos.

