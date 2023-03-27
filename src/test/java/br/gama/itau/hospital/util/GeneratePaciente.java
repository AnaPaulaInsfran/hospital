package br.gama.itau.hospital.util;

import br.gama.itau.hospital.model.Paciente;

public class GeneratePaciente {
    
    public static Paciente pacienteId1() {
        return Paciente.builder()
        .id(1)
        .nome("Paciente 1")
        .cpf("cpf 1")
        .telefone("fone 1")
        .build();
    }   

    public static Paciente pacienteId2() {
        return Paciente.builder()
        .id(2)
        .nome("Paciente 2")
        .cpf("cpf 2")
        .telefone("fone 2")
        .build();
    }   
}
