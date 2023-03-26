package br.gama.itau.hospital.repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.hospital.model.Atendimento;

public interface AtendimentoRepo extends CrudRepository<Atendimento, Long>{
    
}
