package com.quezia.sistema_portaria.controller;

import com.quezia.sistema_portaria.dto.AberturaPortaoRequest;
import com.quezia.sistema_portaria.service.PortariaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portaria")
public class PortariaController {

    private final PortariaService portariaService;

    public PortariaController(PortariaService portariaService) {
        this.portariaService = portariaService;
    }

    @PostMapping("/abrir")
    public String abrirPortao(@RequestBody AberturaPortaoRequest request) {
        return portariaService.abrirPortao(request);
    }
}
