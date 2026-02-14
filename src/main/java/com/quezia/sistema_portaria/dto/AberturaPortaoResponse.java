package com.quezia.sistema_portaria.dto;

import java.time.LocalDateTime;

public class AberturaPortaoResponse {

    private String mensagem;
    private LocalDateTime dataHora;

    public AberturaPortaoResponse(String mensagem, LocalDateTime dataHora) {
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
