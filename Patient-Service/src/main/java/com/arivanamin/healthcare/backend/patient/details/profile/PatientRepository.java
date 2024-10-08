package com.arivanamin.healthcare.backend.patient.details.profile;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<JpaPatient, UUID> {
    
}
