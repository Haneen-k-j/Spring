package com.hospital.hospital.controller;
import com.hospital.hospital.model.DTO.PatientDTO;
import com.hospital.hospital.model.entity.Patient;
import com.hospital.hospital.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")
public class PatientController {

    @Autowired
    private patientService patientService;

    @GetMapping("/get-Patient")
    public PatientDTO getPatient(@RequestParam Integer id){
        return patientService.getPatient(id);
    }


    @GetMapping("/get-AllPatient")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();
    }

    @PostMapping("/save-patient")
    public PatientDTO save(@RequestBody PatientDTO patient)
    {
        return patientService.savePatient(patient);
    }


    @PostMapping("/update-patient")
    public PatientDTO update(@RequestBody PatientDTO patient){
        return patientService.savePatient(patient);
    }


    @GetMapping("/delete-patient")
    public void delete(@RequestParam Integer id){
        patientService.delete(id);
    }
}
