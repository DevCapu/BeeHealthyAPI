package br.com.devcapu.beehealthy.domain.model

enum class Objective(val calories: Double) {
    LOSE(-400.00),
    MAINTAIN(0.0),
    GAIN(300.0)
}