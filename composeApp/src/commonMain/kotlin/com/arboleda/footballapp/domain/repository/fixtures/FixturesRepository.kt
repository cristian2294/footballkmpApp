package com.arboleda.footballapp.domain.repository.fixtures

import com.arboleda.footballapp.domain.model.fixtures.FixturesWrapper
import kotlinx.coroutines.flow.Flow

interface FixturesRepository {
    suspend fun getAllLiveFixtures(): Flow<FixturesWrapper>
}
