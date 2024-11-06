import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Setor {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void admitirFuncionario(String matricula, String departamento, String nome, String funcao, double salarioBruto) {
        funcionarios.add(new Funcionario(matricula, departamento, nome, funcao, salarioBruto, null));
        System.out.println(String.format("Funcionário(a) %s admitido(a) com sucesso!", nome));
    }

    public void admitirFuncionario(String matricula, String departamento, String nome, String funcao, double salarioBruto, String INSSref) {
        funcionarios.add(new Funcionario(matricula, departamento, nome, funcao, salarioBruto, INSSref));
        System.out.println(String.format("Funcionário(a) %s admitido(a) com sucesso!", nome));
    }

    public void imprimirFolhaDePagamento() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Depto: " + funcionario.getDepto());
            System.out.println("Função: " + funcionario.getFuncao());
            System.out.println("Terceirizado: " + funcionario.getTerceirizado());
            System.out.println("Salário bruto: " + funcionario.getSalarioBruto());
            System.out.println("Salário líquido: " + funcionario.getSalarioLiquido());
            System.out.println("+++++++++++++++++++++++");
        }
    }

    public double calcularValorBrutoDaFolha() {
        return funcionarios.stream().mapToDouble(Funcionario::getSalarioBruto).sum();
    }

    public Funcionario obterFuncionarioMaisBemPago() {
        return funcionarios.stream().max(Comparator.comparing(Funcionario::getSalarioBruto)).orElse(null);
    }

    public ArrayList<Funcionario> obterFuncionariosPorDepartamento(String departamento) {
        return funcionarios.stream().filter(f -> f.getDepto().equals(departamento)).collect(Collectors.toCollection(ArrayList::new));
    }

    public void listarFuncionariosPorDepartamento(String departamento) {
        System.out.println("Departamento " + departamento);
        for (Funcionario funcionario : obterFuncionariosPorDepartamento(departamento)) {
            System.out.println(funcionario.getNome());
        }
    }
}
