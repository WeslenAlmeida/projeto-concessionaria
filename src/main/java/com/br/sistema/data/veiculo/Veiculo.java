package com.br.sistema.data.veiculo;

public abstract class Veiculo {

    private String chassi;
    private String modelo;
    private String anoFab;
    String placa;



    public String getAnoFab() {
        return anoFab;
    }
    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
