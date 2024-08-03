public class Filme extends Entretenimento implements Assistivel{
    private String diretor;
    private int duracao; // duração em minutos

    public Filme(String titulo, String sinopse, double notaIMDB, int porcentagemRottenTomatoes, String diretor, int duracao) {
        super(titulo, sinopse, notaIMDB, porcentagemRottenTomatoes);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }
    @Override
    public void marcarComoAssistido() {
        // Lógica para marcar como assistido
        System.out.println("Filme " + getTitulo() + " marcado como assistido.");
    }

    @Override
    public String getDetalhes() {
        return "Filme: " + getTitulo() + "\nDiretor: " + diretor + "\nDuração: " + duracao + " min";
    }

}
