package com.med.voll.clinic.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Using annotatios for better perfomance and practicality
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    //Class Attributes
    private String logradouro;
    private String neighborhood;
    private String cep;
    private String city;
    private String uf;
    private int number;
    private String complement;

}
