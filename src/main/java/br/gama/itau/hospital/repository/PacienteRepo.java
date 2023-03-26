package br.gama.itau.hospital.repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.hospital.model.Paciente;

public interface PacienteRepo extends CrudRepository <Paciente, Long>{

    
}