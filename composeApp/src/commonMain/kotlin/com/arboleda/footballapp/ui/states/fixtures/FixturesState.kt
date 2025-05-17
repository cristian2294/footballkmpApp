package com.arboleda.footballapp.ui.states.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Response

data class FixturesState(
    val response: List<Response> = emptyList(),
)
