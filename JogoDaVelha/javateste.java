package JogoDaVelha;

import java.util.Scanner;

public class javateste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        System.out.println("Bem-vindo ao Jogo da Velha!");

        while (true) {
            exibirTabuleiro(jogo.getTabuleiro());
            System.out.print("Jogador " + jogo.getJogadorAtual() + ", digite a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Jogador " + jogo.getJogadorAtual() + ", digite a coluna (0-2): ");
            int coluna = scanner.nextInt();

            jogo.jogar(linha, coluna);

            if (jogo.verificarVencedor()) {
                exibirTabuleiro(jogo.getTabuleiro());
                System.out.println("Jogador " + jogo.getJogadorAtual() + " venceu!");
                break;
            } else if (jogo.verificarEmpate()) {
                exibirTabuleiro(jogo.getTabuleiro());
                System.out.println("Empate!");
                break;
            }
        }

        scanner.close();
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }
}