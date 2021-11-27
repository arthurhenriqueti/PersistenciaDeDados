package dados;

import app.Aluno;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCAluno {
    
    Connection conexao;

    public JDBCAluno(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserirAluno(Aluno p){
        String sql = "insert into aluno(nome, nota1, nota2, media) values (?, ?, ?, ?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setDouble(2, p.getNota1());
            ps.setDouble(3, p.getNota2());
            ps.setDouble(4, p.getMedia());
            ps.execute();
            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Aluno> listarAlunos(){
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        String sql = "select * from aluno";
        
        try{
            Statement declaracao = conexao.createStatement();
            ResultSet resposta = declaracao.executeQuery(sql);
            
            while(resposta.next()){
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                double nota1 = resposta.getDouble("nota1");
                double nota2 = resposta.getDouble("nota2");
                double media = resposta.getDouble("media");
                
                Aluno p = new Aluno(id, nome, nota1, nota2, media);
                alunos.add(p);
            }
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return alunos;
    }
    
    public void apagarTudo(){
        String sql = "delete from aluno";
        
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
