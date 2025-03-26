package com.med.voll.clinic.model;

import com.med.voll.clinic.dto.doctor.DoctorDto;
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
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity @Table(name = "T_VOLL_DOCTOR")
@SequenceGenerator(name = "doctor", sequenceName = "SQ_T_VOLL_DOCTOR", allocationSize = 1)
public class Doctor {

    //Class attributes
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor")
    @Column(name = "id_doctor")
    private Long id;

    @Column(name = "nm_doctor", nullable = false)
    private String name;

    @Column(name = "ds_email", nullable = false, unique = true)
    private String email;

    @Column(name = "nr_contact", nullable = false)
    private String contactNumber;

    @Column(name = "nr_crm", nullable = false)
    private String crm;

    @Enumerated(EnumType.STRING)
    @Column(name = "nm_specialty", nullable = false)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Doctor(DoctorDto json) {
        this.name = json.name();
        this.email = json.email();
        this.contactNumber = json.contactNumber();
        this.crm = json.crm();
        this.specialty = json.specialty();
        this.address = new Address(json.address());
    }
}
