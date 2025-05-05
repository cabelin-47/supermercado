import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.nome = entrada.nextLine();

        System.out.print("Digite o preço do produto: ");
        produto.preco = entrada.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        produto.quantidade = entrada.nextLine();

        System.out.println("\nResumo do produto:");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);

        ProdutoDAO dao = new ProdutoDAO();
        dao.salvarProduto(produto);
    }
}
