# Boas Práticas do Projeto

Este documento apresenta boas práticas adotadas no desenvolvimento do projeto Sistema de Folha de Pagamento em Java.

---

## Boas práticas de commit

Este projeto utiliza como referência o padrão Conventional Commits, que propõe uma estrutura padronizada para mensagens de commit, facilitando a leitura do histórico e a identificação do tipo de alteração realizada.

Referência oficial: https://www.conventionalcommits.org/en/v1.0.0/

---

## Estrutura recomendada de commit

```bash
<tipo>: <descrição>
```

Exemplo:

```bash
feat: adiciona cadastro de colaboradores
```

Também é possível utilizar escopo:

```bash
<tipo>(<escopo>): <descrição>
```

Exemplo:

```bash
fix(menu): corrige validação da opção de saída
```

---

## Tipos de commit

### feat

Utilizado quando uma nova funcionalidade é adicionada ao projeto.

```bash
feat: adiciona cálculo de salário para colaborador CLT
```

### fix

Utilizado para correção de erros.

```bash
fix: corrige cálculo de salário para horistas
```

### docs

Utilizado para alterações na documentação.

```bash
docs: atualiza instruções de execução no README
```

### refactor

Utilizado para reorganização ou melhoria do código sem alterar seu comportamento.

```bash
refactor: separa lógica de cadastro em método próprio
```

### style

Utilizado para ajustes de formatação, espaçamento ou organização visual do código.

```bash
style: ajusta indentação do menu principal
```

### chore

Utilizado para tarefas de manutenção que não alteram diretamente a lógica do sistema.

```bash
chore: organiza estrutura de diretórios do projeto
```

---

## Recomendações para commits

* Escrever mensagens curtas e objetivas.
* Usar verbos no presente.
* Fazer commits pequenos e relacionados a uma única alteração.
* Evitar commits genéricos como `update`, `ajustes` ou `mudanças`.
* Preferir mensagens que expliquem claramente o que foi alterado.
* Revisar o código antes de realizar o commit.

---

## Exemplos adequados

```bash
feat: adiciona menu interativo
fix: corrige validação de entrada numérica
docs: adiciona documentação de boas práticas
refactor: melhora organização dos métodos
style: padroniza espaçamento do código
chore: remove arquivos não utilizados
```

---

## Exemplos inadequados

```bash
update
teste
arrumei
alterações
commit final
```

---

## Boas práticas de código

As boas práticas de código têm como objetivo tornar o programa mais legível, organizado e fácil de manter.

---

## Nomenclatura clara

Utilizar nomes descritivos para variáveis, métodos, classes e arquivos.

Exemplo adequado:

```java
double salarioBase;
double salarioFinal;
int tipoVinculo;
```

Exemplo inadequado:

```java
double x;
double y;
int t;
```

---

## Convenções de nomenclatura

A nomenclatura deve seguir padrões comuns da linguagem Java para facilitar a leitura, manutenção e organização do projeto.

---

### Classes

Classes devem utilizar o padrão **PascalCase**, ou seja, cada palavra começa com letra maiúscula.

Exemplos adequados:

```java
SistemaFolhaPagamento
Colaborador
CalculadoraSalario
```

Exemplos inadequados:

```java
sistemaFolhaPagamento
colaborador
calculadora_salario
```

---

### Métodos

Métodos devem utilizar o padrão **camelCase**, começando com letra minúscula e usando letra maiúscula no início das próximas palavras.

Exemplos adequados:

```java
cadastrarColaborador()
listarColaboradores()
calcularSalarioFinal()
exibirMenu()
```

Exemplos inadequados:

```java
CadastrarColaborador()
listar_colaboradores()
calcularsalariofinal()
```

---

### Variáveis

Variáveis também devem utilizar **camelCase** e possuir nomes claros.

Exemplos adequados:

```java
String nomeColaborador;
double salarioBase;
double salarioFinal;
int tipoVinculo;
```

Exemplos inadequados:

```java
String n;
double sb;
double salario_final;
int tipo;
```

---

### Constantes

Constantes devem utilizar letras maiúsculas com palavras separadas por underline.

Exemplos adequados:

```java
static final double DESCONTO_INSS = 0.08;
static final double AUXILIO_ESTAGIARIO = 200.00;
static final int OPCAO_SAIR = 5;
```

Exemplos inadequados:

```java
static final double descontoInss = 0.08;
static final double AuxilioEstagiario = 200.00;
```

---

### Arquivos Java

O nome do arquivo deve ser igual ao nome da classe pública principal.

Exemplo adequado:

```text
SistemaFolhaPagamento.java
```

