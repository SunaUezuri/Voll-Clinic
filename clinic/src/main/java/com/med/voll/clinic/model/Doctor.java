package com.med.voll.clinic.model;

import com.med.voll.clinic.model.enums.Specialty;
import jakarta.persistence.*;
import lombok.*;

//Using annotatios for better perfomance and practicality
/*
* Loombok annotation gives a way to reduce
* the amount of repetitive code, giving more practicality
* and less time coding repetitive methods
* such as getters, setters and constructors
*/
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "T_VOLL_DOCTOR")
public class Doctor {

    //Class attributes
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
    private Long id;

    @Column(name = "nm_doctor", nullable = false)
    private String name;

    @Column(name = "ds_email", nullable = false)
    private String email;

    @Column(name = "nr_crm", nullable = false)
    private String crm;

    @Enumerated(EnumType.STRING)
    @Column(name = "nm_speacialty", nullable = false)
    private Specialty specialty;

    @Embedded
    @Column(name = "dc_address")
    private Address address;
}
