package com.agromono.service;

import com.agromono.model.Maquinario;
import com.agromono.repository.MaquinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/maquinarios")
@CrossOrigin(origins = "*") // Permite chamadas de qualquer frontend local
public class MaquinarioService {

    @Autowired
    private MaquinarioRepository maquinarioRepository;

    public List<Maquinario> listarMaquinarios() {
        List<Maquinario> lista = maquinarioRepository.findAll();
        LocalDate hoje = LocalDate.now();

        // Ativa o alerta se a data de manutenção for hoje ou já tiver passado
        for (Maquinario m : lista) {
            if (m.getProximaManutencao() != null) {
                m.setAlertaManutencao(!m.getProximaManutencao().isAfter(hoje.plusDays(7)));
            }
        }
        return lista;
    }

    public Maquinario salvarMaquinario(Maquinario maquinario) {
        return maquinarioRepository.save(maquinario);
    }
}