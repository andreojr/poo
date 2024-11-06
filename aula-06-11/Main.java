public class Main {
    public static void main(String[] args) {
        Setor setor = new Setor();

        System.out.println("b...");

        // Adriano
        String matricula = "cm368gola000008kvghy1hmgz";
        String departamento = "TI";
        String nome = "Adriano";
        String funcao = "Técnico em Redes Sênior";
        double salarioBruto = 4835.89;

        setor.admitirFuncionario(matricula, departamento, nome, funcao, salarioBruto);

        // Isabela
        matricula = "cm368loa5000108kv2gxz0vhc";
        departamento = "Administração";
        nome = "Isabela";
        funcao = "Supervisora";
        salarioBruto = 5768.12;
        String INSSref = "387c48b6-539e-4dea-942b-0b1b18c47beb";

        setor.admitirFuncionario(matricula, departamento, nome, funcao, salarioBruto, INSSref);

        // Ronaldinho Gaúcho
        matricula = "cm3698d8u000008mq4xdnbwxh";
        departamento = "Esportivo";
        nome = "Ronaldinho";
        funcao = "Jogador de Futebol";
        salarioBruto = 566789;

        setor.admitirFuncionario(matricula, departamento, nome, funcao, salarioBruto);

        System.out.println("c...");

        setor.imprimirFolhaDePagamento();

        System.out.println("d...");

        System.out.println("Valor total: R$ " + setor.calcularValorBrutoDaFolha());

        System.out.println("e...");

        System.out.println("Funcionário com maior salário: " + setor.obterFuncionarioMaisBemPago().getNome());

        System.out.println("f...");

        setor.listarFuncionariosPorDepartamento("Administração");
    }
}
