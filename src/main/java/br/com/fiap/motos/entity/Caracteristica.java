package br.com.fiap.motos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TB_CARACTERISTICA",

        uniqueConstraints = {

                @UniqueConstraint(
                        name = "UK_CARACTERISTICA_NOME_VEICULO", columnNames = {"NOME", "VEICULO"}
                )
        }

)
public class Caracteristica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CARACTERISTICA")
    @SequenceGenerator(name = "SQ_CARACTERISTICA", sequenceName = "SQ_CARACTERISTICA", allocationSize = 1)
    @Column(name = "ID_CARACTERISTICA")
    private Long id;


    @Column(name = "NOME")
    private String nome;


    @Column(name = "DESC")
    private String descricao;

    @Column(name = "VEICULO")
    private Veiculo veiculo;


}