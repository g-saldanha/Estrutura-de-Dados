/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholistainvertida.diretorios;

import java.util.ArrayList;
import java.util.HashMap;
import trabalholistainvertida.Cidade;
import trabalholistainvertida.Diretorios;

/**
 *
 * @author Gabriel e José
 */
public class DiretorioCidades {

    private HashMap<Integer, ArrayList<Integer>> diretorio;
    private HashMap<Integer, Cidade> cidades;
    private ArrayList<Integer> temp;
    private Diretorios pai;

    public DiretorioCidades(Diretorios diretorio2) {
        this.diretorio = new HashMap<>();
        this.cidades = new HashMap<>();
        this.temp = new ArrayList<>();
        this.pai = diretorio2;
    }

    public Cidade getCidadeById(int id) {
        return cidades.get(id);
    }

    public void cadCidade(int id, String nome) {
        Cidade cidade = new Cidade(nome, id);
        cidades.put(id, cidade);
        ArrayList<Integer> array = new ArrayList<>();
        diretorio.put(id, array);
    }

    public void listar() {
        for (Cidade cidade : cidades.values()) {
            System.out.println("ID: " + cidade.getId());
            System.out.println("Nome: " + cidade.getNome());
        }
    }

    public void colocarIdAluno(int idCidade, int idAluno) {
        temp = diretorio.get(idCidade);
        temp.add(idAluno);
    }

    public void listarAlunos() {
        for (int i = 1; i < diretorio.size() + 1; i++) {
            ArrayList<Integer> novo = diretorio.get(i);
            System.out.println("Diretorio: " + i);
            for (int indice : novo) {
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

    public void excluir(int id, int idCidade) {
        temp = diretorio.get(idCidade);
        temp.remove(id);
    }
    
    public ArrayList<Integer> getArrayCidades(int idCidade) {
        return temp = diretorio.get(idCidade);
    }

}
