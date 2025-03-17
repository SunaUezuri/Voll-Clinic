package com.med.voll.clinic.model;

import com.med.voll.clinic.model.enums.Specialty;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Using annotatios for better perfomance and practicality
/*
* Loombok annotation gives a way to reduce
* the amount of repetitive code, giving more practicality
* and less time coding repetitive methods
* such as getters, setters and constructors
*/
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_VOLL_DOCTOR")
public class Doctor {

    //Class attributes
    @Id
    private Long id;
    private String name;
    private String email;
    private String crm;
    private Specialty specialty;
    private Address address;
}
