package com.repkuc.composition.domain.repository

import com.repkuc.composition.domain.entity.GameSettings
import com.repkuc.composition.domain.entity.Level
import com.repkuc.composition.domain.entity.Question

interface GameRepository {

     fun generateQuestion(
         maxSumValue:Int,
         countOfOptions: Int
     ): Question

     fun getGameSettings(level: Level): GameSettings

}