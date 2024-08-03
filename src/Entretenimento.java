public abstract class Entretenimento {
    private String titulo;
    private String sinopse;
    private double notaIMDB;
    private int porcentagemRottenTomatoes;

    public Entretenimento(String titulo, String sinopse, double notaIMDB, int porcentagemRottenTomatoes) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.notaIMDB = notaIMDB;
        this.porcentagemRottenTomatoes = porcentagemRottenTomatoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public double getNotaIMDB() {
        return notaIMDB;
    }

    public int getPorcentagemRottenTomatoes() {
        return porcentagemRottenTomatoes;
    }
    
}
