package com.arboleda.footballapp.domain.model.fixtures

data class Response(
    val events: List<Event>,
    val fixture: Fixture,
    val goals: Goals,
    val league: League,
    val score: Score,
    val teams: Teams,
)
