package com.med.voll.clinic.controller;

import com.med.voll.clinic.dto.patient.PatientDto;
import com.med.voll.clinic.dto.patient.PatientGetDto;
import com.med.voll.clinic.model.Patient;
import com.med.voll.clinic.repository.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid PatientDto json) {
        repository.save(new Patient(json));
    }

    @GetMapping
    public Page<PatientGetDto> list(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable) {
        return repository.findAll(pageable).map(PatientGetDto::new);
    }
}
