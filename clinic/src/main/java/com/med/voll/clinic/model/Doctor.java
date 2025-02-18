package com.med.voll.clinic.model;

import com.med.voll.clinic.model.enums.Specialty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Using annotatios for better perfomance and practicality
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    //Class attributes
    private String name;
    private String email;
    private String contact;
    private String crm;
    private Specialty specialty;
    private Address address;
}
