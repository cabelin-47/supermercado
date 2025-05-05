import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultarCliente {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(
              "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
              "kaua_9zxu_user",
              "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV" 
            );

            String sql = "SELECT * FROM cliente";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Lista de Cliente");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                System.out.println(id + " - " + nome + " | Email: " + email + " | Telefone: " + telefone);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e.getMessage());
        }
    }
}
