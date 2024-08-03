import java.util.Scanner;

public class BibliotecaApp {
    public static void limparTela() {
        // Sequência de escape ANSI para limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        BibliotecaDeEntretenimento biblioteca = new BibliotecaDeEntretenimento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            limparTela();
            System.out.println("Biblioteca de Entretenimento");
            System.out.println("1. Listar filmes");
            System.out.println("2. Listar séries");
            System.out.println("3. Mostrar itens assistidos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            limparTela();
            switch (opcao) {
                case 1:
                    biblioteca.listarFilmes();
                    System.out.print("Escolha um filme para ver detalhes ou 0 para voltar: ");
                    int filmeEscolhido = scanner.nextInt();
                    if (filmeEscolhido > 0) {
                        limparTela();
                        Filme filme = biblioteca.getFilme(filmeEscolhido - 1);
                        if (filme != null) {
                            System.out.println("Título: " + filme.getTitulo());
                            System.out.println("Sinopse: " + filme.getSinopse());
                            System.out.println("Nota IMDB: " + filme.getNotaIMDB());
                            System.out.println("Porcentagem Rotten Tomatoes: " + filme.getPorcentagemRottenTomatoes());
                            System.out.print("Marcar como assistido? (s/n): ");
                            char assistido = scanner.next().charAt(0);
                            if (assistido == 's' || assistido == 'S') {
                                biblioteca.adicionarAssistido(filme);
                                System.out.println("Filme marcado como assistido.");
                            }
                        } else {
                            System.out.println("Filme inválido.");
                        }
                    }
                    System.out.println("Pressione Enter para continuar...");
                    try { System.in.read(); } catch(Exception e) {}
                    break;
                case 2:
                    biblioteca.listarSeries();
                    System.out.print("Escolha uma série para ver detalhes ou 0 para voltar: ");
                    int serieEscolhida = scanner.nextInt();
                    if (serieEscolhida > 0) {
                        limparTela();
                        Serie serie = biblioteca.getSerie(serieEscolhida - 1);
                        if (serie != null) {
                            System.out.println("Título: " + serie.getTitulo());
                            System.out.println("Sinopse: " + serie.getSinopse());
                            System.out.println("Nota IMDB: " + serie.getNotaIMDB());
                            System.out.println("Porcentagem Rotten Tomatoes: " + serie.getPorcentagemRottenTomatoes());
                            System.out.print("Marcar como assistido? (s/n): ");
                            char assistido = scanner.next().charAt(0);
                            if (assistido == 's' || assistido == 'S') {
                                biblioteca.adicionarAssistido(serie);
                                System.out.println("Série marcada como assistida.");
                            }
                        } else {
                            System.out.println("Série inválida.");
                        }
                    }
                    System.out.println("Pressione Enter para continuar...");
                    try { System.in.read(); } catch(Exception e) {}
                    break;
                case 3:
                    biblioteca.listarAssistidos();
                    System.out.println("Pressione Enter para continuar...");
                    try { System.in.read(); } catch(Exception e) {}
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("Pressione Enter para continuar...");
                    try { System.in.read(); } catch(Exception e) {}
            }
        }
    }
}
