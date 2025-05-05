import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.print("Digite o nome do cliente: ");
        cliente.nome = entrada.nextLine();

        System.out.print("Digite o email do cliente: ");
        cliente.email = entrada.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        cliente.telefone = entrada.nextLine();

        System.out.println("\nResumo do cadastro:");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Email: " + cliente.email);
        System.out.println("Telefone: " + cliente.telefone);

        ClienteDAO dao = new ClienteDAO();
        dao.salvarCliente(cliente);
    }
}

