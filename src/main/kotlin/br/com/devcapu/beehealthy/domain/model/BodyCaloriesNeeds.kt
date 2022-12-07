package br.com.devcapu.beehealthy.domain.model

data class BodyCaloriesNeeds(
    val bmi: BMI,
    val basalEnergyExpenditure: BasalEnergyExpenditure,
    val totalEnergyExpenditure: TotalEnergyExpenditure,
    val caloriesToCommitObjective: CaloriesToCommitObjective
)