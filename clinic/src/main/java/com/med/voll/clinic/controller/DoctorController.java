package com.med.voll.clinic.controller;

import com.med.voll.clinic.dto.DoctorDto;
import com.med.voll.clinic.model.Doctor;
import com.med.voll.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    //This annotation makes the Spring the one who'll make the instance of the class
    @Autowired
    private DoctorRepository repository;

    //Using annotation Post to register a doctor
    @PostMapping
    @Transactional
    public void register(@RequestBody DoctorDto json) {
        repository.save(new Doctor(json));
    }

}
