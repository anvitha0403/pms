package com.prod.patient_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientServiceController {

    @RequestMapping("")
    public ResponseEntity<String> getPatient() {

        return ResponseEntity.ok().body("done");

    }

}
