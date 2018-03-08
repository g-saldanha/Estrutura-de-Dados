
package trabalholistainvertida.diretorios;

import java.util.ArrayList;
import java.util.HashMap;
import trabalholistainvertida.Curso;
import trabalholistainvertida.Diretorios;

/**
 *
 * @author Gabriel e José
 */
public class DiretorioCursos {
    
    private HashMap<Integer, ArrayList<Integer>> diretorio;
    private HashMap<Integer, Curso> cursos;
    private ArrayList<Integer> temp;
    private Diretorios pai;
    
    public DiretorioCursos(Diretorios diretorio) {
        this.diretorio = new HashMap<>();
        this.cursos = new HashMap<>();
        this.temp = new ArrayList<>();
        this.pai = diretorio;
    }
    
    public Curso getCursoById(int id) {
        return cursos.get(id);
    }

    public void cadCurso(int id, String nome) {
        Curso curso = new Curso(nome, id);
        cursos.put(id, curso);
        ArrayList<Integer> array = new ArrayList<>();
        diretorio.put(id, array);
    }
    
    public void listar() {
        for (Curso curso: cursos.values()) {
            System.out.println("ID: " + curso.getId());
            System.out.println("Nome: " + curso.getNome());
        }
    }
    
    public void colocarIdAluno(int idCurso, int idAluno) {
        temp = diretorio.get(idCurso);
        temp.add(idAluno); 
    }
    
    public void listarAlunos() {
        for (int i = 1; i < diretorio.size()+1 ; i++) {
            ArrayList<Integer> novo = diretorio.get(i);
            System.out.println("-----------------");
            System.out.println("Diretorio: " + i);
            
            for(int indice : novo) {
                System.out.println(indice);
                acharAlunos(indice);
            }
        }
    }
    
    public void acharAlunos(int id) {
        pai.acharAlunos(id);
    }

    public void buscaSimples(int opcao) {
        temp = diretorio.get(opcao);
        for (Integer indice : temp) {
            acharAlunos(indice);
        }
        voltar();
    }

    private void voltar() {
        pai.voltar();
    }

    public void excluir(int id, int idCurso) {
        temp = diretorio.get(idCurso);
        temp.remove(id);
    }

    public ArrayList<Integer> getArrayCursos(int idCurso) {
        return temp = diretorio.get(idCurso);
    }
    
    
    
}
