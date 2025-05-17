package com.arboleda.footballapp.data.repository.fixtures

import com.arboleda.footballapp.data.remote.fixtures.FixturesApiService
import com.arboleda.footballapp.domain.model.fixtures.FixturesWrapper
import com.arboleda.footballapp.domain.repository.fixtures.FixturesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FixturesRepositoryImpl(
    private val fixturesApiService: FixturesApiService,
) : FixturesRepository {
    override suspend fun getAllLiveFixtures(): Flow<FixturesWrapper> =
        flow {
            try {
                emit(fixturesApiService.getAllLiveFixtures().toDomain())
            } catch (e: Exception) {
                throw e
            }
        }
}
