package br.gama.itau.hospital.dto;

import br.gama.itau.hospital.model.Paciente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDTO {

    private String nome;
    private String cpf;
    private String telefone;

    public PacienteDTO(Paciente paciente) {
        this.nome = paciente.getNome();
        this.cpf = paciente.getCpf();
        this.telefone = paciente.getTelefone();
    }
    
}
