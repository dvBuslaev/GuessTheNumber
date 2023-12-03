package com.example.guessthenumber.domain.usecases

import com.example.guessthenumber.domain.entity.GameSettings
import com.example.guessthenumber.domain.entity.Level
import com.example.guessthenumber.domain.entity.Question
import com.example.guessthenumber.domain.repository.GameRepository

class getGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)

    }
}