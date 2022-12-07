package br.com.devcapu.beehealthy.domain.usecase

import br.com.devcapu.beehealthy.domain.model.*

class CalculateCaloriesNeedsUseCase {

    operator fun invoke(patient: Patient): BodyCaloriesNeeds {
        val bmi = BMI.calculate(patient)
        val basalEnergyExpenditure = BasalEnergyExpenditure.calculate(patient)
        val totalEnergyExpenditure = TotalEnergyExpenditure.calculate(basalEnergyExpenditure, patient.activityLevel)
        val caloriesToCommitObjective = CaloriesToCommitObjective.calculate(totalEnergyExpenditure, patient.objective)

        return BodyCaloriesNeeds(
            bmi = bmi,
            basalEnergyExpenditure = basalEnergyExpenditure,
            totalEnergyExpenditure = totalEnergyExpenditure,
            caloriesToCommitObjective = caloriesToCommitObjective
        )
    }
}