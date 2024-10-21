public class Condutor {
    private String nome;
    private String cpf;
    private Integer rg;
    private Carteira carteira;


    public Condutor(String nome, String cpf, Integer rg, Carteira carteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.carteira = carteira;
    }

    // Sem carteira
    public Condutor(String nome, String cpf) {
        this(nome, cpf, null, null);
    }

    public Condutor(String nome, Integer rg) {
        this(nome, null, rg, null);
    }

    // Já tem carteira
    public Condutor(String nome, String cpf, Carteira carteira) {
        this(nome, cpf, null, carteira);
    }

    public Condutor(String nome, Integer rg, Carteira carteira) {
        this(nome, null, rg, carteira);
    }

    // Carteira e condutor
    public Condutor(String nome, String cpf, int numero, boolean ativa, char categoria) {
        this(nome, cpf, null, new Carteira(numero, ativa, categoria));
    }

    public Condutor(String nome, Integer rg, int numero, boolean ativa, char categoria) {
        this(nome, null, rg, new Carteira(numero, ativa, categoria));
    }
}