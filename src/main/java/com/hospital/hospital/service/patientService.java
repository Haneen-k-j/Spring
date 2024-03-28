package com.hospital.hospital.service;

import com.hospital.hospital.model.DTO.PatientDTO;
import com.hospital.hospital.model.entity.Patient;
import com.hospital.hospital.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class patientService {

    @Autowired
    private PatientRepo patientRepo;
    // get patient by id
    public PatientDTO getPatient(Integer id){
        Optional<Patient> patient=this.patientRepo.findById(id);
        return patient.map(PatientDTO::toDTO).orElse(null);
    }

    public List<Patient>  getAllPatient(){
        List<Patient> patient=this.patientRepo.findAll();
        return patient;
    }
    public PatientDTO savePatient(PatientDTO patient){
        return  PatientDTO.toDTO(patientRepo.save(Patient.toEntity(patient)));

    }
    public void delete(Integer id){
        this.patientRepo.deleteById(id);
    }

}
