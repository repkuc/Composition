package com.repkuc.composition.domain.entity

import java.io.Serializable


data class GameResult (
    val isWon: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
        ): Serializable