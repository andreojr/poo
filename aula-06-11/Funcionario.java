public class Funcionario {
    private String matricula;
    private String INSSref;
    private String departamento;
    private String nome;
    private String funcao;
    private double salarioBruto;
    private TipoFuncionario tipo;

    public Funcionario(String matricula, String departamento, String nome, String funcao, double salarioBruto, String INSSref) {
        this.matricula = matricula;
        this.departamento = departamento;
        this.nome = nome;
        this.funcao = funcao;
        this.salarioBruto = salarioBruto;
        if (INSSref != null) this.tipo = TipoFuncionario.TERCEIRIZADO;
        else this.tipo = TipoFuncionario.PROPRIO;
        this.INSSref = INSSref;
    }

    public Funcionario(String matricula, String departamento, String nome, String funcao, double salarioBruto) {
        this(matricula, departamento, nome, funcao, salarioBruto, null);
    }

    public String getNome() {
        return nome;
    }

    public String getDepto() {
        return departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getTerceirizado() {
        return tipo == TipoFuncionario.TERCEIRIZADO ? "Sim" : "Não";
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getSalarioLiquido() {
        if (tipo == TipoFuncionario.PROPRIO) {
            return salarioBruto * .9;
        }
        return salarioBruto * .92;
    }
}