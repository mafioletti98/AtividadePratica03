import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private Cadastro cadastro;

    public Sistema() {
        cadastro = new Cadastro();
    }

    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Buscar funcionário");
            System.out.println("4. Excluir funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    buscarFuncionario();
                    break;
                case 4:
                    excluirFuncionario();
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }

    private void excluirFuncionario() {
        return;
    }

    private void buscarFuncionario() {
        return;
    }

    private void listarFuncionarios() {
        return;
    }

    private void cadastrarFuncionario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        Gerente gerente = new Gerente(nome, matricula, 2000.0, "Equipe A");
        cadastro.adicionarFuncionario(gerente);

        System.out.println("Olá, " + nome + "! Bem-vindo!");
        System.out.println("Funcionário cadastrado com sucesso!");
    }
}
