public class Estagiario extends Funcionario {

    private float horasTrabalhadas;
    private String supervisor;

    public Estagiario() {

    }

    public Estagiario(float horasTrabalhadas, String supervisor) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "\nEstagiario: " + horasTrabalhadas
                + "\nSupervisor: " + supervisor;
    }

}
