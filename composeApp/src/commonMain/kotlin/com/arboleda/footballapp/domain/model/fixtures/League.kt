package com.arboleda.footballapp.domain.model.fixtures

data class League(
    val country: String,
    val flag: String?,
    val id: Int,
    val logo: String,
    val name: String,
    val season: Int,
    val round: String,
    val standings: Boolean,
)
