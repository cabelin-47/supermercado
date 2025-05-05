import java.sql.*;

public class ExcluirTabelas {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu";
        String user ="kaua_9zxu_user";
        String password ="Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV";

        try (Connection conexao = DriverManager.getConnection(url, user, password);
             Statement stmt = conexao.createStatement()) {

           
            stmt.executeUpdate("DROP TABLE IF EXISTS Cliente");
            System.out.println("Tabela 'consultas' excluída.");

           
            stmt.executeUpdate("DROP TABLE IF EXISTS Produto");
            System.out.println("Tabela 'pacientes' excluída.");

            stmt.executeUpdate("DROP TABLE IF EXISTS Funcionario");
            System.out.println("Tabela 'medicos' excluída.");

            System.out.println("Todas as tabelas foram excluídas com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao excluir tabelas: " + e.getMessage());
        }
    }
}