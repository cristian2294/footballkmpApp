package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Response
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Response(
    @SerialName("events")
    val events: List<Event>,
    @SerialName("fixture")
    val fixture: Fixture,
    @SerialName("goals")
    val goals: Goals,
    @SerialName("league")
    val league: League,
    @SerialName("score")
    val score: Score,
    @SerialName("teams")
    val teams: Teams,
) {
    fun toDomain() =
        Response(
            events = events.map { it.toDomain() },
            fixture = fixture.toDomain(),
            goals = goals.toDomain(),
            league = league.toDomain(),
            score = score.toDomain(),
            teams = teams.toDomain(),
        )
}
