/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholistainvertida;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Gabriel e José
 */
public class Controlador {

    private HashMap<Integer, Aluno> alunos;
    private Scanner s;
    private Diretorios diretorios;
    private int ultimoId;

    public Controlador() {
        this.alunos = new HashMap<>();
        this.s = new Scanner(System.in);
        this.diretorios = new Diretorios(this);
        this.ultimoId = 1;
    }
    

    public void cadAluno() {
        System.out.println("Digite o nome do Aluno:");
        String nome = s.next();
        System.out.println("Digite a matrícula dos Alunos");
        int matricula = s.nextInt();
        System.out.println("Escolha o Time do Aluno");
        System.out.println("1 - Figueirense");
        System.out.println("2 - Avaí");
        System.out.println("3 - Guarani de Palhoça");
        System.out.println("4 - Chapecoense");
        Time time = diretorios.getTimeById(s.nextInt());

        System.out.println("Escolha a Cidade Natal do Aluno");
        System.out.println("1 - Florianópolis");
        System.out.println("2 - São José");
        System.out.println("3 - Palhoça");
        System.out.println("4 - Chapecó");
        Cidade cidade = diretorios.getCidadeById(s.nextInt());

        System.out.println("Escolha o Curso do Aluno");
        System.out.println("1 - Sistemas de Informação");
        System.out.println("2 - Ciências da Computação");
        System.out.println("3 - Psicologia");
        System.out.println("4 - Engenharia Civil");
        Curso curso = diretorios.getCursoById(s.nextInt());

        Aluno aluno = new Aluno(matricula, ultimoId, nome, time, cidade, curso);
        alunos.put(ultimoId, aluno);
        diretorios.preencherDiretorioTime(time.getId(), ultimoId);
        diretorios.preencherDiretorioCidade(cidade.getId(), ultimoId);
        diretorios.preencherDiretorioCurso(curso.getId(), ultimoId);
        this.ultimoId += 1;

        inicia();
    }
    

    public void cadAluno2(String nome, int matricula, int idTime, int idCidade, int idCurso) {
        Time time = diretorios.getTimeById(idTime);
        Cidade cidade = diretorios.getCidadeById(idCidade);
        Curso curso = diretorios.getCursoById(idCurso);
        Aluno aluno = new Aluno(matricula, ultimoId, nome, time, cidade, curso);
        alunos.put(ultimoId, aluno);
        diretorios.preencherDiretorioTime(time.getId(), ultimoId);
        diretorios.preencherDiretorioCidade(cidade.getId(), ultimoId);
        diretorios.preencherDiretorioCurso(curso.getId(), ultimoId);
        this.ultimoId += 1;
    }
    

    public void inicia() {
        System.out.println("----------Bem Vindo------------");
        System.out.println("1 - Carregar Dados");
        System.out.println("2 - Busca Simples");
        System.out.println("3 - Busca Composta");
        System.out.println("4 - Incluir novo Aluno");
        System.out.println("5 - Remover Aluno");
        System.out.println("6 - Listar todos os Dados");

        int opcao = s.nextInt();
        switch (opcao) {
            case 1:
                carregarDados();
                break;
            case 2:
                buscaSimples();
                break;
            case 3:
                buscaComposta();
                break;
            case 4:
                cadAluno();
                break;
            case 5:
                excluirAluno();
                break;
            case 6:
                listarTudo();
                break;
            default:
                System.out.println("Opção inválida, digite um novo número");
                inicia();
        }
    }
    

    public void listarTimes() {
        diretorios.listaTimes();
        inicia();
    }
    

    public void listarCidades() {
        diretorios.listaCidades();
        inicia();
    }

    public void listarCursos() {
        diretorios.listaCursos();
        inicia();
    }
    

