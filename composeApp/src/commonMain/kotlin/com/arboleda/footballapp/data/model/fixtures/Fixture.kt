package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Fixture
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Fixture(
    @SerialName("date")
    val date: String,
    @SerialName("id")
    val id: Int,
    @SerialName("periods")
    val periods: Periods,
    @SerialName("referee")
    val referee: String?,
    @SerialName("status")
    val status: Status,
    @SerialName("timestamp")
    val timestamp: Int,
    @SerialName("timezone")
    val timezone: String,
    @SerialName("venue")
    val venue: Venue,
) {
    fun toDomain() =
        Fixture(
            date = date,
            id = id,
            periods = periods.toDomain(),
            referee = referee,
            status = status.toDomain(),
            timestamp = timestamp,
            timezone = timezone,
            venue = venue.toDomain(),
        )
}
