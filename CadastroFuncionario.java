import java.util.Scanner;

public class CadastroFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = entrada.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        funcionario.cargo = entrada.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        funcionario.salario = entrada.nextLine();

        System.out.println("\nResumo do funcionário:");
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Salário: R$" + funcionario.salario);

        FuncionarioDAO dao = new FuncionarioDAO();
        dao.salvarFuncionario(funcionario);
    }
}
