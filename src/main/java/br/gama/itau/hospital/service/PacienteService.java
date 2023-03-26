package br.gama.itau.hospital.service;

import org.springframework.stereotype.Service;

import br.gama.itau.hospital.model.Paciente;
import br.gama.itau.hospital.repository.PacienteRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // precisa gerar o construtor com os atributos obrigatórios
public class PacienteService {

    // Outras opções de injeção de dependência, sem usar Autowired
    private final PacienteRepo repo; // final, indica um atributo obrigatório para esta classe

    public Paciente getByNome(String nome) {
        return repo.findByNome(nome);
    }

    public Paciente getByCpf(String cpf) {
        return repo.findByCpf(cpf);
    }
  
    

}
