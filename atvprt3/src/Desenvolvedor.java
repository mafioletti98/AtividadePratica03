public class Desenvolvedor extends Funcionario {

    private double taxaHora;

    public Desenvolvedor(String nome, String matricula, double taxaHora) {
        super(nome, matricula);
        this.taxaHora = taxaHora;
    }

    public double getTaxaHora() {
        return taxaHora;
    }

    public void setTaxaHora(double taxaHora) {
        this.taxaHora = taxaHora;
    }

    @Override
    public double calcularSalario() {
        int horasTrabalhadas = 160; // Suponhamos 160 horas por mês
        return taxaHora * horasTrabalhadas;
    }
}
