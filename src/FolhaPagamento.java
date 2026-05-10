package src;

public class FolhaPagamento {
    private static final double AUXILIO_ESTAGIARIO = 500.0;

    // Calcula desconto INSS conforme tabela progressiva
    public double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1212.00) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 3641.03) {
            return salarioBruto * 0.12;
        } else {
            return salarioBruto * 0.14;
        }
    }

    // Calcula desconto FGTS (8%)
    public double calcularFGTS(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    // Calcula salário final conforme tipo de vínculo
    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBruto = funcionario.getSalarioBase();
        double desconto = 0;

        switch (funcionario.getTipoVinculo().toUpperCase()) {
            case "CLT":
                // CLT: aplica INSS + FGTS
                desconto = calcularINSS(salarioBruto) + calcularFGTS(salarioBruto);
                break;

            case "PJ":
                // PJ: sem descontos
                desconto = 0;
                break;

            case "ESTAGIÁRIO":
                // Estagiário: bolsa + auxílio
                salarioBruto += AUXILIO_ESTAGIARIO;
                desconto = 0;
                break;

            case "HORISTA":
                // Horista: aplica INSS
                desconto = calcularINSS(salarioBruto);
                break;
        }

        return salarioBruto - desconto;
    }

    // Exibe a folha de pagamento
    public void exibirFolhaDePagamento(Funcionario funcionario) {
        double salarioBruto = funcionario.getSalarioBase();
        double inss = 0;
        double fgts = 0;
        double salarioLiquido = 0;

        System.out.println("\n" + "=".repeat(60));
        System.out.println("                    FOLHA DE PAGAMENTO");
        System.out.println("=".repeat(60));
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Tipo de Vínculo: " + funcionario.getTipoVinculo().toUpperCase());

        switch (funcionario.getTipoVinculo().toUpperCase()) {
            case "CLT":
                inss = calcularINSS(salarioBruto);
                fgts = calcularFGTS(salarioBruto);
                salarioLiquido = salarioBruto - inss - fgts;

                System.out.println("\nDetalhes:");
                System.out.println("  Salário Base: R$ " + String.format("%.2f", salarioBruto));
                System.out.println("  Desconto INSS (12%): -R$ " + String.format("%.2f", inss));
                System.out.println("  Desconto FGTS (8%): -R$ " + String.format("%.2f", fgts));
                System.out.println("  " + "-".repeat(56));
                System.out.println("  Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
                break;

            case "PJ":
                salarioLiquido = salarioBruto;
                System.out.println("\nDetalhes:");
                System.out.println("  Salário Base: R$ " + String.format("%.2f", salarioBruto));
                System.out.println("  Descontos: Nenhum (responsabilidade do PJ)");
                System.out.println("  " + "-".repeat(56));
                System.out.println("  Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
                break;

            case "ESTAGIÁRIO":
                double bolsa = funcionario.getSalarioBase();
                salarioBruto = bolsa + AUXILIO_ESTAGIARIO;
                salarioLiquido = salarioBruto;

                System.out.println("\nDetalhes:");
                System.out.println("  Bolsa: R$ " + String.format("%.2f", bolsa));
                System.out.println("  Auxílio Transporte: R$ " + String.format("%.2f", AUXILIO_ESTAGIARIO));
                System.out.println("  " + "-".repeat(56));
                System.out.println("  Total: R$ " + String.format("%.2f", salarioLiquido));
                break;

            case "HORISTA":
                inss = calcularINSS(salarioBruto);
                salarioLiquido = salarioBruto - inss;

                System.out.println("\nDetalhes:");
                System.out.println("  Horas Trabalhadas: " + (int)funcionario.getHorasTrabalho());
                System.out.println("  Valor por Hora: R$ " + String.format("%.2f", funcionario.getValorHora()));
                System.out.println("  Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
                System.out.println("  Desconto INSS (7,5%): -R$ " + String.format("%.2f", inss));
                System.out.println("  " + "-".repeat(56));
                System.out.println("  Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
                break;

            default:
                System.out.println("Tipo de vínculo inválido!");
        }

        System.out.println("=".repeat(60) + "\n");
    }
}
