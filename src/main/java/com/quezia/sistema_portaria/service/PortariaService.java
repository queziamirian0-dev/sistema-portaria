package com.quezia.sistema_portaria.service;

import org.springframework.stereotype.Service;
import com.quezia.sistema_portaria.dto.AberturaPortaoRequest;


@Service
public class PortariaService {

    public String abrirPortao(AberturaPortaoRequest request) {
        return "Portão aberto para " + request.getNomePessoa();
    }
}


