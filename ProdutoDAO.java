import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProdutoDAO {

    public void salvarProduto(Produto produto) {
        try {
            Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
                "kaua_9zxu_user",
                "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV"
            );

            String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.nome);
            stmt.setString(2, produto.preco);
            stmt.setString(3, produto.quantidade);

            stmt.executeUpdate();
            System.out.println("Produto cadastrado com sucesso!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }

    public void deletarProduto(int id) {
        try {
            Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
                "kaua_9zxu_user",
                "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV"
            );

            String sql = "DELETE FROM produto WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Produto deletado com sucesso!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao deletar produto: " + e.getMessage());
        }
    }
}
