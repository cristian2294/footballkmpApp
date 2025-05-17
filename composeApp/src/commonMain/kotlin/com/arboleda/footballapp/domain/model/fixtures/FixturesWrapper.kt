package com.arboleda.footballapp.domain.model.fixtures

data class FixturesWrapper(
    val errors: List<String>? = emptyList(),
    val paging: Paging,
    val parameters: Parameters,
    val response: List<Response>,
    val results: Int,
)
