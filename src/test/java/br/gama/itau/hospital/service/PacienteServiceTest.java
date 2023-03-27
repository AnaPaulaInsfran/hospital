package br.gama.itau.hospital.service;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.gama.itau.hospital.model.Paciente;
import br.gama.itau.hospital.repository.PacienteRepo;
import br.gama.itau.hospital.util.GeneratePaciente;

@ExtendWith(MockitoExtension.class)
public class PacienteServiceTest {
    
    @InjectMocks
    private PacienteService service; //  o que vou testar

    @Mock
    private PacienteRepo repo; // o que vou mockar

    @Test
    public void getAll_returnListPacient_whenPacientExist() {

        // preparação
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(GeneratePaciente.pacienteId1());
        pacientes.add(GeneratePaciente.pacienteId2());

        BDDMockito.when(repo.findAll()).thenReturn(pacientes);

        // ação

        List<Paciente> listaRecuperada =  service.getAll();

        assertThat(listaRecuperada).isNotNull();
        assertThat(listaRecuperada).isNotEmpty();
        // testa o id do primeiro elemento (paciente) da lista
        assertThat(listaRecuperada.get(0).getId()).isEqualTo(GeneratePaciente.pacienteId1().getId());

    }

}
