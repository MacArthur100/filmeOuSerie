import java.util.Scanner;

public class filmeOuSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Filme");
        System.out.println("2 - Série");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner

        // Usando switch para tratar a escolha do usuário
        switch (escolha) {
            case 1: // Caso o usuário escolha Filme
                String[] filmeFavorito = new String[4];

                System.out.println("Digite os 4 filmes favoritos:");

                // Ler os 4 filmes
                for (int i = 0; i < 4; i++) {
                    System.out.println("Digite o " + (i + 1) + "º filme:");
                    filmeFavorito[i] = scanner.nextLine();
                }

                // Exibir os filmes escolhidos
                System.out.println("Você escolheu Filme. Seus filmes favoritos são:");
                for (String filme : filmeFavorito) {
                    System.out.println(filme);
                }
                break;

            case 2: // Caso o usuário escolha Série
                String[] serieFavorita = new String[5];

                System.out.println("Digite as 5 séries favoritas:");

                // Ler as 5 séries
                for (int i = 0; i < 5; i++) {
                    System.out.println("Digite a " + (i + 1) + "ª série:");
                    serieFavorita[i] = scanner.nextLine();
                }

                // Exibir as séries escolhidas
                System.out.println("Você escolheu Série. Suas séries favoritas são:");
                for (String serie : serieFavorita) {
                    System.out.println(serie);
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}