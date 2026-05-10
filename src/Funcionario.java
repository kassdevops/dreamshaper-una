public class Funcionario {
    private String nome;
    private double salarioBase;
    private String tipoVinculo;  // CLT, PJ, Estagiário, Horista
    private double horasTrabalho; // Para horista
    private double valorHora;     // Para horista

    // Construtor para CLT, PJ e Estagiário
    public Funcionario(String nome, double salarioBase, String tipoVinculo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tipoVinculo = tipoVinculo;
        this.horasTrabalho = 0;
        this.valorHora = 0;
    }

    // Construtor para Horista
    public Funcionario(String nome, String tipoVinculo, double horasTrabalho, double valorHora) {
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
        this.salarioBase = horasTrabalho * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public double getHorasTrabalho() {
        return horasTrabalho;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               " | Vínculo: " + tipoVinculo + 
               " | Salário Base: R$ " + String.format("%.2f", salarioBase);
    }
}
