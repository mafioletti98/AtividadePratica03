public abstract class Funcionario {

    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + "Matricula: " + matricula;
    }

    public abstract double calcularSalario();
}
