package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Event
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Event(
    @SerialName("assist")
    val assist: Assist,
    @SerialName("comments")
    val comments: String?,
    @SerialName("detail")
    val detail: String?,
    @SerialName("player")
    val player: Player,
    @SerialName("team")
    val team: Team,
    @SerialName("time")
    val time: Time,
    @SerialName("type")
    val type: String?,
) {
    fun toDomain() =
        Event(
            assist = assist.toDomain(),
            comments = comments,
            detail = detail,
            player = player.toDomain(),
            team = team.toDomain(),
            time = time.toDomain(),
            type = type,
        )
}
