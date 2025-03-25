package com.med.voll.clinic.dto.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDto(
                         @NotBlank
                         String logradouro,
                         @NotBlank
                         String neighbourhood,
                         @NotBlank @Pattern(regexp = "\\d{8}")
                         String cep,
                         @NotBlank
                         String city,
                         @NotBlank
                         String uf,
                         String houseNumber,
                         String complement) {
}
