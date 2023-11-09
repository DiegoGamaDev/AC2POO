import Domain.Cliente;
import Domain.Jogo;
import Domain.JogoPlayStation;
import Domain.JogoSwitch;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogo> ListaJogos = new ArrayList<>();

        Jogo jogo1 = new JogoSwitch(1,"Mario", 8.0, "aventura", "2008");
        Jogo jogo2 = new JogoSwitch(2,"Zelda", 3.0, "aventura", "2009");
        Jogo jogo3 = new JogoSwitch(3,"Stray", 5.0, "aventura", "2022");
        Jogo jogo4 = new JogoPlayStation(4,"God of War", 8.90, "aventura", "2022");
        Jogo jogo5 = new JogoSwitch(5,"Kirby Dream Land", 5.90, "aventura", "2023");

        ListaJogos.add(jogo1);
        ListaJogos.add(jogo2);
        ListaJogos.add(jogo3);
        ListaJogos.add(jogo4);
        ListaJogos.add(jogo5);

        Cliente cliente1 = new Cliente(1,"Daniel Ohata","(11)998755677");
        ArrayList<Jogo> jogosCliente = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int IdJogo;
        double valorLocacao;

        while (escolha != 4) {
            System.out.println("Menu:");
            System.out.println("1 – Alugar");
            System.out.println("2 – Devolver");
            System.out.println("3 – Mostrar");
            System.out.println("4 – Sair");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> {
                    
                    System.out.println(ListaJogos.toString());
                    
                    System.out.println("Digite o Numero de Jogo:");
                    IdJogo = scanner.nextInt();

                    System.out.println("Qual o valor da locacao:");
                    valorLocacao = scanner.nextDouble();

                    for(Jogo jogo : ListaJogos) {
                        if(jogo.getIdJogo() == IdJogo) {
                            jogo.setDisponivel(false);
                            jogo.setValorLocacao(valorLocacao);
                            cliente1.getListaJogos().add(jogo);
                           // cliente1.setListaJogos(jogosCliente);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Digite o Numero de Jogo:");
                    IdJogo = scanner.nextInt();

                    for(Jogo jogo : ListaJogos) {
                        if(jogo.getIdJogo() == IdJogo) {
                            jogo.setDisponivel(true);
                            cliente1.getListaJogos().remove(jogo);
                            //cliente1.setListaJogos(jogosCliente);
                        }
                    }
                }
                case 3 -> {
                    System.out.printf(cliente1.toString());
                }
                case 4 -> System.out.print("Tchau");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

   
}