package com.example.jetpackcomposeapi.data.remote
import com.example.jetpackcomposeapi.data.remote.model.GameModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GamesService @Inject constructor(private val gamesAPi: GamesAPi) {
    suspend fun getGames(): List<GameModel> {
        return withContext(Dispatchers.IO) {
            val games = gamesAPi.getGames()
            games.body() ?: emptyList()
        }
    }
}