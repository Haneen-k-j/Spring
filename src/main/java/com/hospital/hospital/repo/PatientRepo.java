package com.hospital.hospital.repo;

import com.hospital.hospital.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
