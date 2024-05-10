class Estagiario extends Funcionario {

    private double taxaHora;

    public Estagiario(String nome, String matricula, double taxaHora) {
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
        int horasTrabalhadas = 120; // Suponhamos 120 horas por mês
        return taxaHora * horasTrabalhadas;
    }
}
