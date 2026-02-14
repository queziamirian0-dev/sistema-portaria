package com.quezia.sistema_portaria.dto;

public class AberturaPortaoRequest {

    private String nomePessoa;

    public AberturaPortaoRequest() {
    }

    public AberturaPortaoRequest(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
}
