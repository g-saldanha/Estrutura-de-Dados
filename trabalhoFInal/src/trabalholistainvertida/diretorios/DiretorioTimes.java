/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholistainvertida.diretorios;

import java.util.ArrayList;
import java.util.HashMap;
import trabalholistainvertida.Diretorios;
import trabalholistainvertida.Time;

/**
 *
 * @author Gabriel e José
 */
public class DiretorioTimes {
    
    private HashMap<Integer, ArrayList<Integer>> diretorio;
    private HashMap<Integer, Time> times;
    private ArrayList<Integer> temp;
    private Diretorios pai;
    
    public DiretorioTimes(Diretorios diretorio) {
        this.diretorio = new HashMap<>();
        this.times = new HashMap<>();
        this.temp = new ArrayList<>();
        this.pai = diretorio;
    }
    
    public Time getTimeById(int id) {
        return times.get(id);
    }
    
    public ArrayList<Integer> getArrayTimes(int id) {
        return temp = diretorio.get(id);
    }

    public void cadTime(int id, String nome) {
        Time time = new Time(nome, id);
        times.put(id, time);
        ArrayList<Integer> array = new ArrayList<>();
        diretorio.put(id, array);
    }
    
    
    public void listar() {
        for (Time time: times.values()) {
            System.out.println("ID: " + time.getId());
            System.out.println("Nome: " + time.getNome());
        }
    }

    public void colocarIdAluno(int idTime, int idAluno) {
        temp = diretorio.get(idTime);
        temp.add(idAluno);
    }

    public void listarAlunos() {
        for (int i = 1; i < diretorio.size()+1 ; i++) {
            ArrayList<Integer> novo = diretorio.get(i);
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
        for(Integer indice : temp) {
            acharAlunos(indice);
        }
        voltar();
    }

    private void voltar() {
        pai.voltar();
    }

    public void excluir(int id, int idTime) {
        temp = diretorio.get(idTime);
        temp.remove(id);
    }
}
