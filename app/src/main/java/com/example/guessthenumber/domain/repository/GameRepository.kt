package com.example.guessthenumber.domain.repository

import com.example.guessthenumber.domain.entity.GameSettings
import com.example.guessthenumber.domain.entity.Level
import com.example.guessthenumber.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue:Int,
        countOfOptions:Int
    ):Question
    fun getGameSettings(level:Level):GameSettings
}