Classe correspondente:

```java
public class SistemaFolhaPagamento {
}
```

---

### Pastas e diretórios

Pastas devem utilizar nomes simples, em letras minúsculas e, preferencialmente, sem espaços.

Exemplos adequados:

```text
src/
docs/
```

Exemplos inadequados:

```text
Source Code/
Documentos Do Projeto/
```

---

### Pacotes Java

Caso o projeto utilize pacotes futuramente, recomenda-se utilizar letras minúsculas.

Exemplo:

```java
package br.com.projeto.folha;
```

---

### Recomendações gerais de nomenclatura

* Utilizar nomes claros e descritivos.
* Evitar abreviações desnecessárias.
* Manter o idioma consistente no projeto.
* Não misturar português e inglês no mesmo padrão de nomes.
* Nomear métodos com verbos, pois representam ações.
* Nomear classes com substantivos, pois representam entidades ou conceitos.
* Evitar nomes genéricos como `dados`, `valor`, `teste`, `obj` ou `temp`, exceto em casos muito simples.

---

## Organização em métodos

Evitar concentrar toda a lógica dentro do método `main`.

Exemplo de organização recomendada:

```java
static void exibirMenu() {
    System.out.println("1 - Cadastrar colaborador");
    System.out.println("2 - Listar colaboradores");
    System.out.println("3 - Calcular folha de pagamento");
    System.out.println("4 - Sair");
}
```

---

## Uso de constantes

Valores fixos devem ser armazenados em constantes, evitando números soltos no código.

Exemplo:

```java
static final double DESCONTO_INSS = 0.08;
static final double AUXILIO_ESTAGIARIO = 200.00;
```

---

## Validação de entrada

Sempre que possível, validar os dados informados pelo usuário.

Exemplo:

```java
if (salarioBase <= 0) {
    System.out.println("O salário base deve ser maior que zero.");
}
```

---

## Uso adequado de estruturas de decisão

Utilizar `if`, `else if` e `switch` de forma organizada.

Exemplo:

```java
switch (tipoVinculo) {
    case 1:
        System.out.println("Colaborador CLT");
        break;
    case 2:
        System.out.println("Colaborador PJ");
        break;
    case 3:
        System.out.println("Estagiário");
        break;
    case 4:
        System.out.println("Horista");
        break;
    default:
        System.out.println("Tipo de vínculo inválido");
}
```

---

## Uso de ArrayList

Utilizar `ArrayList` para armazenar os colaboradores cadastrados durante a execução do programa.

Exemplo:

```java
ArrayList<Colaborador> colaboradores = new ArrayList<>();
```

---

## Comentários no código

Comentários devem ser usados para explicar partes importantes da lógica, mas não devem substituir nomes claros de métodos e variáveis.

Exemplo adequado:

```java
// Calcula o salário final conforme o tipo de vínculo do colaborador
double salarioFinal = calcularSalarioFinal(colaborador);
```

---

## Formatação

Manter uma formatação consistente em todo o código:

* Usar indentação adequada.
* Separar blocos de código com linhas em branco quando necessário.
* Evitar linhas muito longas.
* Manter o mesmo padrão de nomes em todo o projeto.

---

## Recomendações gerais

* Manter o código simples e objetivo.
* Evitar repetição desnecessária de código.
* Testar o sistema após cada alteração importante.
* Tratar entradas inválidas do usuário.
* Organizar o código em classes e métodos simples.
* Atualizar a documentação sempre que houver mudanças relevantes.

---

## Referências

As boas práticas de código, nomenclatura e organização utilizadas neste projeto foram baseadas nas seguintes fontes:

### Padrões de código Java

* Oracle. *Java Code Conventions*.
  https://www.oracle.com/java/technologies/javase/codeconventions-contents.html

* Oracle. *Java Naming Conventions*.
  https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html

---

### Clean Code e boas práticas gerais

* Martin, Robert C. *Clean Code: A Handbook of Agile Software Craftsmanship*. Prentice Hall, 2008.

* Martin, Robert C. *The Clean Coder*. Prentice Hall, 2011.

---

### Estilo e legibilidade de código

* Google. *Google Java Style Guide*.
  https://google.github.io/styleguide/javaguide.html

---

### Boas práticas de comentários

* Oracle. *Documentation Comments (Javadoc)*.
  https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html

---

### Estrutura e organização de projetos

* Bloch, Joshua. *Effective Java*. Addison-Wesley, 2018.

---

### Boas práticas de commits

* Conventional Commits 1.0.0
  https://www.conventionalcommits.org/en/v1.0.0/

