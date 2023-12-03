package com.example.guessthenumber.domain.entity

data class Question(val sum: Int, val visibleQuestionNumber: Int, val answerOptions: List<Int>)
