package br.ufsc.com.estrutura.deLucca.Fila;

import java.util.Scanner;

public class Tela {
    Scanner scanner = new Scanner(System.in);
    FilaDoGabrielS filaDoGabrielS = new FilaDoGabrielS();

    public Tela() {
        menu();
    }

    private void menu() {
        int opcao = 0;
        System.out.println(
                        " ______________________________\n" +
                        "|----- Estrutura de Dados -----|\n" +
                        "|------ Sistema de Fila -------|\n" +
                        "|--- Aluno: Gabriel Saldanha --|\n" +
                        "|---- Matricula: 16102720 -----|\n" +
                        " ______________________________\n"
        );

        while(opcao == 0){
            System.out.println(
                    "\n Escolha a Opção (Fila de números)\n" +
                            "1 -> Inserir Numero no Início da Fila\n" +
                            "2 -> Inserir Numero no Fim da Fila\n" +
                            "3 -> Inserir Numero depois de outro na Fila\n" +
                            "4 -> Inserir Numero antes de outro na Fila\n" +
                            "5 -> Remover Numero da Fila\n" +
                            "6 -> Mostrar quantidade de itens na Fila\n"
            );
            opcao = this.scanner.nextInt();
            switch (opcao){
                case 1:
                    menuInserirInicio();
                    break;
                case 2:
                    menuInserirFinal();
                    break;
                case 3:
                    menuInserirDepois();
                    break;
                case 4:
                    menuInserirAntes();
                    break;
                case 6:
                    mostrarTodos();
                    break;
                case 5:
                    menuRemoveDaLista();
                    break;
                default:
                    menu();
                    System.out.println("Digite o numero que esteja no menu");
                    break;
            }
        }

    }

    private void menuRemoveDaLista() {
        if (filaDoGabrielS.ehVazia()){
            System.out.println("Não existem itens na Lista");
        } else {
            System.out.println("Posições disponíveis");
            numerosLista();
            System.out.println("\nDigite a posição que deseja remover");
            filaDoGabrielS.removeDaPosicao(scanner.nextInt());
        }
        menu();

    }

    private void mostrarTodos() {
        System.out.println("Lista de Numeros encadeada");
        Nodo nodoPercorrido = filaDoGabrielS.getPrimeiro();
        if (nodoPercorrido.equals(null)){
            System.out.println("Não há itens na Fila");
        } else {
            while (nodoPercorrido != null) {
                System.out.print("|" + nodoPercorrido.getNumero().getNumero() + "|*|->");
                nodoPercorrido = nodoPercorrido.getProximo();
            }
        }
        System.out.println("");
        menu();
    }

    private void numerosLista(){
            for (int i = 1; i <= filaDoGabrielS.getQuantidade(); i++) {
                System.out.print("[" + i + "] ");
            }
    }

    private void menuInserirAntes() {
        if (filaDoGabrielS.ehVazia()){
            System.out.println("Não existem elementos Numero na Lista");
        }else {
            System.out.println("Digite um Numero para ser inserido antes de outro na Lista");
            int numero = scanner.nextInt();
            System.out.println("Digite a posição desejada");
            numerosLista();
            int posicao = scanner.nextInt();
            filaDoGabrielS.insereAntesDe(posicao, numero);
        }
        menu();
    }

    private void menuInserirDepois() {
        if (filaDoGabrielS.ehVazia()) {
            System.out.println("Não existem elementos Numero na Lista");
        } else {
            System.out.println("Digite um Numero para ser inserido depois de outro na Lista");
            int numero = scanner.nextInt();
            System.out.println("Digite a posição desejada");
            numerosLista();
            int posicao = scanner.nextInt();
            filaDoGabrielS.insereDepoisDe(posicao, numero);
        }
        menu();
    }


    private void menuInserirFinal() {
        System.out.println("Digite um Numero para ser inserido no final da Fila");
        filaDoGabrielS.insereFinal(scanner.nextInt());
        menu();
    }

    private void menuInserirInicio() {
        System.out.println("Digite um Numero para ser inserido no inicio da Fila");
        filaDoGabrielS.ínsereInicio(scanner.nextInt());
        menu();
    }





}
