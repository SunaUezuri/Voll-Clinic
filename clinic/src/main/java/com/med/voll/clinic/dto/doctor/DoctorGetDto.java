package com.med.voll.clinic.dto.doctor;

import com.med.voll.clinic.model.Doctor;
import com.med.voll.clinic.model.enums.Specialty;

public record DoctorGetDto(
        String name,
        String email,
        String crm,
        Specialty specialty
) {
    public DoctorGetDto(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}
