import java.util.ArrayList;

public class Cadastro {

    private ArrayList<Funcionario> listaFuncionarios;

    public Cadastro() {
        listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        listaFuncionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario f : listaFuncionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Matrícula: " + f.getMatricula());
            System.out.println("Salário: R$" + f.calcularSalario());
            System.out.println("--------------------");
        }
    }

    public void excluirFuncionario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluirFuncionario'");
    }

    public void buscarFuncionario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarFuncionario'");
    }

    public void cadastrarFuncionario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarFuncionario'");
    }

    public boolean removerFuncionarioPorMatricula(String matricula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerFuncionarioPorMatricula'");
    }

    public Funcionario buscarFuncionarioPorMatricula(String matricula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarFuncionarioPorMatricula'");
    }
}
