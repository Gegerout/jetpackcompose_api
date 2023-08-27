package com.example.jetpackcomposeapi.domain

import com.example.jetpackcomposeapi.domain.item.GameItem
import com.example.jetpackcomposeapi.repo.GamesRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gamesRepository: GamesRepository) {
    suspend operator fun invoke(): List<GameItem> {
        return gamesRepository.getGames().shuffled()
    }
}