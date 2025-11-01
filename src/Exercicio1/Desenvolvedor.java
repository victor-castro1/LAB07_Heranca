package Exercicio1;

public class Desenvolvedor extends Funcionario {
    private String LinguagemPrincipal;
    private float bonusPorProjeto;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemPrincipal, float bonusPorProjeto) {
        super(nome, cpf, salarioBase);
        LinguagemPrincipal = linguagemPrincipal;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bonusPorProjeto;
    }

    @Override
    public void apresentarInformacoes() {
        super.apresentarInformacoes();
        System.out.println("Linguagem Principal:" + LinguagemPrincipal);
        System.out.println("Bônus por projeto: R$ " + String.format("%.2f", bonusPorProjeto));
    }

    public String getLinguagemPrincipal() {
        return LinguagemPrincipal;
    }

    public float getBonusPorProjeto() {
        return bonusPorProjeto;
    }
}
