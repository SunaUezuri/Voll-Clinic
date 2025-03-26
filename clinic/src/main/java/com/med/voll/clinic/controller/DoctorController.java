package com.med.voll.clinic.controller;

import com.med.voll.clinic.dto.doctor.DoctorDto;
import com.med.voll.clinic.dto.doctor.DoctorGetDto;
import com.med.voll.clinic.model.Doctor;
import com.med.voll.clinic.repository.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    //This annotation makes the Spring the one who'll make the instance of the class
    @Autowired
    private DoctorRepository repository;

    //Using annotation Post to register a doctor
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid DoctorDto json) {
        repository.save(new Doctor(json));
    }

    @GetMapping
    public Page<DoctorGetDto> list(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable) {
        return repository.findAll(pageable).map(DoctorGetDto::new);
    }
}
