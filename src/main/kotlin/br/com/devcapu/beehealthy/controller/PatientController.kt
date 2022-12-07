package br.com.devcapu.beehealthy.controller

import br.com.devcapu.beehealthy.domain.model.Patient
import br.com.devcapu.beehealthy.dto.NewPatientDTO
import br.com.devcapu.beehealthy.service.PatientService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/patient")
class PatientController(private val service: PatientService) {
    @PostMapping
    fun register(@RequestBody @Valid patient: NewPatientDTO): ResponseEntity<List<Patient>> {
        service.register(patient)
        return ResponseEntity.status(CREATED).body(service.getAll())
    }
}