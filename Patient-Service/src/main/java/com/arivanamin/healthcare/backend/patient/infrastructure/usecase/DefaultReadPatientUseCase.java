package com.arivanamin.healthcare.backend.patient.infrastructure.usecase;

import com.arivanamin.healthcare.backend.patient.domain.entity.Patient;
import com.arivanamin.healthcare.backend.patient.domain.persistence.PatientPersistence;
import com.arivanamin.healthcare.backend.patient.domain.usecase.ReadPatientUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class DefaultReadPatientUseCase implements ReadPatientUseCase {
    
    private final PatientPersistence persistence;
    
    @Override
    public List<Patient> executeFindAll () {
        return persistence.getAllPatients();
    }
    
    @Override
    public Optional<Patient> executeFindById (UUID id) {
        return persistence.getPatientById(id);
    }
}
