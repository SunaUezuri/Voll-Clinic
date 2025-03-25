package com.med.voll.clinic.dto.patient;

import com.med.voll.clinic.dto.address.AddressDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record PatientDto(
                          @NotBlank
                          String name,
                          @NotBlank @Email
                          String email,
                          @NotBlank @Pattern(regexp = "\\d{11}")
                          String cpf,
                          @NotBlank
                          String contactNumber,
                          @NotNull @Valid
                          AddressDto address) {
}
