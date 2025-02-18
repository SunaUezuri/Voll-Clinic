package com.med.voll.clinic.dto;

import com.med.voll.clinic.model.enums.Specialty;

public record DoctorDto(String name,
                        String email,
                        String crm,
                        Specialty specialty,
                        AddressDto address) {
}
