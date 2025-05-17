package com.arboleda.footballapp.domain.usecases.fixtures

import com.arboleda.footballapp.domain.model.fixtures.FixturesWrapper
import com.arboleda.footballapp.domain.repository.fixtures.FixturesRepository
import kotlinx.coroutines.flow.Flow

class GetAllLiveFixtures(
    private val fixturesRepository: FixturesRepository,
) {
    suspend operator fun invoke(): Flow<FixturesWrapper> = fixturesRepository.getAllLiveFixtures()
}
