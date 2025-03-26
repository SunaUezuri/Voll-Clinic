package com.med.voll.clinic.dto.patient;

import com.med.voll.clinic.model.Patient;

public record PatientGetDto(String name, String email, String contactNumber) {
    public PatientGetDto(Patient patient) {
        this(patient.getName(), patient.getEmail(), patient.getContactNumber());
    }
}
