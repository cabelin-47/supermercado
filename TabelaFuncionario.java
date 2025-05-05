import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TabelaFuncionario {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(
              "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
              "kaua_9zxu_user",
              "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV"  
            );

            String sql = "CREATE TABLE IF NOT EXISTS funcionario (" +
                         "id SERIAL PRIMARY KEY," +
                         "nome VARCHAR(100)," +
                         "cargo VARCHAR(50)," +
                         "salario VARCHAR(10)" +
                         ");";

            Statement stmt = conexao.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Tabela 'funcionario' criada com sucesso!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao criar tabela funcionario: " + e.getMessage());
        }
    }
}
