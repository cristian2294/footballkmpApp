package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Parameters
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Parameters(
    @SerialName("live")
    val live: String?,
) {
    fun toDomain() = Parameters(live = live)
}
