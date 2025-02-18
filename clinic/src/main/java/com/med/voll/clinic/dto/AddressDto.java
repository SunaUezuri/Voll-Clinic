package com.med.voll.clinic.dto;

public record AddressDto(String logradouro,
                         String neighbourhood,
                         String cep,
                         String city,
                         String uf,
                         String number,
                         String complement) {
}
