package com.arboleda.footballapp.di

import com.arboleda.footballapp.ui.viewmodel.fixtures.FixturesViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val uiModule =
    module {
        factoryOf(::FixturesViewModel)
    }
