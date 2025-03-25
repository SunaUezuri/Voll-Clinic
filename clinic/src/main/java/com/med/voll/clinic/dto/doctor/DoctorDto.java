package com.med.voll.clinic.dto.doctor;

import com.med.voll.clinic.dto.address.AddressDto;
import com.med.voll.clinic.model.enums.Specialty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorDto(
                        @NotBlank
                        String name,
                        @NotBlank @Email
                        String email,
                        @NotBlank
                        String contactNumber,
                        @NotBlank @Pattern(regexp = "\\d{4,6}")
                        String crm,
                        @NotNull
                        Specialty specialty,
                        @NotNull @Valid
                        AddressDto address) {
}
