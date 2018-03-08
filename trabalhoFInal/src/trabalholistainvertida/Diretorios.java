/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholistainvertida;

import java.util.ArrayList;
import java.util.Scanner;
import trabalholistainvertida.diretorios.DiretorioCidades;
import trabalholistainvertida.diretorios.DiretorioCursos;
import trabalholistainvertida.diretorios.DiretorioTimes;

/**
 *
 * @author Gabriel e José
 */
public class Diretorios {
    
    private DiretorioTimes times;
    private DiretorioCursos cursos;
    private DiretorioCidades cidades;
    private Controlador controlador;
    private Scanner s = new Scanner(System.in);
    
    public Diretorios(Controlador controlador) {
        this.times = new DiretorioTimes(this);
        this.cursos = new DiretorioCursos(this);
        this.cidades = new DiretorioCidades(this);
        this.controlador = controlador;
    }
    
    public Time getTimeById(int id) {
        return times.getTimeById(id);
    }
    
    public Cidade getCidadeById(int id) {
        return cidades.getCidadeById(id);
    }

    public Curso getCursoById(int id) {
        return cursos.getCursoById(id);
    }

    public void cadTime(int id, String nome) {
        times.cadTime(id, nome);
    }
    
    public void listaTimes() {
        times.listar();
    }

    public void cadCidade(int id, String nome) {
        cidades.cadCidade(id, nome);
    }
    
    public void listaCidades() {
        cidades.listar();
    }

    public void cadCurso(int id, String nome) {
        cursos.cadCurso(id, nome);
    }
    
    public void listaCursos() {
        cursos.listar();
    }

    public void preencherDiretorioTime(int idTime, int idAluno) {
        times.colocarIdAluno(idTime, idAluno);
    }

    public void preencherDiretorioCidade(int idCidade, int idAluno) {
        cidades.colocarIdAluno(idCidade, idAluno);
    }

    void preencherDiretorioCurso(int idCurso, int idAluno) {
        cursos.colocarIdAluno(idCurso, idAluno);
    }

    void listarAlunosTimes() {
        times.listarAlunos();
    }
    
    public void listarAlunosCidades() {
        cidades.listarAlunos();
    }
    
    public void listarAlunosCursos() {
        cursos.listarAlunos();
    }

    public void acharAlunos(int id) {
        controlador.acharAlunos(id);
    }

    void buscaSimplesTimes() {
        System.out.println("Escolha por qual time você deseja buscar:");
        System.out.println("1 - Figueirense");
        System.out.println("2 - Avaí");
        System.out.println("3 - Guarani de Palhoça");
        System.out.println("4 - Chapecoense");
        int opcao = s.nextInt();
        times.buscaSimples(opcao);
    }
    
    void buscaSimplesCidades() {
        System.out.println("Escolha por qual time você deseja buscar:");
        System.out.println("1 - Florianópolis");
        System.out.println("2 - São José");
        System.out.println("3 - Palhoça");
        System.out.println("4 - Chapecó");
        int opcao = s.nextInt();
        cidades.buscaSimples(opcao);
    }

    public void voltar() {
        controlador.inicia();
    }

    void buscaSimplesCursos() {
        System.out.println("Escolha por qual time você deseja buscar:");
        System.out.println("1 - Sistemas de Informação");
        System.out.println("2 - Ciências da Computação");
        System.out.println("3 - Psicologia");
        System.out.println("4 - Engenharia Civil");
        int opcao = s.nextInt();
        cursos.buscaSimples(opcao);
    }

    void excluirAluno(int id, int idTime, int idCidade, int idCurso) {
        times.excluir(id, idTime);
        cidades.excluir(id, idCidade);
        cursos.excluir(id, idCurso);
    }

    void buscaTimeCidade() {
        System.out.println("Digite o ID do Time:");
        int idTime = s.nextInt();
        System.out.println("Digite o ID da Cidade");
        int idCidade = s.nextInt();
        
        ArrayList<Integer> arrayTimes = times.getArrayTimes(idTime);
        ArrayList<Integer> arrayCidades = cidades.getArrayCidades(idCidade);
        
        if (arrayTimes.size() >= arrayCidades.size()) {
            for (Integer time: arrayTimes) {
                for (Integer cidade : arrayCidades) {
                    if(time == cidade) {
                        controlador.acharAlunos(time);
                    }
                }
            }
        } else {
            for (Integer cidade: arrayTimes) {
                for (Integer time : arrayCidades) {
                    if(cidade == time) {
                        controlador.acharAlunos(cidade);
                    }
                }
            }
        }
        
        controlador.inicia();
    }

    void buscaTimeCurso() {
        System.out.println("Digite o ID do Time:");
        int idTime = s.nextInt();
        System.out.println("Digite o ID do Curso");
        int idCurso = s.nextInt();
        
        ArrayList<Integer> arrayTimes = times.getArrayTimes(idTime);
        ArrayList<Integer> arrayCursos = cursos.getArrayCursos(idCurso);
        
        if (arrayTimes.size() >= arrayCursos.size()) {
            for (Integer time: arrayTimes) {
                for (Integer curso : arrayCursos) {
                    if(time == curso) {
                        controlador.acharAlunos(time);
                    }
                }
            }
        } else {
            for (Integer curso: arrayCursos) {
                for (Integer time : arrayTimes) {
                    if(curso == time) {
                        controlador.acharAlunos(curso);
                    }
                }
            }
        }
        
        controlador.inicia();
    }

    void buscaCidadeCurso() {
        System.out.println("Digite o ID do Cidade:");
        int idCidade = s.nextInt();
        System.out.println("Digite o ID do Curso");
        int idCurso = s.nextInt();
        
        ArrayList<Integer> arrayCidade = cidades.getArrayCidades(idCidade);
        ArrayList<Integer> arrayCursos = cursos.getArrayCursos(idCurso);
        
        if (arrayCidade.size() >= arrayCursos.size()) {
            for (Integer cidade: arrayCidade) {
                for (Integer curso : arrayCursos) {
                    if(cidade == curso) {
                        controlador.acharAlunos(cidade);
                    }
                }
            }
        } else {
            for (Integer curso: arrayCursos) {
                for (Integer cidade : arrayCidade) {
                    if(curso == cidade) {
                        controlador.acharAlunos(cidade);
                    }
                }
            }
        }
        
        controlador.inicia();
    }
}
