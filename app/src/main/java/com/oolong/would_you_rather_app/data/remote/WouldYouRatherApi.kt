package com.oolong.would_you_rather_app.data.remote

import retrofit2.http.GET

interface WouldYouRatherApi {

    @GET("?id=1")
    suspend fun getQuestion(): QuestionModel

    companion object {
        const val BASE_URL = "https://would-you-rather-api.abaanshanid.repl.co/"
    }
}