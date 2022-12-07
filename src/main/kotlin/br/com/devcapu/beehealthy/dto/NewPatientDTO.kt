package br.com.devcapu.beehealthy.dto

import javax.validation.constraints.NotEmpty

data class NewPatientDTO(
    @field:NotEmpty val name: String,
    @field:NotEmpty val email: String,
    val age: Int,
    val weight: Float,
    val height: Float,
    @field:NotEmpty val biologicGender: String,
    @field:NotEmpty val activityLevel: String,
    @field:NotEmpty val objective: String,
)