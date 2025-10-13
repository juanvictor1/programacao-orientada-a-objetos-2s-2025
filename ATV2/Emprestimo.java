package ATV2;

public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa Pessoa) {
        this.pessoa = Pessoa;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material Material) {
        this.material = Material;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes(){
        System.out.println("Data do emprestimo: " + this.dataEmprestimo);
        System.out.println("Data de devolução: " + this.dataDevolucao);
        System.out.println("Pessoa vinculada");
        this.pessoa.exibirInfo();
        System.out.println("Material vinculado");
        this.material.descricao();
    }
}
