package com.med.voll.clinic.model;

import com.med.voll.clinic.dto.PatientDto;
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
    private String name;

    @Column(name = "ds_mail_patient", nullable = false, unique = true)
    private String email;

    @Column(name = "ds_cpf", nullable = false)
    private String cpf;

    @Column(name = "nr_contact_patient")
    private String contactNumber;

    @Embedded
    private Address address;

    public Patient(PatientDto json) {
        this.name = json.name();
        this.email = json.email();
        this.cpf = json.cpf();
        this.contactNumber = json.contactNumber();
        this.address = new Address(json.address());
    }

}
