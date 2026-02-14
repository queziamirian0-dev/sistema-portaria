package com.quezia.sistema_portaria.dto;

import java.time.LocalDateTime;

public class StatusResponse {

    private String sistema;
    private String status;
    private LocalDateTime dataHora;

    // construtor vazio (obrigatório pro Spring/Jackson)
    public StatusResponse() {
    }

    // construtor com parâmetros
    public StatusResponse(String sistema, String status, LocalDateTime dataHora) {
        this.sistema = sistema;
        this.status = status;
        this.dataHora = dataHora;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
