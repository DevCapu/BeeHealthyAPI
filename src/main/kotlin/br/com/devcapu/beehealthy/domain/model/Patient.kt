package br.com.devcapu.beehealthy.domain.model

data class Patient(
    val name: String,
    val email: Email,
    val age: Int,
    val weight: Float,
    val height: Float,
    val biologicGender: BiologicalGender,
    val activityLevel: ActivityLevel,
    val objective: Objective,
    val bodyCaloriesNeeds: BodyCaloriesNeeds?,
)