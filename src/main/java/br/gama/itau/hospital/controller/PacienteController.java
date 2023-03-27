package br.gama.itau.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gama.itau.hospital.dto.PacienteDTO;
import br.gama.itau.hospital.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    
    @Autowired
    private PacienteService service;

    @GetMapping // anotação para dizer q este método getAll vai ser chamado toda ver
    // que na URL eu colocar /paciente 
    public ResponseEntity<List<PacienteDTO>> getAll() { // ele vai no service e chama o getAll que retorna uma
        // lista de pacientes e devolvo na resposta junto com cód 200 - sucesso

        return ResponseEntity.ok(service.getAllDTO());
    }

    

}
