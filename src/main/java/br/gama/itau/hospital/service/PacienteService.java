package br.gama.itau.hospital.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.gama.itau.hospital.dto.PacienteDTO;
import br.gama.itau.hospital.model.Paciente;
import br.gama.itau.hospital.repository.PacienteRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // precisa gerar o construtor com os atributos obrigatórios (definidos como final)
public class PacienteService {

    // Outras opções de injeção de dependência, sem usar Autowired
    private final PacienteRepo repo; // final, indica um atributo obrigatório para esta classe

    public Paciente getByNome(String nome) {
        return repo.findByNome(nome);
    }

    public Paciente getByCpf(String cpf) {
        return repo.findByCpf(cpf);
    }

    public List<Paciente> getAll() {

        return (List<Paciente>) repo.findAll();

    }

    public List<PacienteDTO> getAllDTO() {

        List<Paciente> listaPaciente = (List<Paciente>) repo.findAll(); //  eu tenho uma lista de paciente
        List<PacienteDTO> listaPacienteDTO = new ArrayList<> (); // gerar uma ilsta de pacienteDto

        for (Paciente paciente : listaPaciente) { // para cada paciente da minha lista eu quero add na minha lista DTO
            listaPacienteDTO.add(new PacienteDTO(paciente)); // estou transportando todos os pacientes para uma nova lista
        }

        return listaPacienteDTO;

    }


  


}
