package com.hospital.hospital.model.DTO;

import com.hospital.hospital.model.entity.Patient;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {

    private Integer id;
    private String name;
    private String gender;
    private String age;
    private String bloodType;


    public  static PatientDTO toDTO(Patient patient){
        return PatientDTO.builder()
                .id(patient.getId())
                .name(patient.getName())
                .age(patient.getAge())
                .bloodType(patient.getBloodType())
                .gender(patient.getGender())
                .build();
    }
}
