package com.med.voll.clinic.model;

import com.med.voll.clinic.dto.patient.PatientDto;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
