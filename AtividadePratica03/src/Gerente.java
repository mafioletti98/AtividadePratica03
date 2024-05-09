public class Gerente extends Funcionario {

    private float bônusAnuais;
    private String equipeGerencia;

    public Gerente() {

    }

    public Gerente(float bônusAnuais, String equipeGerencia) {

        this.bônusAnuais = bônusAnuais;
        this.equipeGerencia = equipeGerencia;
    }

    public float getBônusAnuais() {
        return bônusAnuais;
    }

    public void setBônusAnuais(float bônusAnuais) {
        this.bônusAnuais = bônusAnuais;
    }

    public String getEquipeGerencia() {
        return equipeGerencia;
    }

    public void setEquipeGerencia(String equipeGerencia) {
        this.equipeGerencia = equipeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente: " + bônusAnuais
                + "Equipe Gerenciada: " + equipeGerencia;
    }
}
