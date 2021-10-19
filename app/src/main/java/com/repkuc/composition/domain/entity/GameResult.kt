package com.repkuc.composition.domain.entity


data class GameResult (
    val isWon: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
        )