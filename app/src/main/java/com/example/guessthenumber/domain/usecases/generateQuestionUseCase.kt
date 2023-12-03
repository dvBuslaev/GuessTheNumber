package com.example.guessthenumber.domain.usecases

import com.example.guessthenumber.domain.entity.Question
import com.example.guessthenumber.domain.repository.GameRepository

class generateQuestionUseCase(private val repository: GameRepository) {


    operator fun invoke(maxSunValue: Int): Question {
        return repository.generateQuestion(maxSunValue, MAX_NUMBER)

    }

    private companion object {
        private const val MAX_NUMBER = 6
    }
}