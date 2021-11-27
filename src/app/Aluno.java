package app;

/*
Projeto desenvolvido por Arthur Henrique de Lucena Paiva
Para a disciplina de Programação Orientada a Objetos do Prof Walter Travassos
*/

public class Aluno {
    private int id;
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(int id, String nome, double nota1, double nota2, double media) {
        this.id = id;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public Aluno() {
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getMedia() {
        media = (this.getNota1() + this.getNota2()) / 2;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}
