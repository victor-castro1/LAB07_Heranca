package Exercicio1;

public class Gerente extends Funcionario {
    private String departamento;
    private int bonificacaoPercentual;

    public Gerente(String nome, String cpf, double salarioBase, String departamento, int bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + (salarioBase * bonificacaoPercentual/100);
    }

    @Override
    public void apresentarInformacoes() {
        super.apresentarInformacoes();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bonificação: " + bonificacaoPercentual + "%");
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBonificacaoPercentual() {
        return bonificacaoPercentual;
    }
}
