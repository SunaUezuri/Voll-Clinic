package com.med.voll.clinic.model;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity @Table(name = "T_VOLL_PATIENT")
@SequenceGenerator(name = "patient", sequenceName = "SQ_T_VOLL_PATIENT", allocationSize = 1)
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient")
    @Column(name = "id_patient")
    private Long id;

    @Column(name = "nm_patient", nullable = false)
    private String nome;

    @Column(name = "nm_patient", nullable = false)
    private String email;

    @Column(name = "ds_cpf", nullable = false)
    private String cpf;

    @Column(name = "nr_contact_patient")
    private String contactNumber;

    @Embedded
    private Address address;

}
