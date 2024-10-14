class Impressora {
    private String fabricante;
    private String modelo;
    private int capacidadeDeImpressaoEmPaginas;
    private String tecnologia;
    private float velocidade;

    public Impressora(String fabricante, String modelo, int capacidadeDeImpressaoEmPaginas, String tecnologia, float velocidade) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidadeDeImpressaoEmPaginas = capacidadeDeImpressaoEmPaginas;


        if (!tecnologia.equals("JATO DE TINTA") && !tecnologia.equals("LASER") && !tecnologia.equals("MATRICIAL")) {
            throw new Error("Tecnologia inválida");
        }
        this.tecnologia = tecnologia;
        this.velocidade = velocidade;
    }

    public float calcularTempoDeImpressao(float numeroDePaginas) {
        return numeroDePaginas / this.velocidade;
    }

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public int obterCapacidadeAtual() {
        return this.capacidadeDeImpressaoEmPaginas;
    }
}