import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultarFuncionario {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(
              "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
              "kaua_9zxu_user",
              "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV" 
            );

            String sql = "SELECT * FROM funcionario";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(" Lista de Funcionario  ");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cargo = rs.getString("cargo");
                double salario = rs.getDouble("salario");

                System.out.println(id + " - " + nome + " | Cargo: " + cargo + " | Salário: R$" + salario);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e.getMessage());
        }
    }
}
