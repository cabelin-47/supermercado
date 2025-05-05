import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClienteDAO {

    public void salvarCliente(Cliente cliente) {
        try {
            Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
                "kaua_9zxu_user",
                "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV"
            );

            String sql = "INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.nome);
            stmt.setString(2, cliente.email);
            stmt.setString(3, cliente.telefone);

            stmt.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    public void deletarCliente(int id) {
        try {
            Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
                "kaua_9zxu_user",
                "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV"
            );

            String sql = "DELETE FROM cliente WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Cliente deletado com sucesso!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
        }
    }
}
