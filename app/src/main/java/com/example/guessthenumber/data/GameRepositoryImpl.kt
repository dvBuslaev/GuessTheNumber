package com.example.guessthenumber.data

import com.example.guessthenumber.domain.entity.GameSettings
import com.example.guessthenumber.domain.entity.Level
import com.example.guessthenumber.domain.entity.Question
import com.example.guessthenumber.domain.repository.GameRepository
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

object GameRepositoryImpl : GameRepository {
    override fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question {
        val sum = Random.nextInt(2, maxSumValue + 1)
        val visibleNumber = Random.nextInt(1, sum)
        val options = hashSetOf<Int>()
        val rightAnswer = sum - visibleNumber
        options.add(rightAnswer)
        val from = max(rightAnswer - countOfOptions, 1)
        val to = min(maxSumValue - 1, rightAnswer + countOfOptions)
        while (options.size < countOfOptions) {
            options.add(Random.nextInt(from, to))

        }
        return Question(sum, visibleNumber, options.toList())
    }

    override fun getGameSettings(level: Level): GameSettings {
        return when (level) {
            Level.TEST -> {
                GameSettings(
                    10, 3, 50, 5
                )

            }
            Level.EASY->{
                GameSettings(10, 3, 50, 5)
            }
            Level.HARD->{
                GameSettings(10, 3, 50, 5)
            }
            Level.MEDIUM->{
                GameSettings(10, 3, 50, 5)
            }


        }
    }

}
