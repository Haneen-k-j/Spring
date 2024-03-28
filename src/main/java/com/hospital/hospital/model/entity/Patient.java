package com.hospital.hospital.model.entity;


import com.hospital.hospital.model.DTO.PatientDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="patient")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String gender;
    private String age;
    @Column(name="blood_type")
    private String bloodType;

public static Patient toEntity (PatientDTO dto){
    return Patient.builder()
            .id(dto.getId())
            .name(dto.getName())
            .age(dto.getAge())
            .gender(dto.getGender())
            .bloodType(dto.getBloodType())
            .build();
}

}
