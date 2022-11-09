package com.Bancolombia.Clientes.Modelos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {

    @Id
    @SequenceGenerator(
            name = "cliente_sequence",
            sequenceName = "cliente_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cliente_sequence"
    )
    @Column(name = "cliente_id", columnDefinition = "TINYINT")
    private Integer clienteId;

    @Column(name = "nombre_completo", nullable = false, columnDefinition = "VARCHAR(250)")
    private String nombreCompleto;

    @Column(nullable = false)
    private Double saldo;
}
