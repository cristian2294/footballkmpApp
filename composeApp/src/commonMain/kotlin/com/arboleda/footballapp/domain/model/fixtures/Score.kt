package com.arboleda.footballapp.domain.model.fixtures

data class Score(
    val extraTime: ExtraTime,
    val fullTime: FullTime,
    val halftime: Halftime,
    val penalty: Penalty,
)
