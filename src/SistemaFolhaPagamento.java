import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFolhaPagamento {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static FolhaPagamento folha = new FolhaPagamento();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarColaborador();
                    break;
                case 2:
                    listarColaboradores();
                    break;
                case 3:
                    calcularFolhaPagamento();
                    break;
                case 4:
                    buscarColaborador();
                    break;
                case 5:
                    System.out.println("\n✓ Sistema encerrado com sucesso!");
                    break;
                default:
                    System.out.println("\n✗ Opção inválida! Tente novamente.\n");
            }

        } while (opcao != 5);

        scanner.close();
    }

    // Exibe o menu principal
    private static void exibirMenu() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("           SISTEMA DE FOLHA DE PAGAMENTO");
        System.out.println("=".repeat(60));
        System.out.println("1 - Cadastrar colaborador");
        System.out.println("2 - Listar colaboradores");
        System.out.println("3 - Calcular folha de pagamento");
        System.out.println("4 - Buscar colaborador");
        System.out.println("5 - Encerrar sistema");
        System.out.println("=".repeat(60));
    }

    // Cadastra um novo colaborador
    private static void cadastrarColaborador() {
        System.out.println("\n--- CADASTRO DE COLABORADOR ---");

        String nome = lerString("Nome do colaborador: ");

        exibirTiposVinculo();
        String tipoVinculo = lerString("Tipo de vínculo (CLT/PJ/ESTAGIÁRIO/HORISTA): ");

        // Valida tipo de vínculo
        if (!validarTipoVinculo(tipoVinculo)) {
            System.out.println("\n✗ Tipo de vínculo inválido!");
            return;
        }

        Funcionario novoFuncionario;

        if (tipoVinculo.equalsIgnoreCase("HORISTA")) {
            double horasTrabalho = lerDouble("Horas trabalhadas: ");
            double valorHora = lerDouble("Valor por hora: R$ ");
            novoFuncionario = new Funcionario(nome, tipoVinculo, horasTrabalho, valorHora);
        } else {
            double salarioBase = lerDouble("Salário base: R$ ");
            novoFuncionario = new Funcionario(nome, salarioBase, tipoVinculo);
        }

        funcionarios.add(novoFuncionario);
        System.out.println("\n✓ Colaborador cadastrado com sucesso!");
    }

    // Lista todos os colaboradores cadastrados
    private static void listarColaboradores() {
        System.out.println("\n--- LISTA DE COLABORADORES ---");

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println((i + 1) + ". " + funcionarios.get(i).toString());
        }
    }

    // Calcula a folha de pagamento de todos os colaboradores
    private static void calcularFolhaPagamento() {
        System.out.println("\n--- CÁLCULO DE FOLHA DE PAGAMENTO ---");

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        for (Funcionario func : funcionarios) {
            folha.exibirFolhaDePagamento(func);
        }
    }

    // Busca um colaborador pelo nome
    private static void buscarColaborador() {
        System.out.println("\n--- BUSCAR COLABORADOR ---");

        String nome = lerString("Nome do colaborador: ");
        boolean encontrado = false;

        for (Funcionario func : funcionarios) {
            if (func.getNome().equalsIgnoreCase(nome)) {
                System.out.println("\n" + func.toString());
                folha.exibirFolhaDePagamento(func);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\n✗ Colaborador não encontrado!");
        }
    }

    // ========== MÉTODOS AUXILIARES ==========

    // Lê uma string do usuário
    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }

    // Lê um número decimal com validação
    private static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = Double.parseDouble(scanner.nextLine().replace(",", "."));

                if (valor < 0) {
                    System.out.println("✗ Digite um valor positivo!");
                    continue;
                }

                return valor;
            } catch (NumberFormatException e) {
                System.out.println("✗ Valor inválido! Digite um número.");
            }
        }
    }

    // Lê um número inteiro com validação
    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("✗ Valor inválido! Digite um número inteiro.");
            }
        }
    }

    // Valida o tipo de vínculo
    private static boolean validarTipoVinculo(String tipo) {
        return tipo.equalsIgnoreCase("CLT") ||
               tipo.equalsIgnoreCase("PJ") ||
               tipo.equalsIgnoreCase("ESTAGIÁRIO") ||
               tipo.equalsIgnoreCase("HORISTA");
    }

    // Exibe os tipos de vínculo disponíveis
    private static void exibirTiposVinculo() {
        System.out.println("\nTipos de vínculo disponíveis:");
        System.out.println("  • CLT - Empregado formal (desconto INSS + FGTS)");
        System.out.println("  • PJ - Pessoa Jurídica (sem descontos)");
        System.out.println("  • ESTAGIÁRIO - Bolsista (com auxílio transporte)");
        System.out.println("  • HORISTA - Pagamento por hora (desconto INSS)\n");
    }
}
