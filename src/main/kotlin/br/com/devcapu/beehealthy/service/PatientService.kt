package br.com.devcapu.beehealthy.service

import br.com.devcapu.beehealthy.domain.model.*
import br.com.devcapu.beehealthy.dto.NewPatientDTO
import org.springframework.stereotype.Service

@Service
class PatientService(
    private val patients: MutableList<Patient> = mutableListOf()
) {
    fun register(newPatientDTO: NewPatientDTO) {
        patients.add(
            Patient(
                name = newPatientDTO.name,
                email = Email(address = newPatientDTO.email),
                age = newPatientDTO.age,
                weight = newPatientDTO.weight,
                height = newPatientDTO.height,
                biologicGender = BiologicalGender.valueOf(newPatientDTO.biologicGender),
                activityLevel = ActivityLevel.valueOf(newPatientDTO.activityLevel),
                objective = Objective.valueOf(newPatientDTO.objective),
            )
        )
    }

    fun getAll(): List<Patient> = patients.toList()
}
