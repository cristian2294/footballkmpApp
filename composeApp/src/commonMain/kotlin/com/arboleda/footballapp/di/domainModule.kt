package com.arboleda.footballapp.di

import com.arboleda.footballapp.domain.usecases.fixtures.FixturesModule
import com.arboleda.footballapp.domain.usecases.fixtures.GetAllLiveFixtures
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val domainModule =
    module {
        // Fixtures
        factoryOf(::GetAllLiveFixtures)
        factoryOf(::FixturesModule)
    }
