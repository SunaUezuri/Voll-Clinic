package com.med.voll.clinic.model;

import com.med.voll.clinic.dto.address.AddressDto;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Using annotatios for better perfomance and practicality
@Setter @Getter
@AllArgsConstructor
@Embeddable
public class Address {

    //Class Attributes
    private String logradouro;
    private String neighbourhood;
    private String cep;
    private String city;
    private String uf;
    private String houseNumber;
    private String complement;

    public Address() {}

    public Address(AddressDto json) {
        this.logradouro = json.logradouro();
        this.neighbourhood = json.neighbourhood();
        this.cep = json.cep();
        this.city = json.city();
        this.uf = json.uf();
        this.houseNumber = json.houseNumber();
        this.complement = json.complement();
    }
}
