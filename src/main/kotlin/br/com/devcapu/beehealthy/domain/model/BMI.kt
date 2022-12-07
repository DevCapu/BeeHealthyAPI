package br.com.devcapu.beehealthy.domain.model

import kotlin.math.pow

data class BMI(val value: Double) {
    companion object {
        fun calculate(patient: Patient): BMI {
            val result = patient.weight.div(patient.height.pow(2)).toDouble()
            return BMI(value = result)
        }
    }
}