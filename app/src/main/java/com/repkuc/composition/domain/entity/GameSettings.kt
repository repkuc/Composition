package com.repkuc.composition.domain.entity

import java.io.Serializable

data class GameSettings (
    val maximalSumValue: Int,
    val minimalCountOfRightAnswers: Int,
    val minimalPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
        ): Serializable