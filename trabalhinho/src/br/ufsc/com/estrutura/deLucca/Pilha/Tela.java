package br.ufsc.com.estrutura.deLucca.Pilha;

import java.util.Scanner;

public class Tela {
    Scanner scanner = new Scanner(System.in);
    PilhaDoGabrielS pilhaDoGabrielS = new PilhaDoGabrielS();

    public Tela() {
        menu();
    }

    public void menu(){

        int opcao = 0;
        System.out.println(
                        " ______________________________\n" +
                        "|----- Estrutura de Dados -----|\n" +
                        "|------ Sistema de Pilha ------|\n" +
                        "|--- Aluno: Gabriel Saldanha --|\n" +
                        "|---- Matricula: 16102720 -----|\n" +
                        " ______________________________\n"
        );

        while(opcao == 0){
            System.out.println(
                    "\n Escolha a Opção (Pilha de números)\n" +
                            "1 -> Inserir Numero da pilha\n" +
                            "2 -> Tirar Numero da pilha\n" +
                            "3 -> Limpar pilha\n" +
                            "4 -> Mostrar quantidade de itens na pilha\n"
            );
            opcao = this.scanner.nextInt();
            switch (opcao){
                case 1:
                    menuInserir();
                    break;
                case 2:
                    menuTirar();
                    break;
                case 3:
                    menuLimpar();
                    break;
                case 4:
                    mostrarQuantidade();
                    break;
                default:
                    menu();
                    System.out.println("Digite o numero que esteja no menu");
                    break;
            }
        }

    }

    private void menuLimpar() {
    }

    private void mostrarQuantidade() {
        System.out.println("Quantidade de Numeros na pilha é: " + pilhaDoGabrielS.getQuantidade());
        System.out.println("_      _");
        Nodo noPercorrido = pilhaDoGabrielS.getPrimeiro();
        while (noPercorrido != null) {
            System.out.println(" | " + noPercorrido.getNumero().getNumero() + " | ");
            noPercorrido = noPercorrido.getProximo();
        }
        System.out.println(" ------ ");
        menu();
    }

    private void menuInserir() {
        System.out.println("Digite o numero que vai para a pilha");
        this.pilhaDoGabrielS.push(this.scanner.nextInt());
        menu();
    }

    private void menuTirar(){
        System.out.println(pilhaDoGabrielS.pop() ? "Não existia elementos na pilha":"Numero retirado da pilha");
        menu();
    }
}
