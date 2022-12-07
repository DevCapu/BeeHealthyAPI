package br.com.devcapu.beehealthy.domain.model

enum class Macro(
    private val caloriesPerGram: Int,
    val dietPercentage: Float
) {
    CARBOHYDRATE(caloriesPerGram = 4, dietPercentage = 0.5f),
    FAT(caloriesPerGram = 9, dietPercentage = .25f),
    PROTEIN(caloriesPerGram = 4, dietPercentage = 0.25f);

    fun totalToPercentage(calories: Double) = caloriesToGrams(calories.times(dietPercentage)).toInt()

    private fun caloriesToGrams(calories: Double) = calories.div(caloriesPerGram)
}