package com.arboleda.footballapp.data.model.fixtures

import com.arboleda.footballapp.domain.model.fixtures.Time
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Time(
    @SerialName("elapsed")
    val elapsed: Int,
    @SerialName("extra")
    val extra: Int?,
) {
    fun toDomain() = Time(elapsed = elapsed, extra = extra)
}
