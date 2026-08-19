import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaController {
    //Create
    public void salvar(String nome, int idade, String genero, String telefone){
        String sql = "INSERT INTO pessoas (nome, idade, genero, telefone) VALUES (?, ?, ?, ? )";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString( 1, nome);
            stmt.setInt(2, idade);
            stmt.setString( 3, genero);
            stmt.setString( 4, telefone);
            stmt.executeLargeUpdate();


        } catch (SQLException e) {
            System.err.println("Erro ao salvar pessoa" + e.getMessage());
        }
    }

    public List<Pessoa> listarTodas(){
        List<Pessoa> lista = new ArrayList<>();
        String sql = "SELECT id, nome, idade, genero, telefone FROM pessoas";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String genero = rs.getString("genero");
                String telefone = rs.getString("telefone");
                lista.add(new Pessoa(id, nome, idade, genero, telefone));
            }
        } catch (SQLException e){
            System.err.println("Erro ao listar as pessoas " + e.getMessage());
        }
        return lista;
    }
    public void deletar(int id){
        String sql = "DELETE FROM pessoas WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e){
            System.err.println("Erro ao deletar pessoa: " + e.getMessage());
        }

    }
}