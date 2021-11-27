package dados;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexao {
    
    private Connection conexao;
    
    public Connection abrirConexao(){
        // argumentos para vincular com a hora do servidor e evitar erros futuros
        String url = "jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        // abrindo conexão
        try {
            conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return conexao;
    }
    
    // fechando conexão
    public void fecharConexao(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
