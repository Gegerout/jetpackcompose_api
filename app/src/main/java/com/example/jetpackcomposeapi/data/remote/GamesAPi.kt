package com.example.jetpackcomposeapi.data.remote

import com.example.jetpackcomposeapi.data.remote.model.GamesModel
import com.example.jetpackcomposeapi.utils.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface GamesAPi {
    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GamesModel>>
}