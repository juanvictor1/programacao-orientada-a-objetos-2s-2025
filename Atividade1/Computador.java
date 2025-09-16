package atividade1;

public class Computador {
    private Integer memoriaRAM;
    private Integer SSD;
    private Integer nucleos;
    private Float operacoesPorSegundo;

    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleos, Float operacoesPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public Integer getMemoriaRAM() { return memoriaRAM; }
    public Void setMemoriaRAM(Integer memoriaRAM) { this.memoriaRAM = memoriaRAM; }

    public Integer getSSD() { return SSD; }
    public Void setSSD(Integer SSD) { this.SSD = SSD; }

    public Integer getNucleos() { return nucleos; }
    public Void setNucleos(Integer nucleos) { this.nucleos = nucleos; }

    public Float getOperacoesPorSegundo() { return operacoesPorSegundo; }
    public Void setOperacoesPorSegundo(Float operacoesPorSegundo) { this.operacoesPorSegundo = operacoesPorSegundo; }
}
