package com.arboleda.footballapp.data.remote.fixtures

import com.arboleda.footballapp.core.Contracts.ALL_LIVE_FIXTURES
import com.arboleda.footballapp.data.model.fixtures.FixturesWrapper
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class FixturesApiService(
    private val client: HttpClient,
) {
    suspend fun getAllLiveFixtures(): FixturesWrapper = client.get(ALL_LIVE_FIXTURES) { parameter("live", "all") }.body()
}
