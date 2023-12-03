package com.example.guessthenumber.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfGuesses: Int,
    val minPercentageOfRightAnswers: Int,
    val gameTimeSettings: Int
)