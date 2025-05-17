package com.arboleda.footballapp.ui.states.fixtures

import com.arboleda.footballapp.domain.model.fixtures.FixturesWrapper

sealed interface FixturesStateUI {
    data object Loading : FixturesStateUI

    data class Success(
        val fixtures: FixturesWrapper,
    ) : FixturesStateUI

    data class Error(
        val message: String,
    ) : FixturesStateUI
}
