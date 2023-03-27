package br.gama.itau.hospital.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity // Indica na classe que ela será mapeada para o banco
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente {

    @Id // Para indicar um atributo que é chave-primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para indicar que o atributo é um valor auto_incrementável cuja decisão de qual estratégia usar é do banco de dados
    private long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 15, unique = true, nullable = false)
    private String cpf;

    @Column(length = 20, unique = true, nullable = false)
    private String telefone;

    // Um paciente tem vários atendimentos
    // mappedBy indica o atributo da relação na tabela Atendimento
    @OneToMany(mappedBy = "paciente", fetch = FetchType.EAGER)
    // Ao preencher os dados dos atendimentos
    // não preencha os dados do paciente destes atendimentos
    @JsonIgnoreProperties("paciente")
    private List<Atendimento> atendimentos;


    
}
