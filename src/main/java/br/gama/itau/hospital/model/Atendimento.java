package br.gama.itau.hospital.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long atendimentoId;

    @Column(length = 20, nullable = false)
    private LocalDate date;

    @Column(length = 100, nullable = false)
    private String exame;

    @Column(length = 100)
    private String remedio;

    // vários atendimentos para um paciente
    @ManyToOne
    // nome da coluna que é chave estrangeira (FK)
    @JoinColumn(name = "id_paciente")
    // ao preencher os dados do paciente, não preencha os atendimentos
    // deste paciente
    @JsonIgnoreProperties("atendimentos")
    private Paciente paciente;

    
}