    public void carregarDados() {
        diretorios.cadTime(1, "Figueirense");
        diretorios.cadTime(2, "Avaí");
        diretorios.cadTime(3, "Guarani de Palhoça");
        diretorios.cadTime(4, "Chapecoense");
        diretorios.cadCidade(1, "Florianópolis");
        diretorios.cadCidade(2, "São José");
        diretorios.cadCidade(3, "Palhoça");
        diretorios.cadCidade(4, "Chapecó");
        diretorios.cadCurso(1, "Sistema de Informação");
        diretorios.cadCurso(2, "Ciências da Computação");
        diretorios.cadCurso(3, "Psicologia");
        diretorios.cadCurso(4, "Engenharia Civil");
        cadAluno2("Aluno1", 1, 1, 2, 1);
        cadAluno2("Aluno2", 2, 1, 4, 3);
        cadAluno2("Aluno3", 3, 2, 3, 2);
        cadAluno2("Aluno4", 4, 4, 2, 4);
        cadAluno2("Aluno5", 5, 3, 3, 2);
        cadAluno2("Aluno6", 6, 2, 1, 3);
        cadAluno2("Aluno7", 7, 3, 1, 4);


        inicia();
    }
    

    public void acharAlunos(int id) {
        Aluno aluno = alunos.get(id);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("ID: " + aluno.getId());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Time: " + aluno.getTime().getNome());
        System.out.println("Cidade: " + aluno.getCidade().getNome());
        System.out.println("Curso: " + aluno.getCurso().getNome());
        System.out.println(" ");
    }
    

    public void buscaSimples() {
        System.out.println("Digite por qual categoria você deseja buscar:");
        System.out.println("1 - Times");
        System.out.println("2 - Cidades");
        System.out.println("3 - Cursos");
        System.out.println("4 - Voltar");
        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                diretorios.buscaSimplesTimes();
                break;
            case 2:
                diretorios.buscaSimplesCidades();
                break;
            case 3:
                diretorios.buscaSimplesCursos();
                break;
            case 4:
                inicia();
                break;
            default:
                System.out.println("Opção errada");
                inicia();
        }
    }

    private void listarTudo() {
        System.out.println("Digite quais dados você deseja listar:");
        System.out.println("1 - Todos os Alunos");
        System.out.println("2 - Todos os Times");
        System.out.println("3 - Todas as Cidades");
        System.out.println("4 - Todas os Cursos");
        System.out.println("5 - Voltar");
        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                listarAlunos();
                break;
            case 2:
                listarTimes();
                break;
            case 3:
                listarCidades();
                break;
            case 4:
                listarCursos();
                break;
            case 5:
                inicia();
            default:
                System.out.println("Opção errada");
                inicia();
        }
    }
    

    private void listarAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("ID: " + aluno.getId());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Time: " + aluno.getTime().getNome());
            System.out.println("Cidade: " + aluno.getCidade().getNome());
            System.out.println("Curso: " + aluno.getCurso().getNome());
            System.out.println(" ");
        }
        inicia();
    }


    private void excluirAluno() {
        System.out.println("Digite o id do aluno que deseja excluir");
        int id = s.nextInt();
        Aluno aluno = alunos.get(id);
        int idTime = aluno.getTime().getId();
        int idCidade = aluno.getCidade().getId();
        int idCurso = aluno.getCurso().getId();
        
        diretorios.excluirAluno(id, idTime, idCidade, idCurso);
        alunos.remove(id);
        inicia();
        
    }
    

    private void buscaComposta() {
        System.out.println("Informe por quais parâmetros você deseja buscar:");
        System.out.println("1 - Time e Cidade");
        System.out.println("2 - Time e Curso");
        System.out.println("3 - Cidade e Curso");
        System.out.println("4 - Voltar");
        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                diretorios.buscaTimeCidade();
                break;
            case 2:
                diretorios.buscaTimeCurso();
                break;
            case 3:
                diretorios.buscaCidadeCurso();
                break;
            case 4:
                inicia();
                break;
            default:
                System.out.println("Opção errada");
                inicia();
        }
    }
}
