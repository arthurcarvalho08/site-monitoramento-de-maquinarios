package com.agromono.controller;

import com.agromono.model.Maquinario;
import com.agromono.service.MaquinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maquinarios")
@CrossOrigin(origins = "*")
public class MaquinarioController {

    @Autowired
    private MaquinarioService maquinarioService;

    @GetMapping
    public List<Maquinario> listarTodos() {
        return maquinarioService.listarMaquinarios();
    }

    @PostMapping
    public Maquinario cadastrar(@RequestBody Maquinario maquinario) {
        return maquinarioService.salvarMaquinario(maquinario);
    }
}