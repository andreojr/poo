public class Filme {
    private String titulo;
    private String ator;
    private int lancamento;
    private int qtdCopias;

    public Filme(String titulo, String ator, int lancamento, int qtdCopias) {
        this.titulo = titulo;
        this.ator = ator;
        this.lancamento = lancamento;
        this.qtdCopias = qtdCopias;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAtor() {
        return this.ator;
    }
    
    public void setAtor(String ator) {
        this.ator = ator;
    }
    
    public int getLancamento() {
        return this.lancamento;
    }
    
    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }
    
    public int getQtdCopias() {
        return this.qtdCopias;
    }
    
    public void setQtdCopias(int qtdCopias) {
        this.qtdCopias = qtdCopias;
    }

    public void getInfo() {
        System.out.println(
            String.format(
                "Título: %s\nAtor: %s\nAno de lançamento: %d\nQuantidade de cópias: %d",
                this.titulo,
                this.ator,
                this.lancamento,
                this.qtdCopias
            )
        );
    }
}