package com.example.guessthenumber.domain.entity

data class GameResault (
    val isWinner: Boolean,
    val guestNumber:Int,
    val totalQuestions:Int,
    val gameSettings: GameSettings
)