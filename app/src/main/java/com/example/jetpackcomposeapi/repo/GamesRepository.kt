package com.example.jetpackcomposeapi.repo

import com.example.jetpackcomposeapi.data.remote.GamesService
import com.example.jetpackcomposeapi.domain.item.GameItem
import com.example.jetpackcomposeapi.domain.item.toGameItem
import javax.inject.Inject

class GamesRepository @Inject constructor(private val gamesService: GamesService) {
    suspend fun getGames(): List<GameItem> {
        return gamesService.getGames().map {
            it.toGameItem()
        }
    }
}