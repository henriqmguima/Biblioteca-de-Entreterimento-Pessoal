public class Serie extends Entretenimento implements Assistivel{
    private int numeroTemporadas;
    private int numeroEpisodios;

    public Serie(String titulo, String sinopse, double notaIMDB, int porcentagemRottenTomatoes, int numeroTemporadas, int numeroEpisodios) {
        super(titulo, sinopse, notaIMDB, porcentagemRottenTomatoes);
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }
    @Override
    public void marcarComoAssistido() {
        // Lógica para marcar como assistido
        System.out.println("Série " + getTitulo() + " marcada como assistida.");
    }

    @Override
    public String getDetalhes() {
        return "Série: " + getTitulo() + "\nTemporadas: " + numeroTemporadas + "\nEpisódios: " + numeroEpisodios;
    }

}
