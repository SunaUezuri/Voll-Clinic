package com.med.voll.clinic.controller;

import com.med.voll.clinic.dto.DoctorDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    //Using annotation Post to register a doctor
    @PostMapping
    public void register(@RequestBody DoctorDto json) {
        System.out.println(json);
    }

}
