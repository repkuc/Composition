package com.repkuc.composition.domain.usecases

import com.repkuc.composition.domain.entity.GameSettings
import com.repkuc.composition.domain.entity.Level
import com.repkuc.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings{
           return repository.getGameSettings(level)
    }

}