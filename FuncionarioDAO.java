import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FuncionarioDAO {

    public void salvarFuncionario(Funcionario funcionario) {
        try {
            Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
                "kaua_9zxu_user",
                "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV"
            );

            String sql = "INSERT INTO funcionario (nome, cargo, salario) VALUES (?, ?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.nome);
            stmt.setString(2, funcionario.cargo);
            stmt.setString(3, funcionario.salario);

            stmt.executeUpdate();
            System.out.println("Funcionário cadastrado com sucesso!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar funcionário: " + e.getMessage());
        }
    }

    public void deletarFuncionario(int id) {
        try {
            Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://dpg-cvrcsabe5dus7385nei0-a.oregon-postgres.render.com/kaua_9zxu",
                "kaua_9zxu_user",
                "Ak0g1iIz2CuHT5BS2ks7emfxnk1zPdZV"
            );

            String sql = "DELETE FROM funcionario WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Funcionário deletado com sucesso!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao deletar funcionário: " + e.getMessage());
        }
    }
}
