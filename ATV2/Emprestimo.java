package ATV2;

public class Emprestimo {
    private TomadorEmprestimo tomadorEmprestimo;
    private ItemEmprestavel itemEmprestavel;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, ItemEmprestavel itemEmprestavel, String dataEmprestimo, String dataDevolucao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.itemEmprestavel = itemEmprestavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public TomadorEmprestimo getTomadorEmprestimo() {
        return this.tomadorEmprestimo;
    }

    public void setTomadorEmprestimo(TomadorEmprestimo TomadorEmprestimo) {
        this.tomadorEmprestimo = TomadorEmprestimo;
    }

    public ItemEmprestavel getItemEmprestavel() {
        return this.itemEmprestavel;
    }

    public void setItemEmprestavel(ItemEmprestavel ItemEmprestavel) {
        this.itemEmprestavel = ItemEmprestavel;
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
        System.out.println("TomadorEmprestimo vinculada");
        this.tomadorEmprestimo.exibirInfo();
        System.out.println("ItemEmprestavel vinculado");
        this.itemEmprestavel.descricao();
    }
}
