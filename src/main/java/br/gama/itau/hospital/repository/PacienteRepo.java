package br.gama.itau.hospital.repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.hospital.model.Paciente;

public interface PacienteRepo extends CrudRepository <Paciente, Long>{ // Toda vez q tem <> tem que ser  classe o que estiver dentro

    Paciente findByNome(String nome);

    Paciente findByCpf(String cpf);

}