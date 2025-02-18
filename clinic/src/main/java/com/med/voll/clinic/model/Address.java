package com.med.voll.clinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Using annotatios for better perfomance and practicality
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    //Class Attributes
    private int number;
    private String logradouro;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf;
    private String cep;
}
