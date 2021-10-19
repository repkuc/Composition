package com.repkuc.composition.domain.entity

data class GameSettings (
    val maximalSumValue: Int,
    val minimalCountOfRightAnswers: Int,
    val minimalPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
        )