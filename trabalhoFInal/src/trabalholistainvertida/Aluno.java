/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholistainvertida;

/**
 *
 * @author Gabriel e José
 */
public class Aluno {
    
    private int matricula;
    private int id;
    private String nome;
    private Time time;
    private Cidade cidade;
    private Curso curso;

    public Aluno(int matricula, int id, String nome, Time time, Cidade cidade, Curso curso) {
        this.matricula = matricula;
        this.id = id;
        this.nome = nome;
        this.time = time;
        this.cidade = cidade;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
