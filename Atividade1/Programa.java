package atividade1;

public class Programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada() { return memoriaRAMAlocada; }
    public Void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) { this.memoriaRAMAlocada = memoriaRAMAlocada; }

    public Integer getSSDOcupado() { return SSDOcupado; }
    public Void setSSDOcupado(Integer SSDOcupado) { this.SSDOcupado = SSDOcupado; }

    public Integer getNucleos() { return nucleos; }
    public Void setNucleos(Integer nucleos) { this.nucleos = nucleos; }

    public Integer getQuantidadeOperacoes() { return quantidadeOperacoes; }
    public Void setQuantidadeOperacoes(Integer quantidadeOperacoes) { this.quantidadeOperacoes = quantidadeOperacoes; }
}
